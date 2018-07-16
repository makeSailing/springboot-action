package com.makesailing.neo.controller;

import com.alibaba.fastjson.JSON;
import com.makesailing.neo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/15 22:26
 */
@RestController
public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        User user = new User( );
        user.setId(0L);
        user.setName("小红");
        user.setPassWord("123456");
        user.setEmail("123@qq.com");
        user.setNickName("");
        user.setRegTime("");


        return JSON.toJSONString( user );
    }
}
