package com.ft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ft.entity.User;

@RestController
public class UserController {
	
	@RequestMapping(value="/user")
	public User getUser(){
		User user = new User();
		
		user.setUsername("tadiyu");
		
		return user;
	}

}
