package com.example.project.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
	private final UserService userService;

	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
}
