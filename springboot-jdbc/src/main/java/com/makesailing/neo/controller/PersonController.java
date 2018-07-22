package com.makesailing.neo.controller;

import com.makesailing.neo.domain.Person;
import com.makesailing.neo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/22 16:00
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/addPerson")
    public int addPerson(@RequestBody Person person) {
        try {
            int result = personService.addPerson( person );
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;

    }

    @PutMapping("/updatePerson")
    public int updatePerson(@RequestBody Person person) {
        try {
            int result = personService.updatePerson( person );
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


    @PutMapping("/{id}")
    public int delPersonById(@PathVariable("id") Long id) {
        try {
            int result = personService.delPerson( id );
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        Person person = personService.getPersonById( id );
        return person;
    }

    @GetMapping("/list")
    public List<Person> getPersonList() {
        return personService.getPersonList();
    }



}
