package com.ochabmateusz.partridge.partridgeeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PartridgeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartridgeEurekaServerApplication.class, args);
	}

}
