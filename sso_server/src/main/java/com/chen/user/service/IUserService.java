package com.chen.user.service;

import com.chen.entity.User;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
public interface IUserService {
    User findByUserName(String userName);
}
