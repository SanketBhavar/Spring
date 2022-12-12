package com.spring.ioc;

public class BSNL implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using BSNL Sim");
	}
	
	@Override
	public void data() {
		System.out.println("Browsing internet using Airtel Sim");
	}
}
