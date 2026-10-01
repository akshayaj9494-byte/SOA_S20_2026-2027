package com.klu.cartapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CartapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartapplicationApplication.class, args);
	}

}