package com.neuedu.controller;

import com.neuedu.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyController {
    @Resource
    ProductService productService;
    @GetMapping("index")
    public User test(){
        User user=productService.getuser();
        return user;
    }
}
