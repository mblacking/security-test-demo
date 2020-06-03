package org.javapluto.jpatest.dao;/**
 * @date: 2020/6/2 14:44
 * @description
 * @author nqm
 * @param $
 */

import org.javapluto.jpatest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *@author nqm
 *@description
 *@date 2020/6/2 14:44
 */
public interface UserDao extends JpaRepository<User, Long> {


    User findUserByUsername(String username);
}
