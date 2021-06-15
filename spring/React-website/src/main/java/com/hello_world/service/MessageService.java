package com.hello_world.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello_world.domain.Message;
import com.hello_world.repository.MessageRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository mrepo;
	public Message fetchMessage() {
		return mrepo.fetachMessage();
	}
	
}
