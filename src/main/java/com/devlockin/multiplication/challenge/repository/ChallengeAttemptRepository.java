package com.devlockin.multiplication.challenge.repository;

import org.springframework.data.repository.CrudRepository;

import com.devlockin.multiplication.challenge.domain.ChallengeAttempt;

import java.util.List;

public interface ChallengeAttemptRepository extends CrudRepository<ChallengeAttempt, Long> {
    /**
     * @return the last 10 attempts for a given user, identified by their alias.
     */
    List<ChallengeAttempt> findTop10ByUserAliasOrderByIdDesc(String userAlias);
}