package com.example.smartcity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.smartcity.repository")
@OpenAPIDefinition(info = @Info(title = "SmartCity API", version = "v1"))
public class SmartcityApplication {

	public static void main(String[] args) {
	
		List<ConfigurableApplicationContext> contexts = new ArrayList<>();
		// Start Smart City microservice

        ConfigurableApplicationContext smartCityContext = SpringApplication.run(SmartcityApplication.class, args);
        contexts.add(smartCityContext);
	}

}
