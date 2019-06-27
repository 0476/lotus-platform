package com.ailikes.lotus.gateway.log.dao;

import com.ailikes.lotus.gateway.model.log.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogDao {

	@Insert("insert into sys_log(username, module, params, remark, flag, createTime) values(#{username}, #{module}, #{params}, #{remark}, #{flag}, #{createTime})")
	int save(SysLog log);

}
