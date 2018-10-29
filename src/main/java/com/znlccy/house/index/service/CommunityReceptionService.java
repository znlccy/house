package com.znlccy.house.index.service;

import com.znlccy.house.common.model.Community;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/23-11:11
 * @Version: v1.0.0
 * @Comment: 小区服务接口类
 */
public interface CommunityReceptionService {

    /* 声明查询所有小区 */
    List<Community> findAllCommunity();

    /* 声明通过主键查找小区 */
    Community findCommunityById(Long cid);

    /* 声明保存小区 */
    boolean saveCommunity(Community community);

    /* 声明更新小区 */
    boolean updateCommunity(Community community);

    /* 声明通过主键删除小区 */
    boolean deleteCommunityById(Long cid);
}
