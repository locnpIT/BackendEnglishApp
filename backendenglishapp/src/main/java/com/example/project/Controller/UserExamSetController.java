package com.example.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.UserExamSet;
import com.example.project.Service.UserExamSetService;

@RestController
@RequestMapping("/api")
public class UserExamSetController {

	private final UserExamSetService service;
	
	public UserExamSetController(UserExamSetService service) {
		this.service = service;
	}
	
	@PostMapping("/history/create")
	public UserExamSet createHistory(@RequestBody UserExamSet history) {
		return this.service.createUserExamSet(history);
	}
	
	@GetMapping("/history/{id}")
	public List<UserExamSet> getHistoryOfUser(@PathVariable int id){
		return this.service.getAllHistoryOfUser(id);
	}
	
	
}
