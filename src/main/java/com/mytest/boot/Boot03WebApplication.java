package com.mytest.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mytest.boot.mapper")
@SpringBootApplication
public class Boot03WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot03WebApplication.class, args);
    }

}
