package org.javapluto.jpatest.service;/**
 * @date: 2020/6/2 15:03
 * @description
 * @author nqm
 * @param $
 */

import org.javapluto.jpatest.dao.UserDao;
import org.javapluto.jpatest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *@author nqm
 *@description
 *@date 2020/6/2 15:03
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }
}
