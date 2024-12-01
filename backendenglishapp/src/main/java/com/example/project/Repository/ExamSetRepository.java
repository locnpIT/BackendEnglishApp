package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.Models.ExamSet;

@Repository
public interface ExamSetRepository extends JpaRepository<ExamSet, Integer>{
	

	@Query("SELECT e FROM ExamSet e WHERE e.typeOfExamSet.id = :id")
	List<ExamSet> getExamSetByIdTypeOfExamSet(@Param("id") int id);

}
