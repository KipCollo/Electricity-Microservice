package com.example.smartcity.dto;

/**
 * Data transfer object for aggregated electricity consumption data.
 */
public class AggregatedConsumptionData {

    private double totalConsumption;
    private double averageConsumption;
    private double maxConsumption;
    private double minConsumption;

    /**
     * Gets the total electricity consumption.
     *
     * @return the total electricity consumption
     */
    public double getTotalConsumption() {
        return totalConsumption;
    }

    /**
     * Sets the total electricity consumption.
     *
     * @param totalConsumption the total electricity consumption
     */
    public void setTotalConsumption(double totalConsumption) {
        this.totalConsumption = totalConsumption;
    }

    /**
     * Gets the average electricity consumption.
     *
     * @return the average electricity consumption
     */
    public double getAverageConsumption() {
        return averageConsumption;
    }

    /**
     * Sets the average electricity consumption.
     *
     * @param averageConsumption the average electricity consumption
     */
    public void setAverageConsumption(double averageConsumption) {
        this.averageConsumption = averageConsumption;
    }

    /**
     * Gets the maximum electricity consumption.
     *
     * @return the maximum electricity consumption
     */
    public double getMaxConsumption() {
        return maxConsumption;
    }

    /**
     * Sets the maximum electricity consumption.
     *
     * @param maxConsumption the maximum electricity consumption
     */
    public void setMaxConsumption(double maxConsumption) {
        this.maxConsumption = maxConsumption;
    }

    /**
     * Gets the minimum electricity consumption.
     *
     * @return the minimum electricity consumption
     */
    public double getMinConsumption() {
        return minConsumption;
    }

    /**
     * Sets the minimum electricity consumption.
     *
     * @param minConsumption the minimum electricity consumption
     */
    public void setMinConsumption(double minConsumption) {
        this.minConsumption = minConsumption;
    }

    // public void setProviderId(int i) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}

