package com.example.warehousedemo1.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.warehousedemo1.entity.Record;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.warehousedemo1.entity.Storage;
import com.example.warehousedemo1.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sino
 * @since 2025-05-27
 */
public interface IRecordService extends IService<Record> {

    IPage pageCC(IPage<Record> page, Wrapper queryWrapper);
}
