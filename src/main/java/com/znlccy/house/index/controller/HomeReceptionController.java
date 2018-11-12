package com.znlccy.house.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:24
 * @version: v.1.0.0
 * @introduce: 首页控制器
 */

@Controller
public class HomeReceptionController {

    @GetMapping(value = "/")
    public String index() {
        return "";
    }

}
