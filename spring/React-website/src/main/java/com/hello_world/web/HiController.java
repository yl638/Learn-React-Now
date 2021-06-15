package com.hello_world.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello_world.domain.Message;
import com.hello_world.service.MessageService;

//different from @Controller, as controller works more closely with MVC (Model View Controller)
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HiController {
	
	//Format
	//Front End------>HTTPRequest ------> Controller -----> Service -----> Repository------>Service ------->Controller -----> Front-End
	@Autowired
	private MessageService Mservice;
	
	@GetMapping("/api/Messages")
	public ResponseEntity<?> GetMessage() {
		Message Message = Mservice.fetchMessage();
		return ResponseEntity.ok(Message);
		//return ResponseEntity.status(HttpStatus.OK).body(Message);
	}
}
