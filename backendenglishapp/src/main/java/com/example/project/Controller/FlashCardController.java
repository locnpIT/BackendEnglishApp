package com.example.project.Controller;


import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.FlashCard;
import com.example.project.Service.FlashCardService;

@RestController
@RequestMapping("/api")
public class FlashCardController {

	private final FlashCardService flashCardService;
	
	public FlashCardController(FlashCardService flashCardService) {
		this.flashCardService = flashCardService;
	}
	
	@PostMapping("/card/create")
	public FlashCard createCard(@RequestBody FlashCard cardReq) {
		return this.flashCardService.createCard(cardReq);
	}
	
	@GetMapping("/card/all")
	public List<FlashCard> getAllFlashCard(){
		return this.flashCardService.findAllFlashCard();
	}
	
	@GetMapping("/card/{id}")
	public FlashCard findCardById(@PathVariable Long id) throws Exception{
		return this.flashCardService.findCardById(id);
	}
	
	
}
