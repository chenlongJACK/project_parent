package com.chen.user.service.impl;


import com.chen.entity.User;
import com.chen.user.dao.IUserDao;
import com.chen.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User findByUserName(String userName) {
        User user = userDao.findByUserName(userName);
        return user;
    }
}
