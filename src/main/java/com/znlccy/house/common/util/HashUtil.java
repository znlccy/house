package com.znlccy.house.common.util;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

/**
 * @author: Adminstrator
 * @date: 2018/10/23 22:19
 * @version: v.1.0.0
 * @introduce: 
 */
public class HashUtil {

    /* 加密函数 */
    private static final HashFunction FUNCTION = Hashing.md5();

    /* 加密密盐 */
    private static final String SALT = "znlccy@0603";

    /* 加密函数 */
    public static String encryPassword(String password) {
        HashCode hashCode = FUNCTION.hashString(password+SALT, Charset.forName("UTF-8"));
        return hashCode.toString();
    }

}
