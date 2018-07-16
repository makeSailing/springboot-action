package com.makesailing.neo.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}
