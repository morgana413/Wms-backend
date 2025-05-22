package com.example.warehousedemo1.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.warehousedemo1.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehousedemo1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sino
 * @since 2025-05-22
 */
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

    IPage pageCC(IPage<Storage> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
