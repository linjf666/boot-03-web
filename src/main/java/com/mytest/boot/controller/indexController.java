package com.mytest.boot.controller;

import com.mytest.boot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * ClassName: indexController
 * Description:
 * date: 2022/4/16 12:52
 *
 * @author ljf
 * @since JDK 1.8
 */
@Controller
public class indexController {

    @GetMapping({"/", "/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping ("/login")
    public String main(User user, HttpSession httpSession, Model model){
        if(!StringUtils.isEmpty(user.getUserName()) && !StringUtils.isEmpty(user.getPassword())){
            httpSession.setAttribute("loginUser", user);
        }else{
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }

//        return "main";
        return "redirect:/main.html";  //解决表单重复提交
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession httpSession,Model model){

        //是否登录  拦截器，过滤器
//        Object loginUser = httpSession.getAttribute("loginUser");
//        if(loginUser != null){
//            return "main";
//        }else{
//            model.addAttribute("msg", "重新登录");
//            return "login";
//        }
        return "main";
    }


}
