package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Models.User;
import java.util.Optional;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public Optional<User> findById(Long id);
	
	public User findByEmail(String email);

}
