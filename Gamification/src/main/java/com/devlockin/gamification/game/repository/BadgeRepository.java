package com.devlockin.gamification.game.repository;

import org.springframework.data.repository.CrudRepository;

import com.devlockin.gamification.game.domain.BadgeCard;

import java.util.List;

public interface BadgeRepository extends CrudRepository<BadgeCard, Long> {
	/**
	 * Retrieves all BadgeCards for a given user.
	 *
	 * @param userId the id of the user to look for BadgeCards
	 * @return the list of BadgeCards, ordered by most recent first.
	 */
	List<BadgeCard> findByUserIdOrderByBadgeTimestampDesc(Long userId);
}