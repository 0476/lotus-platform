package com.ailikes.lotus.file.oss.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.ailikes.lotus.file.oss.model.FileType;
import com.ailikes.lotus.file.oss.service.FileService;

 
/**
 * @author ailikes
 * @version 创建时间：2017年11月12日 上午22:57:51
 * FileService工厂<br>
 * 将各个实现类放入map
*/
@Configuration
public class OssServiceFactory {

	private Map<FileType, FileService> map = new HashMap<>();

 
	@Autowired
	private FileService aliyunOssServiceImpl;
	
	@Autowired
	private FileService qiniuOssServiceImpl;
	

	@PostConstruct
	public void init() {
		map.put(FileType.ALIYUN, aliyunOssServiceImpl);
		map.put(FileType.QINIU ,  qiniuOssServiceImpl);
	}

	public FileService getFileService(String fileType) {

		return map.get(FileType.valueOf(fileType));
	}
}
