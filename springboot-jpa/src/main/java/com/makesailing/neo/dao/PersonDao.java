package com.makesailing.neo.dao;

import com.makesailing.neo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/22 17:14
 */
public interface PersonDao extends JpaRepository<Person, Long> {

}
