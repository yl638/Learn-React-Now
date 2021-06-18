package com.hello_world.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Message {
	
	@Id
	@Column
	private int id;
	@Column
	private String theMessage;
	
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
