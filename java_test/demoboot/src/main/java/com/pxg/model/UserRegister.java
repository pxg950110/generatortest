package com.pxg.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import java.io.Serializable;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 13:43
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public class UserRegister implements Serializable {

    private static final long serialVersionUID = 5228586895272514968L;
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("密码")
    private String password;
}
