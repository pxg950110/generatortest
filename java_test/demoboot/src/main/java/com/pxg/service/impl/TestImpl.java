package com.pxg.service.impl;

import com.pxg.domain.user.*;
import com.pxg.mapper1.CreateTableMapper;
import com.pxg.mapper1.UserMapperAll;
import com.pxg.service.TestService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Base64;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 10:43
 * @Version v1.0
 * @mail pxg950110@163.com
 */
@Service
public class TestImpl implements TestService, Serializable {
    private static final long serialVersionUID = -4415019033255109204L;

    @Autowired
    private CreateTableMapper createTableMapper;
    @Autowired
    private UserMapperAll userMapperAll;

    @Override
    @Transactional
    public void test(User user) {
        userMapperAll.insertUser(user);
        userMapperAll.insertPermission(new Permission(user.getId(), 1, "login"));
        userMapperAll.insertPermission(new Permission(user.getId(), 2, "write"));
        userMapperAll.insertPermission(new Permission(user.getId(), 3, "update"));
        userMapperAll.insertPermission(new Permission(user.getId(), 4, "delete"));
        userMapperAll.insertPermission(new Permission(user.getId(), 5, "admin"));
        int[] permission = {1, 2, 3, 4, 5};
        UserLogUtil userLogUtil = new UserLogUtil(user.getId(), 1, null, new UserLogData(user.getId(), user.getPassword(), permission));
        UserLog userLog = new UserLog();
        userLog.setUserLogUtil(userLogUtil);
        userLog.setUserLog();
        userMapperAll.insertUserLog(userLog);

    }

}
