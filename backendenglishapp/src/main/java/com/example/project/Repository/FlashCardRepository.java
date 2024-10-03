package com.example.project.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Models.FlashCard;

@Repository
public interface FlashCardRepository extends JpaRepository<FlashCard, Long> {

	public Optional<FlashCard> findById(Long id);
	
	
	public List<FlashCard> findAll();
	
	
	
	
	
}
