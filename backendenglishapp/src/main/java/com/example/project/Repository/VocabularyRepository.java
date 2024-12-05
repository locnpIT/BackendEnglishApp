package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.Models.Vocabulary;

@Repository
public interface VocabularyRepository extends JpaRepository<Vocabulary, Long> {
	
	
	@Query("SELECT v FROM Vocabulary v WHERE v.typeOfVocabulary.id = :typeId")
    List<Vocabulary> findVocabulariesByTypeId(@Param("typeId") Long typeId);
	
	
	
}
