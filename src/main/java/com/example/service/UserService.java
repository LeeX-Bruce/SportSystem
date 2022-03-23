package com.example.service;

import com.example.pojo.User;

/**
 * @author LMH
 * @date 2022/3/21 20:46
 */

public interface UserService {
    //插入用户
    int InsertUser(User user);

    //根据userid查询用户
    User QueryUserByNumber(String usernumber);

    //根据username查询用户
    User QueryUserByName(String username);
}
