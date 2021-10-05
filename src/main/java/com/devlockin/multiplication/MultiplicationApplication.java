package com.devlockin.multiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import lombok.var;

@SpringBootApplication
public class MultiplicationApplication {
	public static void main(String[] args) {
		SpringApplication.run(MultiplicationApplication.class, args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		var om = new ObjectMapper();
		om.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		return om;
	}
}