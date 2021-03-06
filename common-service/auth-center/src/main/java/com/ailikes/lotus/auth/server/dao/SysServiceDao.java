package com.ailikes.lotus.auth.server.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ailikes.lotus.auth.server.model.SysService;

/**
 * @author ailikes
 * @version 1.0.0
 */
@Mapper
public interface SysServiceDao {

    @Insert("insert into sys_service(parentId, name, url, path, css, sort, createTime, updateTime,isMenu) "
            + "values (#{parentId}, #{name}, #{url} , #{path} , #{css}, #{sort}, #{createTime}, #{updateTime},#{isMenu})")
    int save(SysService service);

    int update(SysService service);

    @Select("select * from sys_service t where t.id = #{id}")
    SysService findById(Long id);

    @Delete("delete from sys_service where id = #{id}")
    int delete(Long id);

    @Delete("delete from sys_service where parentId = #{id}")
    int deleteByParentId(Long id);

    @Select("select * from sys_service t order by t.sort")
    List<SysService> findAll();

    @Select("select * from sys_service t where t.isMenu = 1 order by t.sort")
    List<SysService> findOnes();

}
