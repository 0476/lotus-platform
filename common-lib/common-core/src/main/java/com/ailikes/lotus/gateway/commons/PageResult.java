package com.ailikes.lotus.gateway.commons;

import java.io.Serializable;
import java.util.List;



/**
 * @author ailikes
 * @version 创建时间：2017年11月12日 上午22:57:51
 * 分页实体类
 * total 总数
 * code  是否成功
 * data 当前页结果集
 */
public class PageResult<T> implements Serializable {

	public PageResult() {
	}

	public PageResult(Long count, int code, List<T> data) {
		this.count = count;
		this.code = code;
		this.data = data;
	}

	private static final long serialVersionUID = -275582248840137389L;
	private Long count;
	private int code;
	private List<T> data;

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
