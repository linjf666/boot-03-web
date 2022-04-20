package com.mytest.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: ViewTestController
 * Description:
 * date: 2022/4/16 10:12
 *
 * @author ljf
 * @since JDK 1.8
 */

@Controller
public class ViewTestController {

    @GetMapping("/index2")
    public String success(Model model){
        model.addAttribute("msg", "SUCCESSS");
        model.addAttribute("link","https://www.baidu.com/");
        return "success";
    }
}
