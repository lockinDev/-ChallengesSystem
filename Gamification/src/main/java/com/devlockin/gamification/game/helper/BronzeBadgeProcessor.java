package com.devlockin.gamification.game.helper;

import org.springframework.stereotype.Component;

import com.devlockin.gamification.game.domain.ScoreCard;

import java.util.List;
import java.util.Optional;

@Component
public class BronzeBadgeProcessor implements BadgeProcessor {
	@Override
	public Optional<BadgeType> processForOptionalBadge(int currentScore, List<ScoreCard> scoreCardList,
			ChallengeSolvedDTO solved) {
		return currentScore > 50 ? Optional.of(BadgeType.BRONZE) : Optional.empty();
	}

	@Override
	public BadgeType badgeType() {
		return BadgeType.BRONZE;
	}
}
