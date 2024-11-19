package com.example.electricityprovider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.electricityprovider.model.ElectricityConsumptionData;

@Repository
public interface  ElecricityConsumptionRepository extends MongoRepository<ElectricityConsumptionData, String>{


}
