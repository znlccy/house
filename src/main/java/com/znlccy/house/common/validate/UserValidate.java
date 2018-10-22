package com.znlccy.house.common.validate;

import com.znlccy.house.common.model.User;
import com.znlccy.house.common.result.ResultMsg;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 22:36
 * @version: v.1.0.0
 * @introduce: 用户验证类
 */
public class UserValidate {

    /* 用户验证 */
    public static ResultMsg validate(User account) {
        if (StringUtils.isBlank(account.getEmail())) {
            return ResultMsg.errorMsg("邮箱有误");
        }
        if (StringUtils.isBlank(account.getName())) {
            return ResultMsg.errorMsg("名字有误");
        }
        if (StringUtils.isBlank(account.getPassword()) || StringUtils.isBlank(account.getConfirmPassword()) || !account.getPassword().equals(account.getConfirmPassword())) {
            return ResultMsg.errorMsg("密码有误");
        }
        if (account.getPassword().length()<6) {
            return ResultMsg.errorMsg("密码大于6位");
        }
        return ResultMsg.successMsg("");
    }
}
