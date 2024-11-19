package com.example.electricityprovider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ElectricityproviderApplication {

	private static final int NUM_PROVIDERS = 3;
	public static void main(String[] args) {

	
		// Start Electricity Provider microservices

		 List<ConfigurableApplicationContext> contexts = new ArrayList<>();

        for (int i = 0; i < NUM_PROVIDERS; i++) {
            ConfigurableApplicationContext providerContext = SpringApplication.run(ElectricityproviderApplication.class, args);
            contexts.add(providerContext);
        }

	}

}
