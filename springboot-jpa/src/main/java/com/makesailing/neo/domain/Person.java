package com.makesailing.neo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Data
@Entity
public class Person implements Serializable {

    private static final long serialVersionUID = -9047335683822999063L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;
}
