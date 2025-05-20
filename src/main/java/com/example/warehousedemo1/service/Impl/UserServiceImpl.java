package com.example.warehousedemo1.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.warehousedemo1.entity.User;
import com.example.warehousedemo1.mapper.UserMapper;
import com.example.warehousedemo1.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sino
 * @since 2025-05-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public IPage pageC(IPage<User> page) {
        return userMapper.pageC(page);
    }
}
