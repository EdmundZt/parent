package com.neuedu.Controller;

import com.neuedu.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("index")
    public User test(){
        User user = new User();
        user.setName("哈士奇");
        user.setId(535);
        return user;
    }
}
