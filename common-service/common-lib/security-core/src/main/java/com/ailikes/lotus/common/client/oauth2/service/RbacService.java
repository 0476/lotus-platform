/**
 * 
 */
package com.ailikes.lotus.common.client.oauth2.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

/** 
* @author ailikes
* @version 创建时间：2018年4月5日 下午19:52:21
* 类说明 
*/
public interface RbacService {
	
	boolean hasPermission(HttpServletRequest request, Authentication authentication);

}
