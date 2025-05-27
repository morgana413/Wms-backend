package com.example.warehousedemo1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.warehousedemo1.common.QueryPageParam;
import com.example.warehousedemo1.common.Result;
import com.example.warehousedemo1.entity.Goods;
import com.example.warehousedemo1.entity.Record;
import com.example.warehousedemo1.entity.Storage;
import com.example.warehousedemo1.entity.User;
import com.example.warehousedemo1.service.IRecordService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/record")
public class RecordController {

    @Autowired
    IRecordService recordService;
    @PostMapping("/listPage")
    public Result listPage(@RequestBody QueryPageParam queryPageParam) {
        HashMap param = queryPageParam.getParam();
        String name = (String) param.get("name");
        String goodstype = (String) param.get("goodstype");
        String storage = (String) param.get("storage");
        Page<Record> page = new Page();
        page.setCurrent(queryPageParam.getPageNum());
        page.setSize(queryPageParam.getPageSize());
       QueryWrapper<Record> queryWrapper = new QueryWrapper<>();
       queryWrapper.apply("a.goods=b.id and b.storage=c.id and b.goodsType=d.id");
        if (StringUtils.isNotBlank(name) && !"null".equals(name)) {
           queryWrapper.like("b.name", name);
        }
        if (StringUtils.isNotBlank(goodstype) && !"null".equals(goodstype)) {
            queryWrapper.eq("d.id", goodstype);
        }
        if (StringUtils.isNotBlank(storage) && !"null".equals(storage)) {
            queryWrapper.like("c.id", storage);
        }

        IPage result = recordService.pageCC(page, queryWrapper);
        return Result.SUCCESS(result.getRecords(), result.getTotal());
    }
}
