package com.chen.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
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
    public int count() {
        return 0;
    }
}
