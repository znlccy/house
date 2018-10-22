package com.znlccy.house.index.controller;

import com.znlccy.house.common.model.User;
import com.znlccy.house.common.result.ResultMsg;
import com.znlccy.house.common.validate.UserValidate;
import com.znlccy.house.index.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-19:27
 * @Version: v1.0.0
 * @Comment: 用户控制器
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册提交 1.注册验证 2.发送邮件 3.验证失败重定向到注册页面
     * 注册页面获取:根据account对象为根据判断是否注册页获取请求
     * @param account
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "accounts/register")
    public String accountRegister(User account, ModelMap modelMap) {
        if (account == null || account.getName() == null) {
            return  "/index/user/account/register";
        }
        //用户验证
        ResultMsg resultMsg = UserValidate.validate(account);
        return "";
    }

}
