package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class DemoEnversApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEnversApplication.class, args);
	}
}
