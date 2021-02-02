package com.pactera.service.Interface;


import com.pactera.service.bean.User;

/**
 * UserService
 *
 * @author haijian.li
 * @version 1.0
 * 2021/2/1 20:57
 **/
public interface UserService {

    /**
     * 通过用户id获取用户信息
     * @param id
     * @return
     */
    User getUserById(Long id);
}
