package com.mytest.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Description:
 * date: 2022/4/16 14:03
 *
 * @author ljf
 * @since JDK 1.8
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Long uid;
    private String password;
    private String userName;
    private String age;
    private String email;


    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }


}
