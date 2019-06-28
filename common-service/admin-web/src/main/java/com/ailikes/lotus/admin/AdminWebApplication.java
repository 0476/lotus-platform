package com.ailikes.lotus.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class AdminWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdminWebApplication.class, args);
	}
}