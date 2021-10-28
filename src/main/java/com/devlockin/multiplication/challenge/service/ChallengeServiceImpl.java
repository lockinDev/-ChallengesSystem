package com.devlockin.multiplication.challenge.service;

import org.springframework.stereotype.Service;

import com.devlockin.multiplication.challenge.domain.ChallengeAttempt;
import com.devlockin.multiplication.challenge.helper.ChallengeAttemptDTO;
import com.devlockin.multiplication.challenge.repository.ChallengeAttemptRepository;
import com.devlockin.multiplication.user.domain.User;
import com.devlockin.multiplication.user.domain.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChallengeServiceImpl implements ChallengeService {
	
	private final UserRepository userRepository;
    private final ChallengeAttemptRepository attemptRepository;
	
	@Override
	public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {
		boolean isCorrect = attemptDTO.getGuess() == attemptDTO.getFactorA() * attemptDTO.getFactorB();
		// We don't use identifiers for now
		User user = new User(null, attemptDTO.getUserAlias());

		// Builds the domain object. Null id for now.
		ChallengeAttempt checkedAttempt = new ChallengeAttempt(null, null, attemptDTO.getFactorA(),
				attemptDTO.getFactorB(), attemptDTO.getGuess(), isCorrect);
		return checkedAttempt;

	}
}
