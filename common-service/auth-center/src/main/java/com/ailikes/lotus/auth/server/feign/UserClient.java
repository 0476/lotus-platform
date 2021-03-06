package com.ailikes.lotus.auth.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ailikes.lotus.common.core.model.system.LoginAppUser;

/**
* @author ailikes
* @version 创建时间：2017年11月12日 上午22:57:51
* 调用用户中心中的userdetail对象，用户oauth中的登录
* 获取的用户与页面输入的密码 进行BCryptPasswordEncoder匹配
 */
@FeignClient("user-center")
public interface UserClient {

	/**
	 * feign rpc访问远程/users-anon/login接口
	 * @param username
	 * @return
	 */
    @GetMapping(value = "/users-anon/login", params = "username")
    LoginAppUser findByUsername(@RequestParam("username") String username);

    
}
