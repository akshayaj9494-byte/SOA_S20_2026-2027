package com.example.gatewayapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayapplicationApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(GatewayapplicationApplication.class, args);
	}

}