package com.example.warehousedemo1.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.warehousedemo1.entity.Goods;
import com.example.warehousedemo1.entity.Storage;
import com.example.warehousedemo1.mapper.GoodsMapper;
import com.example.warehousedemo1.service.IGoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public IPage pageCC(IPage<Goods> page, Wrapper queryWrapper) {
        return goodsMapper.pageCC(page,queryWrapper);
}
}
