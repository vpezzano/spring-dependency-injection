package com.journaldev.spring.di.consumer;

import com.journaldev.spring.di.services.MessageService;

public class MyXMLApplication {

	private MessageService service;

	// Constructor-based dependency injection
	// public MyXMLApplication(MessageService svc) {
	// this.service = svc;
	// }

	// Setter-based dependency injection
	public void setService(MessageService svc) {
		this.service = svc;
	}

	public boolean processMessage(String msg, String rec) {
		// some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
}