package com.example.DataVisualizationAPI.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.DataVisualizationAPI.service"})
public class DataVisualizationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataVisualizationApiApplication.class, args);
	}

}
