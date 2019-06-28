package com.ailikes.lotus.file;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 作者 owen E-mail: 624191343@qq.com
 * @version 创建时间：2017年11月12日 上午22:57:51
 * 文件中心
*/
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.ailikes.lotus.common","com.ailikes.lotus.file"})
@MapperScan({"com.ailikes.lotus.**.dao"})
public class FileCenterApplication {

	public static void main(String[] args) {
		// 固定端口
		 SpringApplication.run(FileCenterApplication.class, args);
	}

}