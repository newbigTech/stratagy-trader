package com.zd.business.engine.event;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public abstract class ZdEventDynamicHandlerAbstract<T> implements ZdEventDynamicHandler<T>{

	protected final CountDownLatch shutdownLatch = new CountDownLatch(1);
	protected List<String> subscribedEventList = new ArrayList<>(); 
	protected Set<String> subscribedEventSet = new HashSet<>();

	
	@Override
	public void onStart() {

	}

	@Override
	public void onShutdown() {
		shutdownLatch.countDown();
	}
	
	@Override
	public void awaitShutdown() throws InterruptedException {
		shutdownLatch.await();
	}

	@Override
	public List<String> getSubscribedEventList() {
		return subscribedEventList;
	}
	
	@Override
	public Set<String> getSubscribedEventSet() {
		return subscribedEventSet;
	}
	
	@Override
	public void subscribeEvent(String event) {
		subscribedEventList.add(event);
		subscribedEventSet.add(event);
	}
	
	@Override
	public void unsubscribeEvent(String event) {
		subscribedEventList.remove(event);
		if(!subscribedEventList.contains(event)) {
			subscribedEventSet.remove(event);
		}
			
	}
	
}
