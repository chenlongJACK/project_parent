package com.chen.security;

import com.chen.entity.User;
import com.chen.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.findByUserName(userName);
        if(user==null){
            throw new RuntimeException("当前用户尚未注册");
        }
        return new UserInfo(user);
    }
}
