package com.ailikes.lotus.frone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableDiscoveryClient
public class FrontWebApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(FrontWebApplication.class, args);
	}
}
