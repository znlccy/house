package com.znlccy.house.index.controller;

import com.znlccy.house.common.model.House;
import com.znlccy.house.index.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:16
 * @Version: v1.0.0
 * @Comment: 房屋控制器
 */

@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping(value = "/house/all")
    public List<House> findALlHouse() {
        return houseService.findAllHouse();
    }
}
