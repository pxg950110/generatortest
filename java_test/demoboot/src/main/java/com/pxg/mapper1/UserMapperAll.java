package com.pxg.mapper1;

import com.pxg.domain.user.Permission;
import com.pxg.domain.user.User;
import com.pxg.domain.user.UserLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 14:48
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public interface UserMapperAll {
    /**
     * *********************USER的接口集合*****************************
     */

    /**
     * *********************查询接口的集合**************************
     * ************************SELECT********************************
     */

    /**
     * *********************插入接口的集合**************************
     * ************************INSERT********************************
     */
    /**
     * 插入 t_user.tb_user表中
     *
     * @param user
     */
    @Insert("insert into t_user.tb_user(user_name,password,create_time,is_deleted) values" +
            "(#{userName},#{password},now(),0::boolean)")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);

    /**
     * 插入t_user.tb_permissions表
     *
     * @param permission
     */
    @Insert("insert into t_user.tb_permissions(user_id,permission_code,permission_name,create_time)" +
            "values(#{userId},#{permissonCode},#{permissonName},now())")
    void insertPermission(Permission permission);

    //插入日志表
    @Insert("insert into t_user.user_update_log(user_log,create_time) values(cast(#{userLog} as json),now())")
    void insertUserLog(UserLog userLog);
    /***********************删除接口的集合**************************
     * ************************DELETe********************************
     */


    /**
     * *********************更新数据的集合**************************
     * ************************UPDATE********************************
     */
}
