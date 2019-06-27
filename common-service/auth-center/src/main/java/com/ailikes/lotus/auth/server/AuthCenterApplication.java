/**
 * 
 */
package com.ailikes.lotus.auth.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import com.ailikes.lotus.common.core.annotation.EnableLogging;
import org.springframework.context.annotation.ComponentScan;


/** 
* @author owen 624191343@qq.com
 * @version 创建时间：2017年11月12日 上午22:57:51
* 类说明 
*/
@EnableLogging
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.ailikes.lotus.common","com.ailikes.lotus.auth"})
@MapperScan({"com.ailikes.lotus.**.dao"})
public class AuthCenterApplication {
	
	public static void main(String[] args) {
//		固定端口启动
		SpringApplication.run(AuthCenterApplication.class, args);
		
		//随机端口启动
//		SpringApplication app = new SpringApplication(AuthServerApp.class);
//        app.addListeners(new PortApplicationEnvironmentPreparedEventListener());
//        app.run(args);
		
	}

}
