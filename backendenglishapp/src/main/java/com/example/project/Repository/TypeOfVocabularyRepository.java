package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Models.TypeOfVocabulary;

@Repository
public interface TypeOfVocabularyRepository extends JpaRepository<TypeOfVocabulary, Long>{

	
	
}
