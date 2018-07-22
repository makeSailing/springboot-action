package com.makesailing.neo.controller;

import com.alibaba.fastjson.JSON;
import com.makesailing.neo.domain.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/15 20:22
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @PostMapping("/addUser")
    public String addUser(@Validated @RequestBody User user) {
        return JSON.toJSONString(user);
    }
}
