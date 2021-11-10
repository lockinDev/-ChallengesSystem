package com.devlockin.test.multiplication.challenge.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.devlockin.multiplication.challenge.domain.ChallengeAttempt;
import com.devlockin.multiplication.challenge.helper.ChallengeAttemptDTO;
import com.devlockin.multiplication.challenge.service.ChallengeService;
import com.devlockin.multiplication.challenge.service.ChallengeServiceImpl;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceTest {
	private ChallengeService challengeService;

	@BeforeEach
	public void setUp() {
		//hallengeService = new ChallengeServiceImpl();
	}

	@Test
	public void checkCorrectAttemptTest() {
		// given
		ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "test", 3000);
		// when
		ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);
		// then
		then(resultAttempt.isCorrect()).isTrue();
	}

	@Test
	public void checkWrongAttemptTest() {
		// given
		ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "test", 5000);
		// when
		ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);
		// then
		then(resultAttempt.isCorrect()).isFalse();
	}
}
