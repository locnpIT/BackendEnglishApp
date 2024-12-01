package com.example.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.Models.ExamSet;
import com.example.project.Repository.ExamSetRepository;

@Service
public class ExamSetService {

	private final ExamSetRepository repository;
	
	public ExamSetService(ExamSetRepository repository) {
		this.repository = repository;
	}
	
	
	public List<ExamSet> getAllExamSet() {
		
		return this.repository.findAll();
	}
	
	public List<ExamSet> getExamSetByIdTypeOfExamSet(int id){
		return this.repository.getExamSetByIdTypeOfExamSet(id);
	}
	
	
}
