package com.mytest.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User2
 * Description:
 * date: 2022/4/18 13:04
 *
 * @author ljf
 * @since JDK 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User2 {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
