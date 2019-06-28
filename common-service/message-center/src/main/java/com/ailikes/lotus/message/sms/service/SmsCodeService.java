package com.ailikes.lotus.message.sms.service;

import com.ailikes.lotus.message.sms.model.SmsCode;

/**
 * @author ailikes
 * @version 创建时间：2017年10月12日 上午22:57:51
 * 短信验证码service
 */
public interface SmsCodeService {

	SmsCode generateCode(String phone);

	String matcheCodeAndGetPhone(String key, String code, Boolean delete, Integer second);
}
