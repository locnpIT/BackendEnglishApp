package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.Models.Questions;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Long> {
	
	
	 @Query("SELECT q FROM Questions q WHERE q.examSet.id = :idExamSet")
	 public List<Questions> getQuestionByIdExamSet(@Param("idExamSet") int idExamSet);

}
