package com.makesailing.neo.controller;

import com.makesailing.neo.dao.PersonDao;
import com.makesailing.neo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        try {
            personDao.save( person );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PutMapping("/updatePerson")
    public void updatePerson(@RequestBody Person person) {
        try {
             personDao.saveAndFlush( person );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @PutMapping("/{id}")
    public void delPersonById(@PathVariable("id") Long id) {
        try {
             personDao.delete( id );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        Person person = personDao.findOne( id );
        return person;
    }

    @GetMapping("/list")
    public List<Person> getPersonList() {
        return personDao.findAll();
    }



}