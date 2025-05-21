package com.example.warehousedemo1.service.Impl;

import com.example.warehousedemo1.entity.Menu;
import com.example.warehousedemo1.mapper.MenuMapper;
import com.example.warehousedemo1.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统菜单表 服务实现类
 * </p>
 *
 * @author sino
 * @since 2025-05-21
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
