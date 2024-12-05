package com.example.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.Models.UserExamSet;
import com.example.project.Repository.UserExamSetRepository;

@Service
public class UserExamSetService {

	
	private final UserExamSetRepository repo;
	
	public UserExamSetService(UserExamSetRepository repo) {
		this.repo = repo;
	}
	
	
	
	public UserExamSet createUserExamSet(UserExamSet user){
		return this.repo.save(user);
	}
	
	
	public List<UserExamSet> getAllHistoryOfUser(int id){
		return this.repo.getUserExamSetByIdUser(id);
	}
	
}
