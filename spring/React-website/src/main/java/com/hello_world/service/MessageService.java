package com.hello_world.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello_world.domain.Message;
import com.hello_world.repository.MessageRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository mrepo;
	
	
	public List<Message> fetchAllMessage() {
		List<Message> messages = new ArrayList<Message>();
		mrepo.findAll().forEach(message-> messages.add(message));
		return messages;
	}
	
	public Message fetchMessage(int id) {
		return mrepo.findById(id).get();
	}
	
	public void deleteMessage(int id) {
		mrepo.deleteById(id);
	}
	
	public void saveOrUpdate(Message message) {
		mrepo.save(message);
		}
	}
