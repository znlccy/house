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

    /* 声明查询所有房屋 */
    List<House> findAllHouse();

    /* 声明通过主键查询房屋 */
    House findHouseById(Long hid);

    /* 声明添加房屋 */
    void saveHouse(House house);

    /* 声明更新房屋 */
    void updateHouse(House house);

    /* 声明通过主键删除房屋 */
    void deleteHouseById(Long hid);
}
