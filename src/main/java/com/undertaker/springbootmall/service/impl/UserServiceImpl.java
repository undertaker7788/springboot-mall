package com.undertaker.springbootmall.service.impl;

import com.undertaker.springbootmall.dao.UserDao;
import com.undertaker.springbootmall.dto.UserRegisterRequest;
import com.undertaker.springbootmall.model.User;
import com.undertaker.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Integer userId) {

        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {

        return userDao.createUser(userRegisterRequest);
    }
}