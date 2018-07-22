package com.makesailing.neo.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

/** 
* HelloController Tester. 
* 
* @author makesailing 
* @since <pre>07/21/2018</pre> 
*/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest { 

    @Before
    public void setUp() throws Exception {
        this.base = new URL( "http://localhost:" + port + "/first" );
    } 
    
    @After
    public void tearDown() throws Exception { 
    }

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;
    /** 
    * 
    * Method: getFirstSpringBoot() 
    * 
    */ 
    @Test
    public void testGetFirstSpringBoot() throws Exception {
        ResponseEntity<String> response = template.getForEntity( base.toString(), String.class );
        Assert.assertNotNull( response.getBody() );
        System.out.println(response.getBody());
    }
    
        
    } 
