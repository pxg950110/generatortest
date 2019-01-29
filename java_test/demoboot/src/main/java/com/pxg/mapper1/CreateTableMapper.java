package com.pxg.mapper1;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @description 建库和建表语句
 * @Author pxg
 * @Date 2019/1/28
 * @Time 10:15
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public interface CreateTableMapper {

    /**
     * 建schema语句
     *
     * @param schemaName
     * @return
     */
    @Update(" create schema   \"${schemaName}\"  ")
    void createSchame(@Param("schemaName") String schemaName);
}
