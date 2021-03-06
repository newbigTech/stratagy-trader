package com.zd.netty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zd.common.utils.StringUtils;
import com.zd.config.Global;
import com.zd.engine.market.MarketEventEngine;
import com.zd.engine.market.MarketEventHandler;
import com.zd.entity.CommandCode;
import com.zd.entity.NetInfo;
import com.zd.entity.SubMarketTypeEnum;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * 
 * @author user
 *
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {

	private final static Logger logger = LoggerFactory.getLogger(ServerHandler.class);

	Object o = new Object();

	/**
	 * 客户端建立连接
	 */
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("客户端与服务端连接开启");
		Global.clientChannelMap.put(ctx.channel().id().toString(), ctx);
	}

	/**
	 * 客户端断开连接
	 */
	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		// 移除连接
		logger.info("{} 断开连接", ctx.channel());
		Global.clientChannelMap.remove(ctx.channel().id().toString(), ctx);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		final String remoteAddress = RemotingUtil.parseRemoteAddress(ctx.channel());
		final String localAddress = RemotingUtil.parseLocalAddress(ctx.channel());
		logger.warn("ExceptionCaught in connection: local[{}], remote[{}], close the connection! Cause[{}:{}]",
				localAddress, remoteAddress, cause.getClass().getSimpleName(), cause.getMessage());
		ctx.channel().close();
	}

	/**
	 * 读取到消息
	 */
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		try {
			String s = null;
			if (msg instanceof ByteBuf) {
				ByteBuf bb = (ByteBuf) msg;
				byte[] b = new byte[bb.readableBytes()];
				bb.readBytes(b);
				s = new String(b, "UTF-8");
			} else if (msg != null) {
				s = msg.toString();
			}

			NetInfo ni = new NetInfo();
			ni.MyReadString(s.substring(s.indexOf(")") + 1, s.length()));

			// 请求二级行情
			if (CommandCode.MARKET02.equals(ni.code)) {
				// 判断该连接是否已经开启队列消费者
				MarketEventHandler handler = Global.client2EventHandlerMap.get(ctx.channel().id().toString());
				if (handler == null) {
					handler = MarketEventEngine.addHandler();
					handler.setCtx(ctx);
					Global.client2EventHandlerMap.put(ctx.channel().id().toString(), handler);
					Global.eventHandler2clientMap.put(handler.getId(), ctx);
				}

				// 订阅行情
				if (SubMarketTypeEnum.ALL.getCode().equals(ni.todayCanUse)) {
					// 订阅全部行情（暂不支持）
				} else if (SubMarketTypeEnum.ADD.getCode().equals(ni.todayCanUse) && StringUtils.isNotBlank(ni.infoT)) {
					// 追加订阅新的行情
					String[] symbols = ni.infoT.split(",");
					for (String symbol : symbols) {
						handler.subscribeEvent(symbol.split("@")[1]);
						Global.tradingService.subscribe(symbol.split("@")[1], "");
					}
				} else if (SubMarketTypeEnum.UNSUB.getCode().equals(ni.todayCanUse)) {
					// 退订行情
					if (StringUtils.isNotBlank(ni.infoT)) {
						String[] symbols = ni.infoT.split(",");
						for (String symbol : symbols) {
							handler.unsubscribeEvent(symbol.split("@")[1]);
						}
					} else {
						// 退订所有行情
						handler.getSubscribedEventSet().clear();
					}
				} else if (SubMarketTypeEnum.NEW.getCode().equals(ni.todayCanUse) && StringUtils.isNotBlank(ni.infoT)) {
					// 订阅新的行情
					handler.getSubscribedEventSet().clear();
					String[] symbols = ni.infoT.split(",");
					for (String symbol : symbols) {
						handler.subscribeEvent(symbol.split("@")[1]);
						Global.tradingService.subscribe(symbol.split("@")[1], "");
					}
				}

			}
		} catch (Exception e) {
			logger.error("接收行情订阅socket请求异常：{}", e.getMessage());
		}

	}

}
