package com.makesailing.neo.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
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
                .andExpect( MockMvcResultMatchers.status().isOk() )
                .andDo( MockMvcResultHandlers.print() )
                .andReturn();
    }
}