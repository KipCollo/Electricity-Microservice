package com.example.citizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.citizen.dto.ElecricityConsumptionData;


/**
 * Service for handling manual entry of electricity consumption data.
 */
@Service
public class ManualEntryService {

    @Autowired(required = true)
    private RestTemplate restTemplate;

    /**
     * Submits the given electricity consumption data.
     *
     * @param data the electricity consumption data
     */
    public void submitData(ElecricityConsumptionData data){
        restTemplate.postForObject("http://localhost:8081/providers/data", data, String.class);
    }
}
