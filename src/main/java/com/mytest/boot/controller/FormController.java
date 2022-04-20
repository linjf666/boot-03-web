package com.mytest.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FormController
 * Description:
 * date: 2022/4/17 9:34
 *
 * @author ljf
 * @since JDK 1.8
 */
//文件上传
@Controller
@Slf4j
public class FormController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("上传信息: email={},username={},headerImg={},photos={}",email,username,headerImg,photos);

        //保存文件
        if(!headerImg.isEmpty()){
            headerImg.transferTo(new File("E:\\idea\\boot-03-web\\src\\main\\resources\\headerImg\\"+headerImg.getOriginalFilename()));
        }

        if (photos.length > 0){
            for (MultipartFile photo : photos) {
                if(!photo.isEmpty()){
                    photo.transferTo(new File("E:\\idea\\boot-03-web\\src\\main\\resources\\photos\\"+photo.getOriginalFilename()));
                }
            }

        }


        return "main";
    }
}
