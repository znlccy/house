package com.znlccy.house.index.controller;

import com.znlccy.house.common.model.Community;
import com.znlccy.house.index.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/23-11:12
 * @Version: v1.0.0
 * @Comment: 小区控制器
 */

@Controller
@RequestMapping(value = "/index/community")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    /**
     * 查询所有小区
     * @return
     */
    @GetMapping(value = "/all")
    public String findAllCommunity() {
        return "/index/community/all";
    }

    /**
     * 查询小区详情
     * @param cid
     * @return
     */
    @GetMapping(value = "/get/#{cid}")
    public String findCommunityById(@PathVariable Long cid) {
        return "/index/community/detail";
    }

    /**
     * 添加小区
     * @param community
     * @return
     */
    @PostMapping(value = "/save")
    public String saveCommunity(@RequestBody Community community) {
        return "/index/community/save";
    }

    /**
     * 更新小区
     * @param community
     * @return
     */
    @PutMapping(value = "/update")
    public String updateCommunity(@RequestBody Community community) {
        return "/index/community/update";
    }

    /**
     * 删除小区
     * @param cid
     * @return
     */
    @DeleteMapping(value = "/delete/#{cid}")
    public String deleteCommunityById(@PathVariable Long cid) {
        return "/index/community/delete";
    }
}
