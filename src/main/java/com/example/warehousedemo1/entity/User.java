package com.example.warehousedemo1.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2025-05-19
 */
@Getter
@Setter
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("账号")
    private String no;

    @ApiModelProperty("名字")
    private String name;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("角色，0超级管理员，1管理员，2普通账号")
    private Integer roleId;

    @ApiModelProperty("是否有效，Y有效，其他无效")
    private String isValid;
}
