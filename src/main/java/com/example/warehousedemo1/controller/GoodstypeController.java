package com.example.warehousedemo1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.warehousedemo1.common.QueryPageParam;
import com.example.warehousedemo1.common.Result;
import com.example.warehousedemo1.entity.Goodstype;
import com.example.warehousedemo1.entity.Storage;
import com.example.warehousedemo1.entity.User;
import com.example.warehousedemo1.service.IGoodstypeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sino
 * @since 2025-05-27
 */
@RestController
@RequestMapping("/goodstype")
public class GoodstypeController {
    @Autowired
    IGoodstypeService goodstypeService;
    @PostMapping("/save")
    public Result saveStorage(@RequestBody Goodstype goodstype) {
        return goodstypeService.save(goodstype)?Result.SUCCESS():Result.FAILURE();
    }
    @PostMapping("/update")
    public Result updateStorage(@RequestBody Goodstype goodstype) {
        return goodstypeService.updateById(goodstype)?Result.SUCCESS():Result.FAILURE();
    }

    @GetMapping("/del")
    public Result deleteStorage(@RequestParam String id) {
        return goodstypeService.removeById(id)?Result.SUCCESS():Result.FAILURE();
    }
    @PostMapping("/listPage")
    public Result listPage(@RequestBody QueryPageParam queryPageParam) {
        HashMap param = queryPageParam.getParam();
        String name = (String) param.get("name");

        Page<Goodstype> page = new Page();
        page.setCurrent(queryPageParam.getPageNum());
        page.setSize(queryPageParam.getPageSize());
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(name) && !"null".equals(name)) {
            queryWrapper.like(User::getName, name);
        }
        IPage result = goodstypeService.pageCC(page, queryWrapper);
        return Result.SUCCESS(result.getRecords(), result.getTotal());
    }
}
