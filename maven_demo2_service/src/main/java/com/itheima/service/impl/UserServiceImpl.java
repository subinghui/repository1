package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domian.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Susu
 * @Date: 2019/6/8 20:50
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
