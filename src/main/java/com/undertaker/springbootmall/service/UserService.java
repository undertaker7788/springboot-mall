package com.undertaker.springbootmall.service;

import com.undertaker.springbootmall.dto.UserLoginRequest;
import com.undertaker.springbootmall.dto.UserRegisterRequest;
import com.undertaker.springbootmall.model.User;

import javax.validation.Valid;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(@Valid UserLoginRequest userLoginRequest);
}