package com.devlockin.multiplication.challenge.service;

import com.devlockin.multiplication.challenge.domain.ChallengeAttempt;
import com.devlockin.multiplication.challenge.helper.ChallengeAttemptDTO;

public interface ChallengeService {
    /**
     * Verifies if an attempt coming from the presentation layer is correct or not.
     *
     * @return the resulting ChallengeAttempt object
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
}
