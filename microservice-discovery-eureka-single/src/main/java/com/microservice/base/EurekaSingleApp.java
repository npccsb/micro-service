package com.microservice.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSingleApp {
	public static void main(String[] args) {
		SpringApplication.run(EurekaSingleApp.class, args);
	}
}
