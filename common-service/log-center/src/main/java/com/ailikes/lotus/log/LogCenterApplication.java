package com.ailikes.lotus.log;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.ailikes.lotus.common","com.ailikes.lotus.log"})
@MapperScan({"com.ailikes.lotus.**.dao"})
public class LogCenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(LogCenterApplication.class, args);
	}
}
