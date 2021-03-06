package com.example.controller;

import com.example.pojo.User;
import com.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LMH
 * @date 2022/3/21 20:59
 */

@RestController
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    //用户登录
    @RequestMapping("/Login")
    @ResponseBody
    public boolean Login(String usernumber, String userpassword){
        User user = SearchByNumber(usernumber);


        if(user != null && user.getUserpassword().equals(userpassword))
            return true;
        else
            return false;
    }

    //用户注册
    @RequestMapping("/Register")
    @ResponseBody
    public int RegisterUser(User user){
        return userService.InsertUser(user);
    }

    //按用户number查找
    @RequestMapping("/SearchById")
    @ResponseBody
    public User SearchByNumber(String usernumber){
        return userService.QueryUserByNumber(usernumber);
    }

    //按用户姓名查找
    @RequestMapping("/SearchByName")
    @ResponseBody
    public User SearchByName(String username){
        return userService.QueryUserByName(username);
    }

    //用户申请发布赛事权限
    @RequestMapping("/ApplyRoot")
    @ResponseBody
    public int ApplyRoot(String usernumber, String represent){
        return userService.InsertApplyRoot(usernumber, represent);
    };
}
