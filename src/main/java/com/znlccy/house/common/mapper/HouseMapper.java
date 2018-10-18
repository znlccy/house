package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.House;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:13
 * @Version: v1.0.0
 * @Comment: 房屋映射
 */

@Mapper
public interface HouseMapper {

    List<House> findAllHouse();
}
