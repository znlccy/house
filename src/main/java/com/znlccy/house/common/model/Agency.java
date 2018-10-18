package com.znlccy.house.common.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-11:22
 * @Version: v1.0.0
 * @Comment: 经纪机构实体类
 */

@Entity
@Table(name = "tb_agency")
public class Agency implements Serializable {

    /* 声明经纪机构主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aid", columnDefinition = "bigint(20) comment '机构主键'")
    private Long aid;

    /* 声明经纪机构名称 */
    @Column(name = "name", columnDefinition = "varchar(40) default '' comment '机构名称'", nullable = false)
    private String name;

    /* 声明经纪机构地址 */
    @Column(name = "address", columnDefinition = "varchar(255) default '' comment '机构地址'", nullable = false)
    private String address;

    /* 声明经纪机构电话 */
    @Column(name = "phone", columnDefinition = "varchar(32) default '' comment '机构电话'", nullable = false, unique = true)
    private String phone;

    /* 声明经纪机构电子邮件 */
    @Column(name = "email", columnDefinition = "varchar(90) default '' comment '机构电子邮件'", nullable = false, unique = true)
    private String email;

    /* 声明经纪机构描述 */
    @Column(name = "about_us", columnDefinition = "varchar(255) default '' comment '关于我们'", nullable = true)
    private String aboutUs;

    /* 声明经纪机构手机 */
    @Column(name = "mobile", columnDefinition = "varchar(32) default '' comment '机构手机'", nullable = false, unique = true)
    private String mobile;

    /* 声明经纪机构网址 */
    @Column(name = "website", columnDefinition = "varchar(255) default '' comment '机构网址'", nullable = true)
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
