package com.junit.demo;

import com.junit.demo.domain.User;
import com.junit.demo.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	@Bean
	public CommandLineRunner setup(UserRepository userRepository) {
		return (args) -> {
			userRepository.save(new User("bhagwan", "java"));
			userRepository.save(new User("bhagwan", "java"));
			userRepository.save(new User("bhagwan", "java"));
			userRepository.save(new User("bhagwan", "java"));

			logger.info("The sample data has been generated");
		};
	}
}
