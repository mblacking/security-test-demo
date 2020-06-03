package org.javapluto.jpatest;

import org.javapluto.jpatest.dao.UserDao;
import org.javapluto.jpatest.entity.Role;
import org.javapluto.jpatest.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JpaTestApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        User user1 = new User();

        user1.setUsername("pluto");
        user1.setPassword("123");
        user1.setAccountNonExpired(true);
        user1.setAccountNonLocked(true);
        user1.setCredentialsNonExpired(true);
        user1.setEnabled(true);

        List<Role> rs1 = new ArrayList<>();

        Role r1 = new Role();
        r1.setEnName("ROLE_admin");
        r1.setZhName("管理员");
        rs1.add(r1);
        user1.setRoles(rs1);
        userDao.save(user1);


        User user2 = new User();
        user2.setUsername("charon");
        user2.setPassword("456");
        user2.setAccountNonExpired(true);
        user2.setAccountNonLocked(true);
        user2.setCredentialsNonExpired(true);
        user2.setEnabled(true);

        List<Role> rs2 = new ArrayList<>();

        Role r2 = new Role();
        r2.setEnName("ROLE_user");
        r2.setZhName("普通用户");
        rs2.add(r2);
        user2.setRoles(rs2);
        userDao.save(user2);

    }

}
