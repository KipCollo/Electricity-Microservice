package com.example.electricityprovider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electricityprovider.exceptions.ResourceNotFoundException;
import com.example.electricityprovider.model.ElectricityConsumptionData;
import com.example.electricityprovider.repository.ElecricityConsumptionRepository;

/**
 * Service for handling electricity consumption data operations.
 */
@Service
public class ProviderService {

    @Autowired
    private ElecricityConsumptionRepository repository;

    /**
     * Retrieves all electricity consumption data.
     *
     * @return a list of electricity consumption data
     */
    public List<ElectricityConsumptionData> getAllData(){
        return repository.findAll();
    }

    /**
     * Saves the given electricity consumption data.
     *
     * @param data the electricity consumption data
     */
    public void storeData(ElectricityConsumptionData data){
        repository.save(data);
    }

     /**
     * Retrieves electricity consumption data by ID.
     *
     * @param id the data ID
     * @return the electricity consumption data
     * @throws ResourceNotFoundException if data with the given ID is not found
     */
    public ElectricityConsumptionData getDataById(String id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Data not found with id " + id));
    }
}
