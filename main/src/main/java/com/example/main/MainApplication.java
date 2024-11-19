package com.example.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {


    private static final int NUM_CITIZENS = 100;
    private static final int NUM_SMART_METERS = 50;

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

		List<ConfigurableApplicationContext> contexts = new ArrayList<>();
    
        // Start Citizen data entry simulation
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_CITIZENS + NUM_SMART_METERS);
        for (int i = 0; i < NUM_CITIZENS; i++) {
            executorService.execute(new CitizenDataEntrySimulation(i));
        }
        for (int i = 0; i < NUM_SMART_METERS; i++) {
            executorService.execute(new SmartMeterDataEntrySimulation(i));
        }

        // Shutdown hook to close application contexts
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            for (ConfigurableApplicationContext context : contexts) {
                context.close();
            }
            executorService.shutdown();
        }));
    }
}
