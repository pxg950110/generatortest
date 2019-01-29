package com.pxg.util;

import io.jsonwebtoken.SignatureAlgorithm;

import javax.xml.datatype.DatatypeConstants;
import java.io.Serializable;
import java.util.Date;

/**
 * @description 生成token的工具类
 * @Author pxg
 * @Date 2019/1/28
 * @Time 13:26
 * @Version v1.0
 * @mail pxg950110@163.com
 */
public class TokenUtils implements Serializable {

    private static final long serialVersionUID = -4080037122836291953L;

    //生成token
    public static String createJwtToken(String id, String issuer, String subject, long ttlMillis) {
        //签名算法，对token进行签名
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //生成签发时间
        long newMillis = System.currentTimeMillis();
        System.out.println(newMillis);
        Date now = new Date(newMillis);
        //通过秘钥签名jwt
//        byte[] apiKeySecretBytes=
        return null;
    }
}
