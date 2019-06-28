/**
 * 
 */
package com.ailikes.lotus.user;

import com.ailikes.lotus.common.core.annotation.EnableLogging;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/** 
* @author 作者 owen E-mail: 624191343@qq.com
* @version 创建时间：2018年4月5日 下午19:52:21
* 类说明 
*/
@Configuration
@EnableLogging
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.ailikes.lotus.common","com.ailikes.lotus.user"})
@MapperScan({"com.ailikes.lotus.**.dao"})
public class UserCenterApp {
	
	public static void main(String[] args) {
//		固定端口启动
		SpringApplication.run(UserCenterApp.class, args);
		
		//随机端口启动
//		SpringApplication app = new SpringApplication(UserCenterApp.class);
//        app.addListeners(new PortApplicationEnvironmentPreparedEventListener());
//        app.run(args);
		
	}

}
