package com.znlccy.house.index.controller;

import com.znlccy.house.common.model.Agency;
import com.znlccy.house.index.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:22
 * @version: v.1.0.0
 * @introduce: 经济机构控制器
 */

@Controller
@RequestMapping(value = "/index/agency")
public class AgencyController {

    /**
     * 注入房屋机构服务
     */
    @Autowired
    private AgencyService agencyService;

    /**
     * 查询所有房屋机构
     * @return
     */
    @GetMapping(value = "/all")
    public String findAllAgency() {
        return "/index/agency/all";
    }

    /**
     * 查询房屋机构详情
     * @param aid
     * @return
     */
    @GetMapping(value = "/get/#{aid}")
    public String findAgencyById(@PathVariable Long aid) {
        return "/index/agency/detail";
    }

    /**
     * 添加房屋机构
     * @param agency
     * @return
     */
    @PostMapping(value = "/save")
    public String saveAgency(@RequestBody Agency agency) {
        return "/index/agency/save";
    }

    /**
     * 更新房屋机构
     * @param agency
     * @return
     */
    @PutMapping(value = "/update")
    public String updateAgency(@RequestBody Agency agency) {
        return "/index/agency/update";
    }

    /**
     * 删除房屋机构
     * @param aid
     * @return
     */
    @DeleteMapping(value = "/delete/#{aid}")
    public String deleteAgency(@PathVariable Long aid) {
        return "/index/agency/delete";
    }
}
