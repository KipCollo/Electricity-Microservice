package com.example.electricityprovider.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class Config {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
        .info(new Info()
        .title("Elecricity Provider Service")
        .version("1.0")
        .description("API documentation for Elecricity Provider Service"));
    }
}
