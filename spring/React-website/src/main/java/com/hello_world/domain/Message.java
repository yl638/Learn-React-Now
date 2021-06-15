package com.hello_world.domain;

public class Message {
	
	
	private int id;
	private String theMessage;
	
	public Message(int id, String theMessage) {
		this.id = id;
		this.theMessage = theMessage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheMessage() {
		return theMessage;
	}
	public void setTheMessage(String theMessage) {
		this.theMessage = theMessage;
	}
}
