package com.demomicrob.demoservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "My Product Services in Microservices.", version = "1.0.0"))

public class DemoservicesApplication {

	public static void main(String[] args) {
	
	SpringApplication.run(DemoservicesApplication.class, args);
	}

}
