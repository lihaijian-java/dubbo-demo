package com.pactera.dubboconsumer.controller;

import com.pactera.service.Interface.UserService;
import com.pactera.service.bean.User;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author haijian.li
 * @version 1.0
 * 2021/2/1 21:36
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {
    public static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Reference(version = "1.0.0")
    UserService userService;
    @GetMapping(value = "/getUser")
    public User getUser(Long id){
        logger.info("当前用户id={}",id);
        return userService.getUserById(id);
    }
}
