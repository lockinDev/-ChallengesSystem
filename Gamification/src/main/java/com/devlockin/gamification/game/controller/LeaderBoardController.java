package com.devlockin.gamification.game.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.devlockin.gamification.game.helper.LeaderBoardRow;
import com.devlockin.gamification.game.service.LeaderBoardService;

import java.util.List;

/**
 * This class implements a REST API for the Gamification LeaderBoard service.
 */

@RestController
@RequestMapping("/leaders")
@RequiredArgsConstructor
public class LeaderBoardController {
	private final LeaderBoardService leaderBoardService;

	@GetMapping
	public List<LeaderBoardRow> getLeaderBoard() {
		return leaderBoardService.getCurrentLeaderBoard();
	}
}
