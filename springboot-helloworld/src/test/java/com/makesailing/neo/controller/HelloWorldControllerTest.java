package com.makesailing.neo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.alibaba.fastjson.JSONObject;
import com.makesailing.neo.domain.User;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/15 21:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup( new HelloWorldController() ).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void index() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.get( "/hello" ).accept( MediaType.APPLICATION_JSON_UTF8 ) )
            .andExpect(status().isOk())
            .andDo(print())
                .andReturn();
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setName("小红");
        user.setEarning(new BigDecimal("-399.00"));

        mockMvc.perform(post("/addUser").contentType(MediaType.APPLICATION_JSON).content(JSONObject.toJSONString(user)))
            .andDo(print())
            .andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
    }

    @Test
    public void testMatch() {
        String str = "33.30 ";
        String pattern = "[1-9]\\d*\\.?\\d*";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}