package com.makesailing.neo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/22 10:48
 */
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {

    private String name;

    private int age;

    private int number;

    private String uuid;

    private int max;

    private String value;

    private String greeting;
}
