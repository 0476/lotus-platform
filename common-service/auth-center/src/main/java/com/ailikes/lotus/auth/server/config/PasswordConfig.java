package com.ailikes.lotus.auth.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/** 
* @author ailikes
* @version 创建时间：2017年11月12日 上午22:57:51
* 装配密码匹配器
*/
@Configuration
public class PasswordConfig {
	@Bean
	public PasswordEncoder passwordEncoder()	{
		return new BCryptPasswordEncoder();
	}
}
