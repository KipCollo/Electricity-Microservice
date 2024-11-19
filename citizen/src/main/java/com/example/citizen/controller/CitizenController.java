package com.example.citizen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.citizen.dto.ElecricityConsumptionData;
import com.example.citizen.services.ManualEntryService;
import com.example.citizen.services.SmartMeterService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Controller for handling citizen-related operations such as submitting manual electricity consumption data
 * and generating smart meter data.
 */

@RestController
@RequestMapping("/citizen")
@Tag(name="Citizen API", description="APIs for Citizen")
public class CitizenController {

    @Autowired
    private SmartMeterService smartMeterService;

    @Autowired
    private ManualEntryService manualEntryService;

        /**
     * Submits manual entry for electricity consumption.
     *
     * @param data the electricity consumption data
     * @return a response entity with a success message
     */
    @Operation(summary="Submit Manual Entry", description="Submit manual entry for electricity consumption")
    @PostMapping("/manual")
    public ResponseEntity<String> submitManualEntry(@RequestBody ElecricityConsumptionData data){
        manualEntryService.submitData(data);
        return ResponseEntity.ok("Data Submitted");
    }

     /**
     * Generates and submits smart meter data at a fixed rate.
     */
    @Scheduled(fixedRate= 5000)
    public void generateSmartMeterData(){
        smartMeterService.generateAndSubmitData();
    }

}
