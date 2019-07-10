package com.wordpython.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordpython.po.Users;
import com.wordpython.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	@ResponseBody
	public String register() {
		System.out.println("1111alaaaa");
		Users user = userService.registerUser("姚群弟", "aaaaaa");
		return ""+user;
	}
}
