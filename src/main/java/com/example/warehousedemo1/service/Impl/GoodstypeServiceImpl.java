package com.example.warehousedemo1.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.warehousedemo1.entity.Goodstype;
import com.example.warehousedemo1.entity.Storage;
import com.example.warehousedemo1.entity.User;
import com.example.warehousedemo1.mapper.GoodstypeMapper;
import com.example.warehousedemo1.mapper.StorageMapper;
import com.example.warehousedemo1.service.IGoodstypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sino
 * @since 2025-05-27
 */
@Service
public class GoodstypeServiceImpl extends ServiceImpl<GoodstypeMapper, Goodstype> implements IGoodstypeService {

    @Resource
    private GoodstypeMapper goodstypeMapper;

    @Override
    public IPage pageCC(IPage<Goodstype> page, Wrapper queryWrapper) {
        return goodstypeMapper.pageCC(page, queryWrapper);
    }
}
