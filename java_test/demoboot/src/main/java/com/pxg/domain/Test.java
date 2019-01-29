package com.pxg.domain;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.pxg.domain.user.User;
import com.pxg.domain.user.UserLogData;
import com.pxg.domain.user.UserLogUtil;
import com.sun.tools.javac.Main;
import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @Author pxg
 * @Date 2019/1/28
 * @Time 11:04
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public class Test implements Serializable {
    private static final long serialVersionUID = 1635498156135156506L;

    public static void main(String arg0[]) {
        User user = new User("aaa", "123456");
        UserLogUtil userLogUtil = new UserLogUtil();
        userLogUtil.setUserId(12);
        userLogUtil.setTime(new Date().getTime());
        int[] permission = {1, 2, 3};
        userLogUtil.setLastData(new UserLogData(12, "1243", permission));
        userLogUtil.setNewData(new UserLogData(12, "123455", permission));
        JSONObject jsonObject = JSONObject.fromObject(userLogUtil);
        String json = jsonObject.toString();
        System.out.println(json);
    }
}
