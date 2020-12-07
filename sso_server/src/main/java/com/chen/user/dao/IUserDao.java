package com.chen.user.dao;

import com.chen.entity.User;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
public interface IUserDao {
    User findByUserName(String userName);
}
