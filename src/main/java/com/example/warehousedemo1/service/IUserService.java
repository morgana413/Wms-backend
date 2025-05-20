package com.example.warehousedemo1.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.warehousedemo1.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sino
 * @since 2025-05-19
 */
public interface IUserService extends IService<User> {

    IPage pageC(IPage<User> page);
}
