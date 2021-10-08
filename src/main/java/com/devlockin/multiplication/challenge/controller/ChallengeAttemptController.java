package com.devlockin.multiplication.challenge.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlockin.multiplication.challenge.service.ChallengeService;
/**
* This class provides a REST API to POST the attempts from users.
*/
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/attempts")
public class ChallengeAttemptController {
	
	private final ChallengeService challengeService;

}
