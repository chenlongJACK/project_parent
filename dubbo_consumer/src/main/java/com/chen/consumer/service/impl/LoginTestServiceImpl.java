package com.chen.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;

import com.chen.consumer.service.LoginTestService;
import com.chen.entity.User;
import com.chen.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
@Service
public class LoginTestServiceImpl implements LoginTestService {
    @Reference
    private IUserService userService;

    @Override
    public void login() {

    }
}
