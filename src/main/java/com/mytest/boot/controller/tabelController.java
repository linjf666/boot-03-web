package com.mytest.boot.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mytest.boot.bean.User;
import com.mytest.boot.bean.User2;
import com.mytest.boot.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: tabelController
 * Description:
 * date: 2022/4/16 15:52
 *
 * @author ljf
 * @since JDK 1.8
 */

@Controller
public class tabelController {
    @Autowired
    User2Service user2Service;

    @GetMapping("/basic_table")
    public String basic_tabel(){
        return "table/basic_table";
    }


    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "pn",defaultValue = "1") Integer pn,
                             RedirectAttributes ra){

        user2Service.removeById(id);

        ra.addAttribute("pn",pn);

        return "redirect:/dynamic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        //表格内容遍历
//        List<User> users = Arrays.asList(new User("张三", "123456"),
//                new User("abc", "1234"));
//
//        model.addAttribute("users",users);


        //整合mybatis-plus
//        List<User2> list = user2Service.list();


        //分页
        //page中封装了很多信息，页面读取就能处理
        Page<User2> user2Page = new Page<>(pn, 3);
        Page<User2> page = user2Service.page(user2Page, null);

        long current = page.getCurrent();
        long pages = page.getPages();
        long total = page.getTotal();
        List<User2> records = page.getRecords();

        model.addAttribute("page", page);

        return "table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }

    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
}
