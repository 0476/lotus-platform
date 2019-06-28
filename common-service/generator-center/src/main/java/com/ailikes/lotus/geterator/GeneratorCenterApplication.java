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
 * @Author: [dawei QQ:64738479]
 * @Date: [2019-04-25 21:48]
 * @Description: [ ]
 * @Version: [1.0.1]
 * @Copy: [com.zzg]
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
