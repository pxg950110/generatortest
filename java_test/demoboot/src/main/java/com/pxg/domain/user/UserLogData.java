package com.pxg.domain.user;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 14:25
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public class UserLogData implements Serializable {
    private static final long serialVersionUID = -2714542650892018796L;
    private int userId;
    private String password;
    private int[] permission;

    public UserLogData() {
    }

    public UserLogData(int userId, String password, int[] permission) {
        this.userId = userId;
        this.password = password;
        this.permission = permission;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int[] getPermission() {
        return permission;
    }

    public void setPermission(int[] permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "UserLogData{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", permission=" + Arrays.toString(permission) +
                '}';
    }
}
