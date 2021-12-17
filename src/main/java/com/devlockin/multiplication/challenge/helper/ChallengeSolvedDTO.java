package com.devlockin.multiplication.challenge.helper;

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
