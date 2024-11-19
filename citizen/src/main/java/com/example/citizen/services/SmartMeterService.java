// package com.example.citizen.services;

// import java.util.Random;
// import java.util.UUID;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;

// import com.example.citizen.dto.ElecricityConsumptionData;

// /**
//  * Service for generating and submitting smart meter data.
//  */

// @Service
// public class SmartMeterService {

//     @Autowired
//     private RestTemplate restTemplate;

//     /**
//      * Generates and submits smart meter data.
//      */
//     public void generateAndSubmitData(){
        
//         ElecricityConsumptionData data = new ElecricityConsumptionData();
//         data.setMeterId(UUID.randomUUID().toString());
//         data.setConsumption(generateRandomConsumption());

//         restTemplate.postForObject("http://localhost:8081/providers/data", data,String.class);
//     }

//     private int generateRandomConsumption(){
//         return new Random().nextInt(100) +1;
//     }
// }
