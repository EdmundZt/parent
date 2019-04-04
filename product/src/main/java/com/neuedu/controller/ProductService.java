package com.neuedu.controller;

import com.neuedu.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PRODUCTTYPE")
public interface ProductService {
    @GetMapping("/index")
    public User getuser();
}
