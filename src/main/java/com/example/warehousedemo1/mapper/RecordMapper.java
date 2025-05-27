package com.example.warehousedemo1.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.warehousedemo1.entity.Record;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehousedemo1.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sino
 * @since 2025-05-27
 */
@Mapper
public interface RecordMapper extends BaseMapper<Record> {
    IPage pageCC(IPage<Record> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
