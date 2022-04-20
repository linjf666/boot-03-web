package com.mytest.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mytest.boot.bean.User2;
import com.mytest.boot.mapper.User2Mapper;
import com.mytest.boot.service.User2Service;
import org.springframework.stereotype.Service;

/**
 * ClassName: User2ServiceImpl
 * Description:
 * date: 2022/4/18 13:22
 *
 * @author ljf
 * @since JDK 1.8
 */
@Service
public class User2ServiceImpl extends ServiceImpl<User2Mapper, User2> implements User2Service {
}
