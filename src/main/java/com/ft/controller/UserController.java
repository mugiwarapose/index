package com.ft.controller;

import com.ft.annotation.Token;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ft.entity.User;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@RequestMapping(value="/user")
	public User getUser(){
		User user = new User();
		
		user.setUsername("tadiyu");
		
		return user;
	}


	@RequestMapping(value = "/login" ,method = RequestMethod.GET)
	@Token(need = true)
	public String getLoginPage(Model model, HttpSession session){

		return "login";
	}



}
