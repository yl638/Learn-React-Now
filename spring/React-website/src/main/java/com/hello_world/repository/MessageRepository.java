package com.hello_world.repository;

import org.springframework.stereotype.Repository;
import com.hello_world.domain.Message;
@Repository
public class MessageRepository {
	private Message theMessage = new Message(0, null);;
	
	public Message fetachMessage() {
		theMessage.setId(1);
		theMessage.setTheMessage("Hello World");
		return theMessage;
	}
}
