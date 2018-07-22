package com.makesailing.neo.service.impl;

import com.makesailing.neo.domain.Person;
import com.makesailing.neo.repository.PersonDao;
import com.makesailing.neo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/22 15:57
 */
@Service(PersonService.SERVICE_ID)
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public int addPerson(Person person) {
        return personDao.addPerson( person );
    }

    @Override
    public int updatePerson(Person person) {
        return personDao.updatePerson( person );
    }

    @Override
    public int delPerson(Long id) {
        return personDao.delPersonById( id );
    }

    @Override
    public Person getPersonById(Long id) {
        return personDao.getPersonById( id );
    }

    @Override
    public List<Person> getPersonList() {
        return personDao.getPersonList();
    }
}
