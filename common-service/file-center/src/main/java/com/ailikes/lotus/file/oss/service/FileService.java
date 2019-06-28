package com.ailikes.lotus.file.oss.service;

import java.util.Map;

import com.ailikes.lotus.common.core.commons.PageResult;
import org.springframework.web.multipart.MultipartFile;

import com.ailikes.lotus.file.oss.model.FileInfo;

/**
 * @author ailikes
 * @version 创建时间：2017年11月12日 上午22:57:51
 * 文件service 目前仅支持阿里云oss,七牛云
*/
public interface FileService {

	FileInfo upload(MultipartFile file ) throws Exception;

	void delete(FileInfo fileInfo);
	
	FileInfo getById(String id);
	
	PageResult<FileInfo> findList(Map<String, Object> params);

}
