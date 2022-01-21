package com.devlockin.multiplication.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devlockin.multiplication.user.domain.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByAlias(final String alias);
	List<User> findAllByIdIn(final List<Long> ids);

}
