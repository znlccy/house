package com.znlccy.house.common.model;

import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-11:22
 * @Version: v1.0.0
 * @Comment: 经纪机构实体类
 */

public class Agency implements Serializable {

    /* 声明经纪机构主键 */
    private Long aid;

    /* 声明经纪机构名称 */
    private String name;

    /* 声明经纪机构地址 */
    private String address;

    /* 声明经纪机构手机 */
    private String phone;

    /* 声明经纪机构电子邮件 */
    private String email;

    /* 声明经纪机构描述 */
    private String aboutUs;

    /* 声明经纪机构电话 */
    private String mobile;

    /* 声明经纪机构网址 */
    private String website;

    /* 实现获取经纪机构主键 */
    public Long getAid() {
        return aid;
    }

    /* 实现设置经纪机构主键 */
    public void setAid(Long aid) {
        this.aid = aid;
    }

    /* 实现获取经纪机构名称 */
    public String getName() {
        return name;
    }

    /* 实现设置经纪机构名称 */
    public void setName(String name) {
        this.name = name;
    }

    /* 实现获取经纪机构地址 */
    public String getAddress() {
        return address;
    }

    /* 实现设置经纪机构地址 */
    public void setAddress(String address) {
        this.address = address;
    }

    /* 实现获取经纪机构手机 */
    public String getPhone() {
        return phone;
    }

    /* 实现设置经纪机构手机 */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /* 实现获取经纪机构电子邮件 */
    public String getEmail() {
        return email;
    }

    /* 实现设置经纪机构电子邮件 */
    public void setEmail(String email) {
        this.email = email;
    }

    /* 实现获取经纪机构描述 */
    public String getAboutUs() {
        return aboutUs;
    }

    /* 实现设置经纪机构描述 */
    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    /* 实现获取经纪机构电话 */
    public String getMobile() {
        return mobile;
    }

    /* 实现设置经纪机构电话 */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /* 实现获取经纪机构网址 */
    public String getWebsite() {
        return website;
    }

    /* 实现设置经纪机构网址 */
    public void setWebsite(String website) {
        this.website = website;
    }
}
