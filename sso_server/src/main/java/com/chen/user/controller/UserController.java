package com.chen.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
@RestController
public class UserController {
    @RequestMapping("/login")
    public void login(String username,String password){
        System.out.println("登陆成功");
    }
}
