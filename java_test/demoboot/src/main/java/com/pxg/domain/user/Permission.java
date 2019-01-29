package com.pxg.domain.user;

import java.io.Serializable;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 14:15
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public class Permission implements Serializable {

    private static final long serialVersionUID = 8564829817861866876L;
    private int id;
    private int userId;
    private int permissonCode;
    private String permissonName;

    public Permission() {
    }

    public Permission(int userId, int permissonCode, String permissonName) {
        this.userId = userId;
        this.permissonCode = permissonCode;
        this.permissonName = permissonName;
    }

    public Permission(int userId, int permissonCode) {
        this.userId = userId;
        this.permissonCode = permissonCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPermissonCode() {
        return permissonCode;
    }

    public void setPermissonCode(int permissonCode) {
        this.permissonCode = permissonCode;
    }

    public String getPermissonName() {
        return permissonName;
    }

    public void setPermissonName(String permissonName) {
        this.permissonName = permissonName;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", userId=" + userId +
                ", permissonCode=" + permissonCode +
                ", permissonName='" + permissonName + '\'' +
                '}';
    }
}
