package com.itheima.dao;

import com.itheima.domian.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Susu
 * @Date: 2019/6/8 19:26
 * @Description:
 */
@Repository
public interface UserDao {
    List<User> findAll();
}
