package com.znlccy.house.common.result;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringEscapeUtils;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 22:39
 * @version: v.1.0.0
 * @introduce: 返回信息
 */
public class ResultMsg {

    /* 声明错误信息key */
    public static final String errorMsgKey = "errorMsg";

    /* 声明成功信息key */
    public static final String successMsgKey = "successMsg";

    /* 声明错误信息 */
    private String errorMsg;

    /* 声明成功信息 */
    private String successMsg;

    public boolean isSuccess() {
        return successMsg == null;
    }

    /* 实现获得错误信息 */
    public String getErrorMsg() {
        return errorMsg;
    }

    /* 实现设置错误信息 */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /* 实现获取成功信息 */
    public String getSuccessMsg() {
        return successMsg;
    }

    /* 实现设置成功信息 */
    public void setSuccessMsg(String successMsg) {
        this.successMsg = successMsg;
    }

    public static ResultMsg errorMsg(String msg) {
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setErrorMsg(msg);
        return resultMsg;
    }

    public static ResultMsg successMsg(String msg) {
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setSuccessMsg(msg);
        return resultMsg;
    }

    public Map<String, String> asMap() {
        Map<String, String> map = Maps.newHashMap();
        map.put(successMsgKey, successMsg);
        map.put(errorMsgKey, errorMsg);
        return map;
    }

    public String asUrlParams() {
        Map<String, String> map = asMap();
        Map<String, String> newMap = new HashMap();
        map.forEach((k,v) ->{
            if (v!=null) {
                newMap.put(k, URLEncoder.encode());
            }
        });
    }
}
