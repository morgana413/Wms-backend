package com.example.warehousedemo1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.warehousedemo1.common.QueryPageParam;
import com.example.warehousedemo1.common.Result;
import com.example.warehousedemo1.entity.User;
import com.example.warehousedemo1.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        List list = userService.lambdaQuery()
                .eq(User::getNo,user.getNo())
                .eq(User::getPassword,user.getPassword()).list();
        return list.size()>0?Result.SUCCESS(list.get(0)):Result.FAILURE();
    }
    //新增
    @PostMapping("/save")
    public Result saveUser(@RequestBody User user) {
        return userService.save(user)?Result.SUCCESS():Result.FAILURE();
    }
    @PostMapping("/update")
    public Result updateUser(@RequestBody User user) {
        return userService.updateById(user)?Result.SUCCESS():Result.FAILURE();
    }

    @GetMapping("/del")
    public Result deleteUser(@RequestParam String id) {
        return userService.removeById(id)?Result.SUCCESS():Result.FAILURE();
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
    public Result listP(@RequestBody User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(user.getName())){
            queryWrapper.like(User::getName, user.getName());
        }
        return Result.SUCCESS(userService.list(queryWrapper));
    }

    @PostMapping("/listPage")
    public List<User> listPage(@RequestBody QueryPageParam queryPageParam) {
        Page<User> page = new Page<>(queryPageParam.getPageNum(), queryPageParam.getPageSize());
        return null;
    }
    @PostMapping("/listPageC1")
    public Result listPageC1(@RequestBody QueryPageParam queryPageParam) {
        HashMap param = queryPageParam.getParam();
        String name = (String) param.get("name");
        String sex = (String) param.get("sex");
        Page<User> page = new Page();
        page.setCurrent(queryPageParam.getPageNum());
        page.setSize(queryPageParam.getPageSize());
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(name) && !"null".equals(name)) {
            queryWrapper.like(User::getName, name);
        }
        if (StringUtils.isNotBlank(sex)) {
            queryWrapper.eq(User::getSex, sex);
        }
       // IPage result = userService.pageC(page);
        IPage result = userService.pageCC(page, queryWrapper);
        System.out.println("total===" + result.getTotal());
        return Result.SUCCESS(result.getRecords(), result.getTotal());
    }

    @GetMapping("/findByNo")
    public Result findByNo(@RequestParam String no) {
        List list = userService.lambdaQuery().eq(User::getNo, no).list();
        return list.size()>0?Result.SUCCESS(list):Result.FAILURE();
    }

}
