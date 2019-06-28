package com.ailikes.lotus.geterator.service;

import java.util.List;
import java.util.Map;

import com.ailikes.lotus.common.core.commons.PageResult;
import org.springframework.stereotype.Service;


/**
 * @author ailikes
 * @version 1.0.0
 */
@Service
public interface SysGeneratorService {

     PageResult queryList(Map<String, Object> map);

     int queryTotal(Map<String, Object> map);

     Map<String, String> queryTable(String tableName);

     List<Map<String, String>> queryColumns(String tableName);

     byte[] generatorCode(String[] tableNames);

}
