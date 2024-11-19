package com.example.smartcity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Data stored aggregated electricity consumption data.
 */
@Document(collection = "consumption_data")
public class AggregatedConsumptionData {

    @Id
    private String id;
    private double totalConsumption;
    private double averageConsumption;
    private double maxConsumption;
    private double minConsumption;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getTotalConsumption() {
        return totalConsumption;
    }
    public void setTotalConsumption(double totalConsumption) {
        this.totalConsumption = totalConsumption;
    }
    public double getAverageConsumption() {
        return averageConsumption;
    }
    public void setAverageConsumption(double averageConsumption) {
        this.averageConsumption = averageConsumption;
    }
    public double getMaxConsumption() {
        return maxConsumption;
    }
    public void setMaxConsumption(double maxConsumption) {
        this.maxConsumption = maxConsumption;
    }
    public double getMinConsumption() {
        return minConsumption;
    }
    public void setMinConsumption(double minConsumption) {
        this.minConsumption = minConsumption;
    }

    
}