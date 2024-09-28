package com.example.project.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.DTO.RegisterDTO;
import com.example.project.Models.User;
import com.example.project.Service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private final UserService userService;
	
	public AuthController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/register")
	public User createUser(@RequestBody RegisterDTO req)  throws Exception {
		User createUser = this.userService.registerUser(req);
		return createUser;
	}
	
}
