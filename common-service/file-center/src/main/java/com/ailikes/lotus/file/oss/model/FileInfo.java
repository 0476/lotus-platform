package com.ailikes.lotus.file.oss.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 作者 owen E-mail: 624191343@qq.com
 * @version 创建时间：2017年11月12日 上午22:57:51
 * file实体类
*/
public class FileInfo implements Serializable {

	private static final long serialVersionUID = -1438078028040922174L;
//  md5字段
	private String id;
//  原始文件名
	private String name;
//	是否图片
	private Boolean isImg;
//	上传文件类型
	private String contentType;
//	文件大小
	private long size;
//  冗余字段
	private String path;
//	oss访问路径 oss需要设置公共读
	private String url;
//	FileType字段
	private String source;

	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsImg() {
		return isImg;
	}

	public void setIsImg(Boolean img) {
		isImg = img;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
