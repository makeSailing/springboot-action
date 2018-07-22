package com.makesailing.neo.repository;

import com.makesailing.neo.domain.Person;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * # @Author: jamie.li @Date: Created in 2018/7/22 13:51
 */
@Repository
public class PersonDao {

    @Autowired
    private JdbcTemplate template;

   
    public int addPerson(Person person) {
        return template.update( "insert into person (name,age) values (?,?)", person.getName(), person.getAge() );
    }

   
    public int updatePerson(Person person) {
        return template.update( "update person set name = ? ,age = ?  where id = ?",
                person.getName(), person.getAge(), person.getId() );
    }

   
    public int delPersonById(Long id) {
        return template.update( "delete from person where id= ?", id );
    }

   
    public Person getPersonById(Long id) {
        List<Person> list = template.query( "select * from person where id = ?",
                new Object[]{id}, new BeanPropertyRowMapper<>( Person.class ) );
        if (CollectionUtils.isNotEmpty(list)) {
          return list.get(0);
        }
        return null;
    }

   
    public List<Person> getPersonList() {
        List<Person> list = template.query( "select * from person",
                new Object[]{}, new BeanPropertyRowMapper<>( Person.class ) );
        if (CollectionUtils.isNotEmpty(list)) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }
}
