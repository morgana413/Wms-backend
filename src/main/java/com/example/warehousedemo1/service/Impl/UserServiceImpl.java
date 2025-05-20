package com.example.warehousedemo1.service.Impl;

import com.example.warehousedemo1.entity.User;
import com.example.warehousedemo1.mapper.UserMapper;
import com.example.warehousedemo1.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
