package com.example.warehousedemo1.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.warehousedemo1.entity.Storage;
import com.example.warehousedemo1.entity.User;
import com.example.warehousedemo1.mapper.StorageMapper;
import com.example.warehousedemo1.service.IStorageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sino
 * @since 2025-05-22
 */
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements IStorageService {
    @Resource
    private StorageMapper storageMapper;
    @Override
    public IPage pageCC(IPage<Storage> page, Wrapper queryWrapper) {
       return storageMapper.pageCC(page,queryWrapper);
    }
}
