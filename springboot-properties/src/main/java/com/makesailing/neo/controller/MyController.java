package com.makesailing.neo.controller;

import com.alibaba.fastjson.JSON;
import com.makesailing.neo.config.Person;
import com.makesailing.neo.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/22 10:41
 */
@RestController
public class MyController {

    @Value( "${my.name}")
    private String name;

    @Value("${my.age}")
    private Integer age;

    @Autowired
    private Person person;

    @Autowired
    private User user;

    @GetMapping("/my")
    public String getMyInfo() {
        return name + "=====" + age;
    }

    @GetMapping("/person")
    public String getPersonInfo() {
        return JSON.toJSONString( person );
    }

    @GetMapping("/user")
    public String getUserInfo() {
        return JSON.toJSONString( user );
    }

}
