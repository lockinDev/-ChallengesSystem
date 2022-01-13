package com.devlockin.test.multiplication.challenge.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.devlockin.multiplication.challenge.domain.ChallengeAttempt;
import com.devlockin.multiplication.challenge.helper.ChallengeAttemptDTO;
import com.devlockin.multiplication.challenge.helper.ChallengeEventPub;
import com.devlockin.multiplication.challenge.helper.GamificationServiceClient;
import com.devlockin.multiplication.challenge.repository.ChallengeAttemptRepository;
import com.devlockin.multiplication.challenge.service.ChallengeService;
import com.devlockin.multiplication.challenge.service.ChallengeServiceImpl;
import com.devlockin.multiplication.user.domain.User;
import com.devlockin.multiplication.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;


public class ChallengeServiceTest {
	
	private ChallengeService challengeService;
    @Mock
    private UserRepository userRepository;
    @Mock
    private ChallengeAttemptRepository attemptRepository;
    @Mock
    private ChallengeEventPub challengeEventPub;
    
    @BeforeEach
    public void setUp() {
        challengeService = new ChallengeServiceImpl(
                userRepository,
                attemptRepository,
                challengeEventPub
        );
        given(attemptRepository.save(any()))
                .will(returnsFirstArg());
    }
    
    @Test
    public void checkCorrectAttemptTest() {
        // given
        ChallengeAttemptDTO attemptDTO =
                new ChallengeAttemptDTO(50, 60, "test", 3000);
        // when
        ChallengeAttempt resultAttempt =
                challengeService.verifyAttempt(attemptDTO);
        // then
        then(resultAttempt.isCorrect()).isTrue();
        // newly added lines
        verify(userRepository).save(new User("test"));
        verify(attemptRepository).save(resultAttempt);
    }
    
    @Test
    public void checkExistingUserTest() {
        // given
        User existingUser = new User(1L, "test");
        given(userRepository.findByAlias("test"))
                .willReturn(Optional.of(existingUser));
        ChallengeAttemptDTO attemptDTO =
                new ChallengeAttemptDTO(50, 60, "test", 5000);
        // when
        ChallengeAttempt resultAttempt =
                challengeService.verifyAttempt(attemptDTO);
        // then
        then(resultAttempt.isCorrect()).isFalse();
        then(resultAttempt.getUser()).isEqualTo(existingUser);
        verify(userRepository, never()).save(any());
        verify(attemptRepository).save(resultAttempt);
    }

}
