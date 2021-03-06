package com.devlockin.gamification.game.service;

import java.util.List;

import com.devlockin.gamification.game.helper.BadgeType;
import com.devlockin.gamification.game.helper.ChallengeSolvedEvent;

import lombok.Value;

public interface GameService {
	/**
	 * Process a new attempt from a given user.
	 ** 
	 * @param challenge the challenge data with user details, factors, etc.
	 *                  @return a {@link GameResult} object containing the new
	 *                  score and badge cards obtained
	 */
	GameResult newAttemptForUser(ChallengeSolvedEvent challenge);

	@Value
	class GameResult {
		int score;
		List<BadgeType> badges;
	}
}
