package com.pxg.database;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.Serializable;

/**
 * @description 第一数据源
 * @Author pxg
 * @Date 2019/1/28
 * @Time 10:23
 * @Version v1.0
 * @mail pxg950110@163.com
 */
@Configuration
@MapperScan(basePackages = "com.pxg.mapper1", sqlSessionTemplateRef = "oneSqlSessionTemplate")
public class OneDatasourceConfig implements Serializable {
    private static final long serialVersionUID = 4062644210201627568L;

    //配置第一数据源 主数据源
    @Bean(name = "oneDataSource")
    @ConfigurationProperties(prefix = "spring.one.datasource")
    @Primary
    public DataSource oneDataSource() {
        return DataSourceBuilder.create().build();
    }

    //配置session工厂
    @Bean(name = "oneSqlSessionFactory")
    @Primary
    public SqlSessionFactory oneSqlSessionFactory(@Qualifier("oneDataSource") DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        try {
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    //配置事务管理
    @Bean(name = "oneDataSourceTransactionManager")
    @Primary
    public DataSourceTransactionManager oneDataSourceTransactionManager(@Qualifier("oneDataSource") DataSource dataSource) {

        return new DataSourceTransactionManager(dataSource);
    }

    //配置模板
    @Bean(name = "oneSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate oneSqlSessionTemplate(@Qualifier("oneSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


}
