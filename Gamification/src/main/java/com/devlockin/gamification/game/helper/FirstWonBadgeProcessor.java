package com.devlockin.gamification.game.helper;

import org.springframework.stereotype.Component;

import com.devlockin.gamification.game.domain.ScoreCard;

import java.util.List;
import java.util.Optional;

@Component
public class FirstWonBadgeProcessor implements BadgeProcessor {
	@Override
	public Optional<BadgeType> processForOptionalBadge(int currentScore, List<ScoreCard> scoreCardList,
			ChallengeSolvedEvent solved) {

		return scoreCardList.size() == 1 ? Optional.of(BadgeType.FIRST_WON) : Optional.empty();
	}

	@Override
	public BadgeType badgeType() {
		return BadgeType.FIRST_WON;
	}
}