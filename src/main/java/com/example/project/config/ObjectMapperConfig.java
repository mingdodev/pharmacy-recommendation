package com.example.project.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ObjectMapperConfig {
    @Bean
    public ObjectMapper ObjectMapper() {
        return new ObjectMapper();
    }

}
