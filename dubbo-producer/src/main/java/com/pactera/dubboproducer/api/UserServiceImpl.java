package com.pactera.dubboproducer.api;

import com.pactera.service.Interface.UserService;
import com.pactera.service.bean.User;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * UserService
 *
 * @author haijian.li
 * @version 1.0
 * 2021/2/1 21:12
 **/
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        if(id == 1){
            user.setAddress("山西吕梁");
            user.setName("小小乔");
        }else {
            user.setAddress("山西吕梁");
            user.setName("李海舰");
        }
        logger.info("userInfo:{}",user);
        return user;
    }
}
