package com.znlccy.house.index.service;

import com.znlccy.house.common.model.House;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:17
 * @Version: v1.0.0
 * @Comment: 房屋服务接口类
 */

public interface HouseService {

    List<House> findAllHouse();
}
