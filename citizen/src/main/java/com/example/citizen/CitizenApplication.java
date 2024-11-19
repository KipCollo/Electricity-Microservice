package com.example.citizen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableScheduling
@OpenAPIDefinition(info = @Info(title = "Citizen API", version = "v1"))
public class CitizenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenApplication.class, args);
	}

}
