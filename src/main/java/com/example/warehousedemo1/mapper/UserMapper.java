package com.example.warehousedemo1.mapper;

import com.example.warehousedemo1.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sino
 * @since 2025-05-19
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
