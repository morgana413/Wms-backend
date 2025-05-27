package com.example.warehousedemo1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value = "Goodstype对象", description = "")
public class Goodstype implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("分类名")
    private String name;

    @ApiModelProperty("备注")
    private String remark;
}
