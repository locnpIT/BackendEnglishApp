package com.example.project.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TypeOfExamSet")
public class TypeOfExamSet {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nameOfExamSet;
	
	private String image;
	
	@OneToMany(mappedBy = "typeOfExamSet")
	private List<ExamSet> listExamSet;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfExamSet() {
		return nameOfExamSet;
	}

	public void setNameOfExamSet(String nameOfExamSet) {
		this.nameOfExamSet = nameOfExamSet;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<ExamSet> getListExamSet() {
		return listExamSet;
	}

	public void setListExamSet(List<ExamSet> listExamSet) {
		this.listExamSet = listExamSet;
	}
	
	
	
	
	
	
	
}
