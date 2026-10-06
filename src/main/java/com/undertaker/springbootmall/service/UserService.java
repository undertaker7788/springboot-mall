package com.undertaker.springbootmall.service;

import com.undertaker.springbootmall.dto.UserRegisterRequest;
import com.undertaker.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}