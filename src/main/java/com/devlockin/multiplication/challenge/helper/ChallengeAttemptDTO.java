package com.devlockin.multiplication.challenge.helper;

import lombok.Value;
/**
* Attempt coming from the user
*/
@Value
public class ChallengeAttemptDTO {
    int factorA, factorB;
    String userAlias;
    int guess;
}
