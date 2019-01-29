package com.pxg.domain.user;

import net.sf.json.JSONObject;

import java.io.Serializable;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 14:15
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public class UserLog implements Serializable {

    private static final long serialVersionUID = -1369986717399719867L;
    private int id;
    private UserLogUtil userLogUtil;
    private String userLog;

    public String getUserLog() {
        return userLog;
    }

    public void setUserLog() {
        this.userLog = JSONObject.fromObject(userLogUtil).toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserLogUtil getUserLogUtil() {
        return userLogUtil;
    }

    public void setUserLogUtil(UserLogUtil userLogUtil) {
        this.userLogUtil = userLogUtil;
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "id=" + id +
                ", userLogUtil=" + userLogUtil +
                '}';
    }
}
