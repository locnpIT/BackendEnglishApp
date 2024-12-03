package com.example.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.ExamSet;
import com.example.project.Models.Questions;
import com.example.project.Models.TypeOfExamSet;
import com.example.project.Service.ExamSetService;
import com.example.project.Service.QuestionService;
import com.example.project.Service.TypeOfExamSetService;

@RestController
@RequestMapping("/api")
public class ExerciseController {

	private final TypeOfExamSetService typeOfExamSetService;
	private final ExamSetService examSetService;
	private final QuestionService questionService;
	
	public ExerciseController(TypeOfExamSetService typeOfExamSetService
			, ExamSetService examSetService,
			QuestionService questionService) {
		this.typeOfExamSetService = typeOfExamSetService;
		this.examSetService = examSetService;
		this.questionService = questionService;
	}
	
	@GetMapping("/types")
	public List<TypeOfExamSet> getAllTypeOfExamSet(){
		return this.typeOfExamSetService.getAllTypeOfExamSet();
	}
	
	@GetMapping("/types/examsets")
	public List<ExamSet> getAllExamSet(){
		return this.examSetService.getAllExamSet();
	}
	
	@GetMapping("/types/{id}/examsets")
	public List<ExamSet> getExamSetByIdTypeOfExamSet(@PathVariable(name = "id") int id){
		return this.examSetService.getExamSetByIdTypeOfExamSet(id);
	}
	
	@GetMapping("/examsets/{id}")
	public List<Questions> getQuestionByIdExamSet(@PathVariable() int id) {
		
		return this.questionService.getQuestionsByIdExamSet(id);
	}
	
	@GetMapping("/examsets/nums/{id}")
	public int getNumberOfQuestionFromExamSet(@PathVariable int id) {
		return this.questionService.getNumbersOfQuestionFromExamSet(id);
	}
	
	
}
