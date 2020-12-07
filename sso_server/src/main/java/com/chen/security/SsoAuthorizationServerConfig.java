package com.chen.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;

import javax.sql.DataSource;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
@Configuration
@EnableAuthorizationServer
public class SsoAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
    /**
     * 覆盖客户端配置类
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory().
                withClient("clinet1")//客户端ID
                .secret("clinet1")//客户端密码
                .authorizedGrantTypes("authorization_code", "refresh_token")//认证方式 授权码认证模式
                .scopes("all")
                .and()
                .withClient("clinet2")
                .secret("clinet2")
                .authorizedGrantTypes("authorization_code", "refresh_token")
                .scopes("all");
    }
    /**
     * 配置客户端详情服务（ClientDetailsService）
     * 客户端详情信息在这里进行初始化
     * 通过数据库来存储调取详情信息
     *
     * @param  clients
     * @throws Exception
     */
    /*
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(clientDetails());
    }
    */
    @Bean
    public ClientDetailsService clientDetails() {
        JdbcClientDetailsService service = new JdbcClientDetailsService(dataSource);
        return service;
    }
}
