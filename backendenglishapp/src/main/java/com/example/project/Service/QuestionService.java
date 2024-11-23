package com.example.project.Service;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Service;

import com.example.project.Models.Questions;
import com.example.project.Repository.QuestionRepository;
import com.example.project.Response.QuestionResponse;

@Service
public class QuestionService {

	private final QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public List<Questions> getAllQuestions(){
		return this.questionRepository.findAll();
	}
	
	public List<Questions> getQuestionsByIdExamSet(int id){
		return this.questionRepository.getQuestionByIdExamSet(id);
	}
	
	
	public QuestionResponse mapQuestionToRepsonse(Questions question) {
		
		QuestionResponse response = new QuestionResponse();
		response.setName(question.getName());
		response.setOption1(question.getOption1());
		response.setOption2(question.getOption2());
		response.setOption3(question.getOption3());
		response.setOption4(question.getOption4());
		response.setSound(question.getSound());
		response.setCorrectAnswer(question.getCorrectAnswer());
		response.setExplainCorrectAnswer(question.getExplainCorrectAnswer());
		
		return response;
		
	}
	
	
}
