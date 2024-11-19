package com.example.smartcity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data transfer object for electricity consumption data.
 */
public class ElectricityConsumptionData {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("meterId")
    private int meterId;
    @JsonProperty("consumption")
    private double consumption;

    /**
     * Gets the ID of the data.
     *
     * @return the ID of the data
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the data.
     *
     * @param id the ID of the data
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the provider ID.
     *
     * @return the provider ID
     */
    public int getMeterId() {
        return meterId;
    }

    /**
     * Sets the provider ID.
     *
     * @param providerId the provider ID
     */
    public void setMeterId(int meterId) {
        this.meterId = meterId;
    }

    /**
     * Gets the electricity consumption.
     *
     * @return the electricity consumption
     */
    public double getConsumption() {
        return consumption;
    }

    /**
     * Sets the electricity consumption.
     *
     * @param consumption the electricity consumption
     */
    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    // /**
    //  * Gets the timestamp of the data.
    //  *
    //  * @return the timestamp of the data
    //  */
    // public long getTimestamp() {
    //     return timestamp;
    // }

    // /**
    //  * Sets the timestamp of the data.
    //  *
    //  * @param timestamp the timestamp of the data
    //  */
    // public void setTimestamp(long timestamp) {
    //     this.timestamp = timestamp;
    // }
}

