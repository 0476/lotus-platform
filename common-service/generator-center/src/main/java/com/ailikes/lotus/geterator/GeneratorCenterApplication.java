package com.ailikes.lotus.geterator;

import com.ailikes.lotus.common.core.annotation.EnableLogging;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 启动类
 * @author ailikes
 * @version 1.0.0
 */
@Configuration
@EnableLogging
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.ailikes.lotus.common","com.ailikes.lotus.geterator"})
@MapperScan({"com.ailikes.lotus.**.dao"})
public class GeneratorCenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(GeneratorCenterApplication.class, args);
	}
}
