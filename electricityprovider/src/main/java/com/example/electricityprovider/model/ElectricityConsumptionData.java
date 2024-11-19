package com.example.electricityprovider.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Data transfer object for electricity consumption data.
 */
@Document(collection="consumption_data")
public class ElectricityConsumptionData {

    @Id
    private String id;
    private String meterId;
    private int consumption;

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
     * Gets the ID of the data.
     *
     * @return the ID of the data
     */
    public String getMeterId() {
        return meterId;
    }
    public void setMeterId(String meterId) {
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

    
}
