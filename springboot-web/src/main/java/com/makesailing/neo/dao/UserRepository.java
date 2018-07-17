package com.makesailing.neo.dao;

import com.makesailing.neo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * #
 *
 * @Author: jamie.li
 * @Date: Created in  2018/7/15 23:11
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}
