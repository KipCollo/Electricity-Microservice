package com.example.citizen.dto;

public class ElecricityConsumptionData {

    private String meterId;
    private int consumption;
    
    public String getMeterId() {
        return meterId;
    }
    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }
    public int getConsumption() {
        return consumption;
    }
    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    
}
