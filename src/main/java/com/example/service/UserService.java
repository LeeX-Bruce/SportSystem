package com.example.service;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author LMH
 * @date 2022/3/21 20:46
 */

public interface UserService {
    //插入用户数据
    int InsertUser(User user);

    //根据userid查询用户
    User QueryUserByNumber(String usernumber);

    //根据username查询用户
    User QueryUserByName(String username);

    //插入申请表数据
    int InsertApplyRoot(String usernumber, String represent);
}
