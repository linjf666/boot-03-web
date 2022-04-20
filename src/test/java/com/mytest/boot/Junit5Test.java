package com.mytest.boot;

import com.mytest.boot.mapper.UserMapper;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: Junit5Test
 * Description:
 * date: 2022/4/19 9:38
 *
 * @author ljf
 * @since JDK 1.8
 */
//如果要用到容器等springboot相关的东西，要用@SpringBootTest
@SpringBootTest
@DisplayName("测试Junit5")
public class Junit5Test {
    @Autowired
    UserMapper userMapper;

    @DisplayName("测试Displayname方法")
    @Test
    public void DiplaynameTest(){
        System.out.println(1);
    }

    @Test
    public void test2(){
        System.out.println(2);
    }

    @Disabled
    @Test
    public void test3(){
        System.out.println(3);
    }

    //每个单元测试前执行
    @BeforeEach
    void beforeEachTest(){
        System.out.println("测试开始前");
    }

    //每个单元测试后执行
    @AfterEach
    void afterEachTest(){
        System.out.println("测试结束后");
    }

    //所有方法测试前(静态)
    @BeforeAll
    static void beforeAllTest(){
        System.out.println("所有测试开始");
    }

    //所有方法测试后(静态)
    @AfterAll
    static void afterAllTest(){
        System.out.println("所有测试结束");
    }


    //测试断言
    void testSimpleAssertions(){

    }

    int mathtest(int i,int j){
        return i+j;
    }

}
