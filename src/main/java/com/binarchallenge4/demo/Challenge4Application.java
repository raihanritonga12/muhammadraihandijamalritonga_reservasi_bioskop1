package com.binarchallenge4.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@OpenAPIDefinition
@Component
@Slf4j
public class Challenge4Application {
	public static void main(String[] args) {
		SpringApplication.run(Challenge4Application.class, args);
	}

}
