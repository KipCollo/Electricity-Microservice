package com.example.smartcity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.smartcity.repository")
public class SmartcityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartcityApplication.class, args);
	}

}
