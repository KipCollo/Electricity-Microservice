package com.example.main;

public class ElecricityConsumptionData {

    private String meterId;
    private double consumption;

    // Getters and setters

    public String getId() {
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
