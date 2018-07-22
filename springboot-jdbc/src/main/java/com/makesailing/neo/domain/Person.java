package com.makesailing.neo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/22 13:37
 */
@Data
public class Person implements Serializable {

    private static final long serialVersionUID = -9047335683822999063L;

    private Long id;

    private String name;

    private Integer age;
}
