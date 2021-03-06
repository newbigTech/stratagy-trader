package com.zd.business.constant;

public enum MessageConst {

	STRATAGYSTART("00001","策略开始"),
	STRATAGYPAUSE("00002","策略暂停"),
	STRATAGYSTOP("00003","策略停止"),
	STRATAGYSTRIKE("00004","策略触发"),
	CONSUMERFULL("90001","策略过载"),
	STRATAGYNOTEXIST("90002","策略不存在"),
	STRATAGYORDERNOTEXIST("90003","策略下单不存在"),
	STRATAGYARBITRAGENOTEXIST("90004","套利策略不存在");
	
	private String code;
	private String msg;
	
	private MessageConst(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
