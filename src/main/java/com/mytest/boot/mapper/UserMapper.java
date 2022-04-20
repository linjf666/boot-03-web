package com.mytest.boot.mapper;

import com.mytest.boot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * ClassName: UserMapper
 * Description:
 * date: 2022/4/17 18:44
 *
 * @author ljf
 * @since JDK 1.8
 */
@Mapper
public interface UserMapper {

//    @Select("select * from user where uid = #{uid}")
    User getUserById(Long uid);

}
