package com.example.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.Models.TypeOfExamSet;
import com.example.project.Repository.TypeOfExamSetRepository;

@Service
public class TypeOfExamSetService {

	private final TypeOfExamSetRepository repository;
	
	public TypeOfExamSetService(TypeOfExamSetRepository repository) {
		this.repository = repository;
	}
	
	public List<TypeOfExamSet> getAllTypeOfExamSet(){
		return this.repository.findAll();
	}
	
	
	
}
