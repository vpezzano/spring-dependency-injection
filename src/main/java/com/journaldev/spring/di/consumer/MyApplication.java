package com.journaldev.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.journaldev.spring.di.services.MessageService;

@Component
public class MyApplication {

	// Field-based dependency injection
	//@Autowired
	private MessageService service;

	public MyApplication() {
		System.out.println("Component " + this.getClass().getSimpleName() + " created.");
	}

	// Constructor-based dependency injection
	// @Autowired
	// public MyApplication(MessageService svc){
	// this.service=svc;
	// }
	
	@Autowired
	public void setService(MessageService svc) {
		this.service = svc;
	}

	public boolean processMessage(String msg, String rec) {
		// some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
}