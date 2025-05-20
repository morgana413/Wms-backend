package com.example.warehousedemo1.controller;

import ch.qos.logback.core.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.warehousedemo1.common.QueryPageParam;
import com.example.warehousedemo1.entity.User;
import com.example.warehousedemo1.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sino
 * @since 2025-05-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    public List<User> getUsers() {
        return userService.list();
    }
    //新增
    @PostMapping("/save")
    public boolean saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    //修改
    @PostMapping("/mod")
    public boolean modUser(@RequestBody User user) {
        return userService.updateById(user);
    }

    //新增或修改
    @PostMapping("/saveOrMod")
    public boolean saveOrUpdateUser(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    //删除
    @GetMapping("/delete")
    public boolean deleteUser(Integer id) {
        return userService.removeById(id);
    }
    //查询（模糊，匹配）
    @PostMapping("/listP")
    public List<User> listP(@RequestBody User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(user.getName())){
            queryWrapper.like(User::getName, user.getName());
        }
        return userService.list(queryWrapper);
    }

    @PostMapping("/listPage")
    public List<User> listPage(@RequestBody QueryPageParam queryPageParam) {
        Page<User> page = new Page<>(queryPageParam.getPageNum(), queryPageParam.getPageSize());
        return null;
    }
}
