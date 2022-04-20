package com.mytest.boot.service;

import com.mytest.boot.bean.User;
import com.mytest.boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserService
 * Description:
 * date: 2022/4/17 19:37
 *
 * @author ljf
 * @since JDK 1.8
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(Long uid){
        return userMapper.getUserById(uid);
    }


}
