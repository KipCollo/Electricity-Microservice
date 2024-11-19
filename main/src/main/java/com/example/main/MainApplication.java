package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

		//simulate Smart city system
		simulateDataGeneration();
	}

	private static void simulateDataGeneration(){
		for (int i = 0; i < 100; i++) {
			//simulate manual data entry for citizens
		}

		for (int i = 0; i < 10; i++) {
			//simulate smart meter data generation
		}
	}

}
