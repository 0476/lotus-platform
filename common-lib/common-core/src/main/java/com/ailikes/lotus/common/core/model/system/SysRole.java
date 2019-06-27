package com.ailikes.lotus.common.core.model.system;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ailikes
 * @version 创建时间：2017年11月12日 上午22:57:51
 *  角色
 */
public class SysRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4497149010220586111L;
	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;
	private String code;
	private String name;
	private Date createTime;
	private Date updateTime;
	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
