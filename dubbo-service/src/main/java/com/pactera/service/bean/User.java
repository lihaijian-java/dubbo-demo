package com.pactera.service.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * User
 *
 * @author haijian.li
 * @version 1.0
 * 2021/2/1 20:56
 **/
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -383323229071599967L;
    private long id;
    private String name;
    private String address;
}
