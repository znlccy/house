package com.znlccy.house.index.controller;

import com.znlccy.house.common.model.House;
import com.znlccy.house.index.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:16
 * @Version: v1.0.0
 * @Comment: 房屋控制器
 */

@Controller
@RequestMapping(value = "/index/house")
public class HouseController {

    /**
     * 注入房屋服务
     */
    @Autowired
    private HouseService houseService;

    /**
     * 查询所有房屋
     * @return
     */
    @GetMapping(value = "/all")
    public List<House> findALlHouse() {
        return houseService.findAllHouse();
    }

    /**
     * 查询房屋详情
     * @return
     */
    @GetMapping(value = "/get/#{hid}")
    public String findHouseById(@PathVariable Long hid) {
        return "/index/house/detail";
    }

    /**
     * 添加房屋
     * @param house
     * @return
     */
    @PostMapping(value = "/save")
    public String saveHouse(@RequestBody House house) {
        return "/index/house/save";
    }

    /**
     * 更新房屋
     * @param house
     * @return
     */
    @PutMapping(value = "/update")
    public String updateHouse(@RequestBody House house) {
        return "/index/house/update";
    }

    /**
     * 删除房屋
     * @param hid
     * @return
     */
    @DeleteMapping("/delete/#{hid}")
    public String deleteHouseById(@PathVariable Long hid) {
        return "/index/house/delete";
    }
}
