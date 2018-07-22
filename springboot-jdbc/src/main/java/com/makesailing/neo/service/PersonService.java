package com.makesailing.neo.service;

import com.makesailing.neo.domain.Person;

import java.util.List;

/**
 * # @Author: jamie.li @Date: Created in 2018/7/22 15:53
 */
public interface PersonService {

    String SERVICE_ID = "personService";

    int addPerson(Person person);

    int updatePerson(Person person);

    int delPerson(Long id);

    Person getPersonById(Long id);

    List<Person> getPersonList();
}
