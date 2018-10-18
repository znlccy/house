package com.znlccy.house.common.model;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-11:02
 * @Version: v1.0.0
 * @Comment: 小区实体类
 */

@Entity
public class Community implements Serializable {

    /* 声明小区主键 */
    private Long cid;

    /* 声明小区城市编码 */
    private String cityCode;

    /* 声明小区名称 */
    private String name;

    /* 声明小区城市名称 */
    private String cityName;

    /* 实现获取小区主键 */
    public Long getCid() {
        return cid;
    }

    /* 实现设置小区主键 */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /* 实现获取小区城市编码 */
    public String getCityCode() {
        return cityCode;
    }

    /* 实现设置小区城市编码 */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /* 实现获取小区名称 */
    public String getName() {
        return name;
    }

    /* 实现设置小区名称 */
    public void setName(String name) {
        this.name = name;
    }

    /* 实现获取小区城市名称 */
    public String getCityName() {
        return cityName;
    }

    /* 实现设置小区城市名称 */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
