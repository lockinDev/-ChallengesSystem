package com.devlockin.gamification.game.helper;

import java.util.List;
import java.util.Optional;

import com.devlockin.gamification.game.domain.ScoreCard;


public interface BadgeProcessor {
	 /**
	 * Processes some or all of the passed parameters and decides if the user
	 * is entitled to a badge.
	 *
	 * @return a BadgeType if the user is entitled to this badge, otherwise empty
	 */
	 Optional<BadgeType> processForOptionalBadge(
	 int currentScore,
	 List<ScoreCard> scoreCardList,
	 ChallengeSolvedEvent solved);
	 /**
	 * @return the BadgeType object that this processor is handling. You can use
	 * it to filter processors according to your needs.
	 */
	 BadgeType badgeType();
	}
