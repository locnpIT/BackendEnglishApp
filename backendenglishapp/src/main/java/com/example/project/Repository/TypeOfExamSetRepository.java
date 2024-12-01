package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Models.TypeOfExamSet;

@Repository
public interface TypeOfExamSetRepository extends JpaRepository<TypeOfExamSet, Integer> {

	
	public List<TypeOfExamSet> findAll();
	
}
