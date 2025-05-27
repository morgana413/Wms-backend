package com.example.warehousedemo1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author sino
 * @since 2025-05-27
 */
@Getter
@Setter
@ApiModel(value = "Goods对象", description = "")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("货名")
    private String name;

    @ApiModelProperty("仓库")
    private Integer storage;

    @ApiModelProperty("分类")
    @TableField("goodsType")
    private Integer goodsType;

    @ApiModelProperty("数量")
    private Integer count;

    @ApiModelProperty("备注")
    private String remark;
}
