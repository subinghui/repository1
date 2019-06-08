package com.itheima.test;

import com.itheima.domian.User;
import com.itheima.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Author: Susu
 * @Date: 2019/6/8 20:52
 * @Description:
 */
public class ServiceTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test(){
//        UserServiceImpl userService = new UserServiceImpl();
//        List<User> userList = userService.findAll();
//        System.out.println(userList);
        System.out.println(dataSource);
    }
}
