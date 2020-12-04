package com.chen.consumer.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LoginTestServiceTest {
    @Resource
    private LoginTestService loginTestService;
    @Test
    public void testConsumeer(){
        loginTestService.login();
    }
}
