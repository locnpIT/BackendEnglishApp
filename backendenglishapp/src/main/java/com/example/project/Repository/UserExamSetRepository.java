package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.Models.UserExamSet;

@Repository
public interface UserExamSetRepository extends JpaRepository<UserExamSet, Integer> {
	
	@Query("SELECT u FROM UserExamSet u WHERE u.user.id = :userId")
    List<UserExamSet> getUserExamSetByIdUser(@Param("userId") Integer userId);

}
