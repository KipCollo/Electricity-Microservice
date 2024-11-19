package com.example.smartcity.service;

import com.example.smartcity.dto.AggregatedConsumptionData;
import com.example.smartcity.dto.ElectricityConsumptionData;
import com.example.smartcity.repository.AggregatedConsumptionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Service for handling the aggregation of electricity consumption data from various providers.
 */
@Service
public class SmartCityService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AggregatedConsumptionRepository aggregatedConsumptionRepository;

    private static final String PROVIDER_URL = "http://localhost:8081/providers/data";

       /**
     * Aggregates electricity consumption data from various providers.
     *
     * @return the aggregated electricity consumption data
     */
    public AggregatedConsumptionData aggregateData() {
        List<ElectricityConsumptionData> data = fetchProviderData();
        AggregatedConsumptionData aggregatedData = aggregate(data);
        saveAggregatedData(aggregatedData);
        return aggregatedData;
        
    }
    
    /**
     * Fetches electricity consumption data from providers.
     *
     * @return a list of electricity consumption data
     */
    private List<ElectricityConsumptionData> fetchProviderData() {
        return restTemplate.exchange(
                PROVIDER_URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ElectricityConsumptionData>>() {}
        ).getBody();
    }
   
    /**
     * Aggregates the given list of electricity consumption data.
     *
     * @param data the list of electricity consumption data
     * @return the aggregated electricity consumption data
     */
    private AggregatedConsumptionData aggregate(List<ElectricityConsumptionData> data) {
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        
        for (ElectricityConsumptionData entry : data) {
            double consumption = entry.getConsumption();
            total += consumption;
            if (consumption > max) {
                max = consumption;
            }
            if (consumption < min) {
                min = consumption;
            }
        }

        double average = total / data.size();

        AggregatedConsumptionData aggregatedData = new AggregatedConsumptionData();
        aggregatedData.setTotalConsumption(total);
        aggregatedData.setAverageConsumption(average);
        aggregatedData.setMaxConsumption(max);
        aggregatedData.setMinConsumption(min);
        
        return aggregatedData;
    }

    /**
     * Saves the aggregated electricity consumption data in the database.
     *
     * @param data the aggregated electricity consumption data
     */

    private void saveAggregatedData(AggregatedConsumptionData data) {
        if (aggregatedConsumptionRepository != null) {
            aggregatedConsumptionRepository.save(data);
        } else {
            throw new IllegalStateException("Repository is not initialized");
        }
    }
}
