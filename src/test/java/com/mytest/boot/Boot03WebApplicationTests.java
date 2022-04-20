package com.mytest.boot;

import com.mytest.boot.bean.User2;
import com.mytest.boot.mapper.User2Mapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class Boot03WebApplicationTests {

    @Autowired
    User2Mapper user2Mapper;

    @Test
    void contextLoads() {
    }

    @Test
    void mbplus(){
        User2 user2 = user2Mapper.selectById(1);
        log.info("用户信息:{}",user2);

    }

}
