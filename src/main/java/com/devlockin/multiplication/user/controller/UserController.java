package com.devlockin.multiplication.user.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.devlockin.multiplication.user.domain.User;
import com.devlockin.multiplication.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserRepository userRepository;

	@GetMapping("/{idList}")
	public List<User> getUsersByIdList(@PathVariable final List<Long> idList) {
		return userRepository.findAllByIdIn(idList);
	}
}