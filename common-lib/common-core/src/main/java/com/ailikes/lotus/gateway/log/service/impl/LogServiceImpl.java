package com.ailikes.lotus.gateway.log.service.impl;

import java.util.Date;

import com.ailikes.lotus.gateway.annotation.datasource.DataSource;
import com.ailikes.lotus.gateway.log.dao.LogDao;
import com.ailikes.lotus.gateway.log.service.LogService;
import com.ailikes.lotus.gateway.model.log.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private LogDao logDao;

	@Async
	@Override
	@DataSource(name="log")
	public void save(SysLog log) {
		if (log.getCreateTime() == null) {
			log.setCreateTime(new Date());
		}
		if (log.getFlag() == null) {
			log.setFlag(Boolean.TRUE);
		}

		logDao.save(log);
	}

	 
}
