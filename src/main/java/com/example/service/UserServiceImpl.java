package com.example.service;

import com.example.mapper.userDao;
import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LMH
 * @date 2022/3/21 20:52
 */

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private userDao userDao;

    @Override
    public int InsertUser(User user) {
        int ret = userDao.InsertUser(user);

        return ret;
    }

    @Override
    public User QueryUserByNumber(String userid) {
        User user = userDao.QueryUserByNumber(userid);

        return user;
    }

    @Override
    public User QueryUserByName(String username) {
        User user = userDao.QueryUserByName(username);

        return user;
    }
}
