package com.example.project.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.User;
import com.example.project.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
//	
	private final UserService userService;

	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	@GetMapping("/user/profile")
	public User getProfileUser(@RequestHeader("Authorization") String jwt) {
		
		User user = this.userService.findUserByJwt(jwt);
		user.setPassword(null);
		
		return user;
	}
	
}
