package com.example.warehousedemo1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@ApiModel(value = "Record对象", description = "")
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("货品id")
    private Integer goods;

    @ApiModelProperty("取货人/补货人")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("操作人id")
    @TableField("admin_id")
    private Integer adminId;

    @ApiModelProperty("数量")
    private Integer count;

    @ApiModelProperty("操作时间")
    private LocalDateTime createtime;

    @ApiModelProperty("备注")
    private String remark;

    @TableField(exist = false)
    private String action;
}
