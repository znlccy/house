package com.znlccy.house.index.serviceImpl;

import com.znlccy.house.common.model.Community;
import com.znlccy.house.index.service.CommunityReceptionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/23-11:11
 * @Version: v1.0.0
 * @Comment: 小区服务实现类
 */
@Service
public class CommunityReceptionServiceImpl implements CommunityReceptionService {

    @Override
    public List<Community> findAllCommunity() {
        return null;
    }

    @Override
    public Community findCommunityById(Long cid) {
        return null;
    }

    @Override
    public boolean saveCommunity(Community community) {
        return false;
    }

    @Override
    public boolean updateCommunity(Community community) {
        return false;
    }

    @Override
    public boolean deleteCommunityById(Long cid) {
        return false;
    }
}
