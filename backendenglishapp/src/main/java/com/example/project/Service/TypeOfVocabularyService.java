package com.example.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.Models.TypeOfVocabulary;
import com.example.project.Repository.TypeOfVocabularyRepository;

@Service
public class TypeOfVocabularyService {
	
	private final TypeOfVocabularyRepository repo;
	
	
	public TypeOfVocabularyService(TypeOfVocabularyRepository repo) {
		this.repo = repo;
	}
	
	public List<TypeOfVocabulary> getAllTypeOfVocabularies(){
		return this.repo.findAll();
	}
	

}
