package com.chen.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chen.entity.User;
import com.chen.service.IUserService;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
@Service
public class UserService implements IUserService {
    @Override
    public User login() {
        User user=new User("jack","jack","123456");
        return user;
    }
}
