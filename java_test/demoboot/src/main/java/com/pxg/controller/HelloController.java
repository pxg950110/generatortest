package com.pxg.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 13:15
 * @Version v1.0
 * @mail pxg950110@163.com
 */
@RestController
@Api("hello")
public class HelloController implements Serializable {
    private static final long serialVersionUID = 369252106943069158L;

    @ApiOperation("测试")
    @GetMapping("/")
    public String hello() {
        return "hello world";
    }
}
