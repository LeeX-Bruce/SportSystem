package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author LMH
 * @date 2022/3/21 20:15
 */

@Repository
@Mapper
public interface userDao {
    //插入用户
    int InsertUser(User user);

    //根据usernumber查询用户
    User QueryUserByNumber(String usernumber);

    //根据username查询用户
    User QueryUserByName(String username);
}
