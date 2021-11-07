package com.devlockin.multiplication.challenge.service;

import java.util.List;

import com.devlockin.multiplication.challenge.domain.ChallengeAttempt;
import com.devlockin.multiplication.challenge.helper.ChallengeAttemptDTO;

public interface ChallengeService {
    /**
     * Verifies if an attempt coming from the presentation layer is correct or not.
     *
     * @return the resulting ChallengeAttempt object
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
    
    /**
     * Gets the statistics for a given user.
     *
     * @param userAlias the user's alias
     * @return a list of the last 10 {@link ChallengeAttempt}
     * objects created by the user.
     */
    List<ChallengeAttempt> getStatsForUser(String userAlias);
}
