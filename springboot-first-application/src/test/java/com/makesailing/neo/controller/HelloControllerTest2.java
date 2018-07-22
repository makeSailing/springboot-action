package com.makesailing.neo.controller;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/21 18:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest2 {
    @Autowired
    private MockMvc mockMvc;

    /**
     *
     * Method: getFirstSpringBoot()
     *
     */
    @Test
    public void testGetFirstSpringBoot() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.get( "/first" ).accept( MediaType.APPLICATION_JSON ) )
                .andExpect( status().isOk() )
                .andExpect( content().string( Matchers.equalTo("the is my first springboot project") ) );
    }
}
