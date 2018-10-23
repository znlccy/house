package com.znlccy.house.index.serviceImpl;

import com.znlccy.house.common.mapper.AgencyMapper;
import com.znlccy.house.common.model.Agency;
import com.znlccy.house.index.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:27
 * @version: v.1.0.0
 * @introduce: 经济机构服务实现类
 */
@Service
public class AgencyServiceImpl implements AgencyService {

    @Autowired
    private AgencyMapper agencyMapper;

    @Override
    public List<Agency> findAllAgency() {
        return null;
    }

    @Override
    public Agency findAgencyById(Long aid) {
        return null;
    }

    @Override
    public void saveAgency(Agency agency) {

    }

    @Override
    public void updateAgency(Agency agency) {

    }

    @Override
    public void deleteAgencyById(Long aid) {

    }
}
