package com.example.smartcity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.smartcity.dto.AggregatedConsumptionData;

@Repository
public interface AggregatedConsumptionRepository extends MongoRepository<AggregatedConsumptionData, String> {

}
