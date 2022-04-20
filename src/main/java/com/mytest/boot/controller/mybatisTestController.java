package com.mytest.boot.controller;

import com.mytest.boot.bean.User;
import com.mytest.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: mybatisTestController
 * Description:
 * date: 2022/4/17 19:01
 *
 * @author ljf
 * @since JDK 1.8
 */
@Controller
public class mybatisTestController {

    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping("/user")
    public User getAllUser(@RequestParam("uid") Long uid){
        return userService.getUserById(uid);
    }

}
