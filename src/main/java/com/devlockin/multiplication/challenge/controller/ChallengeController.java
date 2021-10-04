package com.devlockin.multiplication.challenge.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import com.devlockin.multiplication.challenge.domain.Challenge;
import com.devlockin.multiplication.challenge.service.ChallengeGeneratorService;

/**
 * This class implements a REST API to get random challenges
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/challenges")
class ChallengeController {
	private final ChallengeGeneratorService challengeGeneratorService;

	@GetMapping("/random")
	Challenge getRandomChallenge() {
		Challenge challenge = challengeGeneratorService.randomChallenge();
		log.info("Generating a random challenge: {}", challenge);
		return challenge;
	}
}
