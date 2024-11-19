package com.example.smartcity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartcity.dto.AggregatedConsumptionData;
import com.example.smartcity.service.SmartCityService;

import io.swagger.v3.oas.annotations.Operation;

/**
 * Controller for handling smart city operations such as collecting and aggregating electricity consumption data
 * from various providers.
 */
@RestController
@RequestMapping("/smartcity")
public class SmartCityController {

    @Autowired
    private  SmartCityService smartCityService;

    /**
     * Collects and aggregates electricity consumption data from various providers.
     *
     * @return a response entity containing the aggregated electricity consumption data
     */
    @GetMapping("/aggregate")
    @Operation(summary = "Aggregate Electricity Consumption Data", description = "Collect and aggregate electricity consumption data from various providers")
    public ResponseEntity<AggregatedConsumptionData> aggregateConsumptionData() {
        var aggregatedData = smartCityService.aggregateData();
        return ResponseEntity.ok(aggregatedData);
    }
}
