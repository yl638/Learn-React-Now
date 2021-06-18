package com.hello_world.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hello_world.domain.Message;
import com.hello_world.service.MessageService;

//different from @Controller, as controller works more closely with MVC (Model View Controller)
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MessageController {
	
	//Format
	//Front End------>HTTPRequest ------> Controller -----> Service -----> Repository------>Service ------->Controller -----> Front-End
	@Autowired
	private MessageService Mservice;
	
	@GetMapping("/Messages")
	public ResponseEntity<?> GetAllMessage() {
		List<Message> AllMessage = Mservice.fetchAllMessage();
		return ResponseEntity.ok(AllMessage);
		//return ResponseEntity.status(HttpStatus.OK).body(Message);
	}
	
	@GetMapping("/Messages/{id}")
	public ResponseEntity<?> GetMessage(@PathVariable("id") int id){
		Message Message = Mservice.fetchMessage(id);
		return ResponseEntity.ok(Message);
	}
	
	@DeleteMapping("/Messages/{id}")
	public ResponseEntity<?> DeleteMessage(@PathVariable("id") int id){
		Mservice.deleteMessage(id);
		return ResponseEntity.ok(null);
	}

}
