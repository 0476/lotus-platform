package com.ailikes.lotus.common.client.oauth2.authorize;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * @author ailikes
 * @version 1.0.0
* 类说明 
*/
public interface AuthorizeConfigProvider {

	boolean config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config);

}
