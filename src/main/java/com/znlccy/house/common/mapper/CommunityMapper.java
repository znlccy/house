package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.Community;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:34
 * @Version: v1.0.0
 * @Comment: 小区映射接口
 */

@Mapper
public interface CommunityMapper {

    List<Community> findAllCommunity();

    Community findCommunityById(Long cid);

    void saveCommunity(Community community);

    void updateCommunity(Community community);

    void deleteCommunityById(Long cid);
}
