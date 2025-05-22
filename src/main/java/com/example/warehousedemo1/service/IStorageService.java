package com.example.warehousedemo1.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.warehousedemo1.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.warehousedemo1.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sino
 * @since 2025-05-22
 */
public interface IStorageService extends IService<Storage> {
    IPage pageCC(IPage<Storage> page, Wrapper queryWrapper);
}
