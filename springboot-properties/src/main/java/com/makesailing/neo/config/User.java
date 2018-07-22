package com.makesailing.neo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/22 11:07
 */
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.makesailing")
@Component
@Data
public class User {

    private String name;

    private Integer age;
}
