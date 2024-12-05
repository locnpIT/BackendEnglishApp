package com.example.project.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vocabulary")
public class Vocabulary {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String iconRes;
	private String word;
	private String definition;
	private String example;
	    
	@ManyToOne
	@JoinColumn(name = "TypeOfVocabulary_id")
	@JsonIgnore
	private TypeOfVocabulary typeOfVocabulary;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getIconRes() {
		return iconRes;
	}

	public void setIconRes(String iconRes) {
		this.iconRes = iconRes;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public TypeOfVocabulary getTypeOfVocabulary() {
		return typeOfVocabulary;
	}

	public void setTypeOfVocabulary(TypeOfVocabulary typeOfVocabulary) {
		this.typeOfVocabulary = typeOfVocabulary;
	}

	
	
	
	
	
	
	
	
	
	
}
