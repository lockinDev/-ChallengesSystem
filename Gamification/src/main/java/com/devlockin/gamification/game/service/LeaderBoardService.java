package com.devlockin.gamification.game.service;

import java.util.List;

import com.devlockin.gamification.game.helper.LeaderBoardRow;


public interface LeaderBoardService {

	/**
	 * @return the current leader board ranked from high to low score
	 */
	 public List<LeaderBoardRow> getCurrentLeaderBoard();
	
}
