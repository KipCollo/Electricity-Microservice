package com.example.electricityprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.electricityprovider.model.ElectricityConsumptionData;
import com.example.electricityprovider.service.ProviderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Controller for handling provider-related operations such as receiving electricity consumption data
 * from citizens and smart meters.
 */
@RestController
@RequestMapping("/providers")
@Tag(name="Provider", description="Electricity provider API")
public class ProviderController {

    @Autowired
    private ProviderService providerService;


     /**
     * Retrieves all electricity consumption data.
     *
     * @return a list of electricity consumption data
     */
    @GetMapping("/data")
    @Operation(summary="Gets data from databsae")
    public ResponseEntity<List<ElectricityConsumptionData>> provideData(){
        List<ElectricityConsumptionData> data =providerService.getAllData();
        return  ResponseEntity.ok(data);
    }


     /**
     * Receives electricity consumption data from citizens and smart meters.
     *
     * @param data the electricity consumption data
     * @return a response entity with a success message
     */
    @PostMapping("/data")
    @Operation(summary="Post data to database")
    public ResponseEntity<String> receiveData(@RequestBody ElectricityConsumptionData data){
        providerService.storeData(data);
        return ResponseEntity.ok("Data Received Successfully");
    }

     /**
     * Retrieves electricity consumption data by ID.
     *
     * @param id the data ID
     * @return the electricity consumption data
     * @throws ResourceNotFoundException if data with the given ID is not found
     */
    @GetMapping("/data/{id}")
    @Operation(summary = "Get Electricity Consumption Data by ID", description = "Retrieve electricity consumption data by ID")
    public ElectricityConsumptionData getDataById(@PathVariable String id) {
        return providerService.getDataById(id);
    }
}
