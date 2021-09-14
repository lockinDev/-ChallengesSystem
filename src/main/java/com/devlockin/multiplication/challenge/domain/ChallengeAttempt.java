package com.devlockin.multiplication.challenge.domain;

import lombok.*;
/**
* Identifies the attempt from a {@link User} to solve a challenge.
*/
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChallengeAttempt {
    private Long id;
    private Long userId;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
