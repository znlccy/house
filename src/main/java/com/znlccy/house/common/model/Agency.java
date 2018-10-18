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

    /* 实现 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
