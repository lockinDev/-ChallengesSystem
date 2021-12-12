package com.devlockin.gamification.game.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.devlockin.gamification.game.helper.ChallengeSolvedDTO;
import com.devlockin.gamification.game.service.GameService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/attempts")
@RequiredArgsConstructor
public class GameController {
	private final GameService gameService;

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	void postResult(@RequestBody ChallengeSolvedDTO dto) {
		gameService.newAttemptForUser(dto);
	}
}
