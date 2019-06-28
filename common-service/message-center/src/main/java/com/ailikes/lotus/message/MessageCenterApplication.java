package com.ailikes.lotus.message;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 消息中心
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.ailikes.lotus.common","com.ailikes.lotus.message"})
@MapperScan({"com.ailikes.lotus.**.dao"})
public class MessageCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageCenterApplication.class, args);
	}

}