package com.ailikes.lotus.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 
* @author ailikes
* @version 创建时间：2017年11月28日 下午22:50:29 
* 类说明 
* eureka高可用三台机器
*/

@EnableEurekaServer
@SpringBootApplication
public class RegisterCenterApplication {

	public static void main(String[] args) {

//    	1本地启动采用此方法加载profiles文件
//    	ConfigurableApplicationContext context = new SpringApplicationBuilder(EurekaServerApp.class).
//				profiles("slave0").run(args);
//		2服务器采用此方法 java -jar   --spring.profiles.active=slave3;
		SpringApplication.run(RegisterCenterApplication.class, args);
	}

}