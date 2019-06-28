package com.ailikes.lotus.message.sms.model;

import java.io.Serializable;


public class SmsCode implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7353129036120185186L;
	//短信流水号
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
