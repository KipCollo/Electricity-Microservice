package com.example.main;

import org.springframework.web.client.RestTemplate;

import java.util.Random;

public class SmartMeterDataEntrySimulation implements Runnable {

    private static final String CITIZEN_API_URL = "http://localhost:8082/citizen/manual";
    private final int meterId;
    private final RestTemplate restTemplate;

    public SmartMeterDataEntrySimulation(int meterId) {
        this.meterId = meterId;
        this.restTemplate = new RestTemplate();
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                // Simulate data entry
                ElecricityConsumptionData data = new ElecricityConsumptionData();
                data.setMeterId("meter-" + meterId);
                data.setConsumption(random.nextDouble() * 100);

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
