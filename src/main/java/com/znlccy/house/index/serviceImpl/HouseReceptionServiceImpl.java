package com.znlccy.house.index.serviceImpl;

import com.znlccy.house.common.mapper.HouseMapper;
import com.znlccy.house.common.model.House;
import com.znlccy.house.index.service.HouseReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:17
 * @Version: v1.0.0
 * @Comment: 房屋服务实现类
 */
@Service
public class HouseReceptionServiceImpl implements HouseReceptionService {

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public List<House> findAllHouse() {
        return null;
    }

    @Override
    public House findHouseById(Long hid) {
        return null;
    }

    @Override
    public boolean saveHouse(House house) {
        return false;
    }

    @Override
    public boolean updateHouse(House house) {
        return false;
    }

    @Override
    public boolean deleteHouseById(Long hid) {
        return false;
    }
}
