package com.example.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.Models.MiniGame;
import com.example.project.Repository.MiniGameRepository;
import com.example.project.Request.MiniGameRequest;
import com.example.project.Response.MiniGameResponse;

@Service
public class MiniGameService {
	
	private final MiniGameRepository miniGameRepository;
	
	public MiniGameService(MiniGameRepository miniGameRepository) {
		this.miniGameRepository = miniGameRepository;
	}
	
	public MiniGame getMiniGameById(Long id) {
		
		return this.miniGameRepository.findById(id).get();
		
	}
	
	public MiniGameResponse isCorrect(MiniGameRequest req, Long idQuestion) {
		
		MiniGame question = this.getMiniGameById(idQuestion);
		MiniGameResponse response = new MiniGameResponse();
		if(!req.getRequest().equalsIgnoreCase(question.getAnswer())) {
			response.setResponse("Bạn đã trả lời sai");
		}
		else {
			response.setResponse("Bạn đã trả lời đúng");
		}
		
		return response;
		
	}
	
	public MiniGame saveMiniGame(MiniGame miniGame) {
		return this.miniGameRepository.save(miniGame);
	}
	
	public List<MiniGame> findAllMiniGame(){
		return this.miniGameRepository.findAll();
	}
	
	
	
}
