package com.znlccy.house.index.service;

import com.znlccy.house.common.model.Agency;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:25
 * @version: v.1.0.0
 * @introduce: 经济机构服务接口类
 */
public interface AgencyService {

    /* 声明查询所有房屋机构 */
    List<Agency> findAllAgency();

    /* 声明通过主键查询房屋机构 */
    Agency findAgencyById(Long aid);

    /* 声明添加房屋机构 */
    boolean saveAgency(Agency agency);

    /* 声明更新房屋机构 */
    boolean updateAgency(Agency agency);

    /* 声明通过主键删除房屋机构 */
    boolean deleteAgencyById(Long aid);
}
