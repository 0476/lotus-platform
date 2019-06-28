package com.ailikes.lotus.file.oss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aliyun.oss.OSSClient;
import com.ailikes.lotus.file.oss.dao.FileDao;
import com.ailikes.lotus.file.oss.model.FileInfo;
import com.ailikes.lotus.file.oss.model.FileType;
 
/**
 * @author ailikes
 * @version 创建时间：2017年11月12日 上午22:57:51
*  阿里云oss存储文件
*/
@Service("aliyunOssServiceImpl")
public class AliyunOssServiceImpl extends AbstractFileService {

	@Autowired
	private FileDao fileDao;

	@Override
	protected FileDao getFileDao() {
		return fileDao;
	}

	@Override
	protected FileType fileType() {
		return FileType.ALIYUN;
	}

	@Autowired
	private OSSClient ossClient;

	@Value("${aliyun.oss.bucketName:xxxxx}")
	private String bucketName;
	@Value("${aliyun.oss.domain:xxxxx}")
	private String domain;

	@Override
	protected void uploadFile(MultipartFile file, FileInfo fileInfo) throws Exception {
		ossClient.putObject(bucketName, fileInfo.getName(), file.getInputStream());
		fileInfo.setUrl(domain + "/" + fileInfo.getName());
	}

	@Override
	protected boolean deleteFile(FileInfo fileInfo) {
		ossClient.deleteObject(bucketName, fileInfo.getName());
		return true;
	}

}
