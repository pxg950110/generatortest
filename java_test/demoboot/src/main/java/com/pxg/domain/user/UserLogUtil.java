package com.pxg.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 14:16
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public class UserLogUtil implements Serializable {

    private static final long serialVersionUID = -4962284175884077782L;
    private int userId;
    private int type;
    private UserLogData lastData;
    private UserLogData newData;
    private long time;

    public UserLogUtil() {
    }

    public UserLogUtil(int userId, int type, UserLogData lastData, UserLogData newData) {
        this.userId = userId;
        this.type = type;
        this.lastData = lastData;
        this.newData = newData;
        this.time = new Date().getTime();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public UserLogData getLastData() {
        return lastData;
    }

    public void setLastData(UserLogData lastData) {
        this.lastData = lastData;
    }

    public UserLogData getNewData() {
        return newData;
    }

    public void setNewData(UserLogData newData) {
        this.newData = newData;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserLogUtil{" +
                "userId=" + userId +
                ", type=" + type +
                ", lastData=" + lastData +
                ", newData=" + newData +
                ", time=" + time +
                '}';
    }
}
