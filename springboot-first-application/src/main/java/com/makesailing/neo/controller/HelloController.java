package com.makesailing.neo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/21 17:48
 */
@RestController
public class HelloController {

    @GetMapping("/first")
    public String getFirstSpringBoot(){
        return "the is my first springboot project";
    }
}
