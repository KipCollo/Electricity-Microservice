package com.example.smartcity.dto;

/**
 * Data transfer object for electricity consumption data.
 */
public class ElectricityConsumptionData {

    private String id;
    private int meterId;
    private int consumption;
    // private long timestamp;

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
    public int getConsumption() {
        return consumption;
    }

    /**
     * Sets the electricity consumption.
     *
     * @param consumption the electricity consumption
     */
    public void setConsumption(int consumption) {
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

