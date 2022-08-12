package com.fwzg.user.service.impl;

import com.fwzg.user.entity.User;
import com.fwzg.user.mapper.UserMapper;
import com.fwzg.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user)
    {
        return userMapper.getUser(user);
    }
}
