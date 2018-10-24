package com.znlccy.house.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/22-17:26
 * @Version: v1.0.0
 * @Comment: 博客控制器
 */
/*@Controller
@RequestMapping(value = "/admin/blog")*/
public class BlogController {

    /*@GetMapping(value = "/all")*/
    public String findAllBlog() {

        return "admin/blog/all";
    }
}
