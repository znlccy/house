package com.znlccy.house.common.model;

import javax.persistence.*;
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
@Table(name = "tb_house")
public class House implements Serializable {

    /* 声明房屋主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hid", columnDefinition = "bigint(20) comment '房屋主键'")
    private Long hid;

    /* 声明房屋名称 */
    @Column(name = "name", columnDefinition = "varchar(20) default '' comment '房屋名称'", nullable = false)
    private String name;

    /* 声明房屋类型, 1:销售 2:出租 */
    @Column(name = "type", columnDefinition = "tinyint(1) default 0 comment '房屋类型'", nullable = false)
    private Short type;

    /* 声明房租价格 */
    @Column(name = "price", columnDefinition = "decimal(12,2) default 0.00 comment '房屋价格'", nullable = false)
    private BigDecimal price;

    /* 声明房屋图片 */
    @Column(name = "picture", columnDefinition = "varchar(255) default '' comment '房屋图片'", nullable = true)
    private String picture;

    /* 声明房屋面积 */
    @Column(name = "area", columnDefinition = "float(20) default 0.00 comment '房屋面积'", nullable = false)
    private Float area;

    /* 声明房屋卧室数量 */
    @Column(name = "beds", columnDefinition = "int(12) default 0 comment '卧室数量'", nullable = false)
    private Integer beds;

    /* 圣经房屋卫生室数量 */
    @Column(name = "baths", columnDefinition = "int(12) default 0 comment '卫生间数量'", nullable = false)
    private Integer baths;

    /* 声明房屋评级 */
    @Column(name = "rating", columnDefinition = "double default 0 comment '房屋评分'", nullable = false)
    private Double rating;

    /* 声明房屋描述 */
    @Column(name = "remarks", columnDefinition = "varchar(512) default '' comment '房屋描述'", nullable = false)
    private String remarks;

    /* 声明房屋属性 */
    @Column(name = "properties", columnDefinition = "varchar(512) default '' comment '房产属性'", nullable = false)
    private String properties;

    /* 声明房屋户型图 */
    @Column(name = "floor_plan", columnDefinition = "varchar(255) default '' comment '房屋户型图'", nullable = true)
    private String floorPlan;

    /* 声明房屋标签 */
    @Column(name = "tags", columnDefinition = "varchar(512) default '' comment '房屋标签'", nullable = false)
    private String tags;

    /* 声明房屋城市名称 */
    @Column(name = "city_id", columnDefinition = "bigint(20) default 0 comment '城市名称'", nullable = false)
    private Long cityId;

    /* 声明房屋小区名称 */
    @Column(name = "community_id", columnDefinition = "bigint(20) default 0 comment '小区名称'", nullable = false)
    private Long communityId;

    /* 声明房屋地址 */
    @Column(name = "address", columnDefinition = "varchar(255) default '' comment '房屋地址'", nullable = false)
    private String address;

    /* 声明房屋状态 1:上架 2:下架 */
    @Column(name = "state", columnDefinition = "tinyint(1) default 0 comment '房屋状态 1:上架 2:下架'",nullable = false)
    private Short state;

    /* 声明房屋创建时间 */
    @Column(name = "create_time", columnDefinition = "datetime comment '创建时间'", nullable = false)
    private Date createTime;

    /* 声明房屋更新时间 */
    @Column(name = "update_time", columnDefinition = "datetime comment '更新时间'", nullable = false)
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
