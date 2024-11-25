package com.example.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.MiniGame;
import com.example.project.Request.MiniGameRequest;
import com.example.project.Response.MiniGameResponse;
import com.example.project.Service.MiniGameService;

@RestController
@RequestMapping("/api")
public class MiniGameController {

	private final MiniGameService miniGameService;
	
	public MiniGameController(MiniGameService miniGameService) {
		this.miniGameService = miniGameService;
	}
	
	@PostMapping("/minigames")
	public MiniGame createMiniGame(@RequestBody MiniGame miniGame) {
		return this.miniGameService.saveMiniGame(miniGame);
	}
	
	@GetMapping("/minigames")
	public List<MiniGame> getAllMiniGame() {
		return this.miniGameService.findAllMiniGame();
	}
	
	@PostMapping("/minigames/{id}")
	public MiniGameResponse answerQuestion(@RequestBody MiniGameRequest req, @PathVariable Long id) {
		return this.miniGameService.isCorrect(req, id);
	}
	
	
	@GetMapping("/minigames/{id}")
	public MiniGame getMiniGameById(@PathVariable Long id) {
		return this.miniGameService.getMiniGameById(id);
	}
	
}
