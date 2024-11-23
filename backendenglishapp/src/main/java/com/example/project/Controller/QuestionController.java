package com.example.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.Questions;
import com.example.project.Service.QuestionService;

@RestController
@RequestMapping("/api")
public class QuestionController {

	private final QuestionService questionService;
	
	public QuestionController(QuestionService questionService) {
		this.questionService = questionService;
	}
	
	@GetMapping("/questions")
	public List<Questions> getAllQuestion(){
		return this.questionService.getAllQuestions();
	}
	
	@GetMapping("/questions/{id}")
	public List<Questions> getQuestionsByIdExamSet(@PathVariable int id){
		return this.questionService.getQuestionsByIdExamSet(id);
	}
	

	
	
}
