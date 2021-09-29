package com.devlockin.multiplication.challenge.service;

import org.springframework.stereotype.Service;

import com.devlockin.multiplication.challenge.domain.ChallengeAttempt;
import com.devlockin.multiplication.challenge.helper.ChallengeAttemptDTO;

@Service
public class ChallengeServiceImpl implements ChallengeService {
	@Override
	public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {
		return null;
	}
}
