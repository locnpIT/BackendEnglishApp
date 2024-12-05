package com.example.project.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ExamSet")
public class ExamSet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "examSet")
	@JsonIgnore
	private List<Questions> listQuestions;

	
	@ManyToOne
	@JoinColumn(name = "TypeOfExamSet_Id")
	@JsonIgnore
	private TypeOfExamSet typeOfExamSet;
	
	@OneToMany(mappedBy = "examSet")
	@JsonIgnore
	private List<UserExamSet> listUserExamSet;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Questions> getListQuestions() {
		return listQuestions;
	}

	public void setListQuestions(List<Questions> listQuestions) {
		this.listQuestions = listQuestions;
	}

	public TypeOfExamSet getTypeOfExamSet() {
		return typeOfExamSet;
	}

	public void setTypeOfExamSet(TypeOfExamSet typeOfExamSet) {
		this.typeOfExamSet = typeOfExamSet;
	}

	public List<UserExamSet> getListUserExamSet() {
		return listUserExamSet;
	}

	public void setListUserExamSet(List<UserExamSet> listUserExamSet) {
		this.listUserExamSet = listUserExamSet;
	}
	
	
	
	
	
	

}