package com.pxg.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.Serializable;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 9:42
 * @Version v1.0
 * @mail pxg950110@163.com
 */
@Configuration
@EnableSwagger2
public class HelloSwaggerConfig implements Serializable {

    private static final long serialVersionUID = 5764409316854972487L;

    //docket
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()//
                .apis(RequestHandlerSelectors.basePackage("com.pxg.controller"))//
                .paths(PathSelectors.any())
                .build();
    }


    //APIINfo
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("demoboot").build();
    }
}
