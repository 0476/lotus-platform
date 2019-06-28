package com.ailikes.lotus.zipkin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipkin2.storage.mysql.v1.MySQLStorage;

import javax.sql.DataSource;

/**
 * @Author: ailikes
 */
@Configuration
public class ZipkinConfig {

    @Bean
    public MySQLStorage mySQLStorage(DataSource datasource) {
        return MySQLStorage.newBuilder().datasource(datasource).executor(Runnable::run).build();
    }

}
