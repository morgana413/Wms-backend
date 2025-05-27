package com.example.warehousedemo1.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.warehousedemo1.entity.Record;
import com.example.warehousedemo1.entity.Storage;
import com.example.warehousedemo1.mapper.RecordMapper;
import com.example.warehousedemo1.service.IRecordService;
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
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements IRecordService {
    @Resource
    private RecordMapper recordMapper;

    @Override
    public IPage pageCC(IPage<Record> page, Wrapper queryWrapper) {
        return recordMapper.pageCC(page, queryWrapper);
    }
}
