package com.devlockin.multiplication.challenge.service;

import org.springframework.stereotype.Service;

import com.devlockin.multiplication.challenge.domain.Challenge;

import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {
	private final Random random;

	ChallengeGeneratorServiceImpl() {
		this.random = new Random();
	}

	public ChallengeGeneratorServiceImpl(final Random random) {
		this.random = random;
	}

	@Override
	public Challenge randomChallenge() {
		return null;
	}
}