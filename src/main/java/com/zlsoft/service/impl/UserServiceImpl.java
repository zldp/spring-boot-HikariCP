package com.zlsoft.service.impl;

import com.zlsoft.dao.UserMapper;
import com.zlsoft.model.entity.User;
import com.zlsoft.service.UserService;
import com.zlsoft.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by DP on 2020/01/03.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
