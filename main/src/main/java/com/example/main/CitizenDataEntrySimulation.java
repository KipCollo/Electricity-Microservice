package com.example.main;

import org.springframework.web.client.RestTemplate;

import java.util.Random;

public class CitizenDataEntrySimulation implements Runnable {

    private static final String CITIZEN_API_URL = "http://localhost:8080/citizen/manual";
    private final int citizenId;
    private final RestTemplate restTemplate;

    public CitizenDataEntrySimulation(int citizenId) {
        this.citizenId = citizenId;
        this.restTemplate = new RestTemplate();
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                // Simulate data entry
                ElecricityConsumptionData data = new ElecricityConsumptionData();
                data.setId(String.valueOf(citizenId));
                data.setConsumption(random.nextDouble() * 100);
                data.setTimestamp(System.currentTimeMillis());

                restTemplate.postForEntity(CITIZEN_API_URL, data, String.class);
                
                // Sleep for a random period before next entry
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
