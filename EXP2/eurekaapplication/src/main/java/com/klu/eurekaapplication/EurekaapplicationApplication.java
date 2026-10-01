package com.klu.eurekaapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaapplicationApplication.class, args);
	}

}
