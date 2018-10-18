package com.znlccy.house.common.model;

import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-10:37
 * @Version: v1.0.0
 * @Comment: 房屋实体类
 */

@Entity
public class House implements Serializable {

    /* 声明房屋主键 */
    private Long hid;

    /* 声明房屋名称 */
    private String name;

    /* 声明房屋类型, 1:销售 2:出租 */
    private Short type;

    /* 声明房租价格 */
    private BigDecimal price;

    /* 声明房屋图片 */
    private String picture;

    /* 声明房屋面积 */
    private Float area;

    /* 声明房屋卧室数量 */
    private Integer beds;

    /* 圣经房屋卫生室数量 */
    private Integer baths;

    /* 声明房屋评级 */
    private Double rating;

    /* 声明房屋描述 */
    private String remarks;

    /* 声明房屋属性 */
    private String properties;

    /* 声明房屋户型图 */
    private String floorPlan;

    /* 声明房屋标签 */
    private String tags;

    /* 声明房屋城市名称 */
    private Long cityId;

    /* 声明房屋小区名称 */
    private Long communityId;

    /* 声明房屋地址 */
    private String address;

    /* 声明房屋状态 1:上架 2:下架*/
    private Short state;

    /* 声明房屋创建时间 */
    private Date createTime;

    /* 声明房屋更新时间 */
    private Date updateTime;

    /* 实现获取房屋主键 */
    public Long getHid() {
        return hid;
    }

    /* 实现设置房屋主键 */
    public void setHid(Long hid) {
        this.hid = hid;
    }

    /* 实现获取房屋名称 */
    public String getName() {
        return name;
    }

    /* 实现设置房屋名称 */
    public void setName(String name) {
        this.name = name;
    }

    /* 实现获取房屋类型 */
    public Short getType() {
        return type;
    }

    /* 实现设置房屋类型 */
    public void setType(Short type) {
        this.type = type;
    }

    /* 实现获取房屋价格 */
    public BigDecimal getPrice() {
        return price;
    }

    /* 实现设置房屋价格 */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /* 实现获取房屋图片 */
    public String getPicture() {
        return picture;
    }

    /* 实现设置房屋图片 */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /* 实现获取房屋面积 */
    public Float getArea() {
        return area;
    }

    /* 实现设置房屋面积 */
    public void setArea(Float area) {
        this.area = area;
    }

    /* 实现获取房屋卧室数量 */
    public Integer getBeds() {
        return beds;
    }

    /* 实现设置房屋卧室数量 */
    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    /* 实现获取房屋卫生间数量 */
    public Integer getBaths() {
        return baths;
    }

    /* 实现设置房屋卫生间数量 */
    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    /* 实现获取房屋评级 */
    public Double getRating() {
        return rating;
    }

    /* 实现设置房屋评级 */
    public void setRating(Double rating) {
        this.rating = rating;
    }

    /* 实现获取房屋备注 */
    public String getRemarks() {
        return remarks;
    }

    /* 实现设置房屋备注 */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /* 实现获取房屋属性 */
    public String getProperties() {
        return properties;
    }

    /* 实现设置房屋属性 */
    public void setProperties(String properties) {
        this.properties = properties;
    }

    /* 实现获取房屋户型图片 */
    public String getFloorPlan() {
        return floorPlan;
    }

    /* 实现设置房屋户型图片 */
    public void setFloorPlan(String floorPlan) {
        this.floorPlan = floorPlan;
    }

    /* 实现获取房屋标签 */
    public String getTags() {
        return tags;
    }

    /* 实现设置房屋标签 */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /* 实现获取房屋小区城市 */
    public Long getCityId() {
        return cityId;
    }

    /* 实现设置房屋小区城市 */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /* 实现获取房屋小区名称 */
    public Long getCommunityId() {
        return communityId;
    }

    /* 实现设置房屋小区名称 */
    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    /* 实现获取房屋地址 */
    public String getAddress() {
        return address;
    }

    /* 实现设置房屋地址 */
    public void setAddress(String address) {
        this.address = address;
    }

    /* 实现获取房屋状态 */
    public Short getState() {
        return state;
    }

    /* 实现设置房屋状态 */
    public void setState(Short state) {
        this.state = state;
    }

    /* 实现获取房屋创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* 实现设置房屋创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* 实现获取房屋更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /* 实现设置房屋更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
