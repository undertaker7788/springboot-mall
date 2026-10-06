package com.undertaker.springbootmall.dao;

import com.undertaker.springbootmall.dto.UserRegisterRequest;
import com.undertaker.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}