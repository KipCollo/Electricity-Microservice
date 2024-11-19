package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainSimulator {

    private static final int NUM_PROVIDERS = 3;
    private static final int NUM_CITIZENS = 100;
    private static final int NUM_SMART_METERS = 50;

    public static void main(String[] args) {
        List<ConfigurableApplicationContext> contexts = new ArrayList<>();

        // Start Smart City microservice
        ConfigurableApplicationContext smartCityContext = SpringApplication.run(SmartCityApplication.class, args);
        contexts.add(smartCityContext);

        // Start Electricity Provider microservices
        for (int i = 0; i < NUM_PROVIDERS; i++) {
            ConfigurableApplicationContext providerContext = SpringApplication.run(ElectricityProviderApplication.class, args);
            contexts.add(providerContext);
        }

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

