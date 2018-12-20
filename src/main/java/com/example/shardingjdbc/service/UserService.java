package com.example.shardingjdbc.service;

import com.example.shardingjdbc.entity.User;
import com.example.shardingjdbc.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: Tinko
 * @Date: 2018/12/19 16:22
 * @Description:
 */
@Slf4j
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
    }
}
