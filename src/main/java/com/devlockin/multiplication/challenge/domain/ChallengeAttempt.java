package com.devlockin.multiplication.challenge.domain;

import lombok.*;
import javax.persistence.*;

import com.devlockin.multiplication.user.domain.User;

/**
* Identifies the attempt from a {@link User} to solve a challenge.
*/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeAttempt {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
