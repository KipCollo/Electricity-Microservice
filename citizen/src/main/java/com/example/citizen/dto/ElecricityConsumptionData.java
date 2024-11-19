package com.example.citizen.dto;

public class ElecricityConsumptionData {

    private String meterId;
    private double consumption;
    
    public String getMeterId() {
        return meterId;
    }
    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }
    public double getConsumption() {
        return consumption;
    }
    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    
}
