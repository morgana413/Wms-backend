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
 * 系统菜单表
 * </p>
 *
 * @author sino
 * @since 2025-05-21
 */
@Getter
@Setter
@ApiModel(value = "Menu对象", description = "系统菜单表")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("菜单编码")
    @TableField("menuCode")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField("menuName")
    private String menuName;

    @ApiModelProperty("菜单级别(1-一级菜单/2-二级菜单)")
    @TableField("menuLevel")
    private Byte menuLevel;

    @ApiModelProperty("父级菜单编码")
    @TableField("menuParentCode")
    private String menuParentCode;

    @ApiModelProperty("路由路径或方法名")
    @TableField("menuClick")
    private String menuClick;

    @ApiModelProperty("权限标识(0-超级管理员,1-管理员,2-用户)")
    @TableField("menuRight")
    private String menuRight;

    @ApiModelProperty("组件路径")
    @TableField("menuComponent")
    private String menuComponent;

    @ApiModelProperty("图标类名")
    @TableField("menuIcon")
    private String menuIcon;
}
