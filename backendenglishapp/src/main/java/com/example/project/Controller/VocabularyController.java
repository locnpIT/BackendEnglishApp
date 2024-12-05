package com.example.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.TypeOfVocabulary;
import com.example.project.Models.Vocabulary;
import com.example.project.Service.TypeOfVocabularyService;
import com.example.project.Service.VocabularyService;

@RestController
@RequestMapping("/api")
public class VocabularyController {

	private final TypeOfVocabularyService tovs;
	private final VocabularyService vs;
	
	public VocabularyController(TypeOfVocabularyService tovs,VocabularyService vs) {
		this.tovs = tovs;
		this.vs = vs;
	}
	
	@GetMapping("/vocabulary")
	public List<TypeOfVocabulary> getAllTypeOfVocabulary(){
		return this.tovs.getAllTypeOfVocabularies();
	}
	
	@GetMapping("/vocabulary/{id}")
	public List<Vocabulary> getAllVocabularyByIdType(@PathVariable Long id){
		return this.vs.getAllVocabularyByIdType(id);
	}
	
	
	
}
