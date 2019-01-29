package com.pxg.domain.user;

import java.io.Serializable;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 14:14
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4979301049822404605L;
    //用户id
    private int id;
    private String userName;
    private String password;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
