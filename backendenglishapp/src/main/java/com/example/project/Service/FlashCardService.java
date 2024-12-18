package com.example.project.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.project.Models.FlashCard;
import com.example.project.Repository.FlashCardRepository;

@Service
public class FlashCardService {

	private final FlashCardRepository flashCardRepository;
	
	public FlashCardService(FlashCardRepository flashCardRepository) {
		this.flashCardRepository = flashCardRepository;
	}
	
	
	public FlashCard findCardById(Long id) throws Exception{
		Optional<FlashCard> optCard = this.flashCardRepository.findById(id);
		
		if(!optCard.isPresent()) {
			throw new Exception("Card is not exist");
		}
		
		FlashCard flashCard = optCard.get();		
		return flashCard;
	}
	
	public List<FlashCard> findAllFlashCard(){
		return this.flashCardRepository.findAll();
	}
	
	public FlashCard createCard(FlashCard flashCard) {
		return this.flashCardRepository.save(flashCard);
	}
	
	

}
