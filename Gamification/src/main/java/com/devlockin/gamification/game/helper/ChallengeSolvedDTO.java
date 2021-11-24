package com.devlockin.gamification.game.helper;

import lombok.Value;

@Value
public class ChallengeSolvedDTO {
	long attemptId;
	boolean correct;
	int factorA;
	int factorB;
	long userId;
	String userAlias;
}
