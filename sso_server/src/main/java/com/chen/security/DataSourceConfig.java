package com.chen.security;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author chenlong
 * @version 1.0
 * @description dataSource
 * @date
 */
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getMyDataSource(){
        return DataSourceBuilder.create().build();
    }
}
