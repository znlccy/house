package com.znlccy.house.common.model;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-13:49
 * @Version: v1.0.0
 * @Comment: 管理员实体类
 */

@Entity
@Table(name = "tb_admin")
public class Admin implements Serializable {

    /* 声明管理员主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aid", columnDefinition = "bigint(20) comment '管理员主键'")
    private Long aid;

    /* 声明管理员姓名 */
    @Column(name = "username", columnDefinition = "varchar(40) default '' comment '管理员姓名'",nullable = false)
    private String username;

    /* 声明管理员真实姓名 */
    @Column(name = "name", columnDefinition = "varchar(60) default '' comment '管理员真实姓名'", nullable = false)
    private String name;

    /* 声明管理员密码 */
    @Column(name = "password", columnDefinition = "varchar(64) default '' comment '管理员密码'", nullable = false)
    private String password;

    /* 声明管理员手机号码 */
    @Column(name = "mobile", columnDefinition = "varchar(16) default '' comment '管理员手机号码'", nullable = false, unique = true)
    private String mobile;

    /* 声明管理员电子邮件 */
    @Column(name = "email", columnDefinition = "varchar(255) default '' comment '管理员电子邮件'", nullable = false, unique = true)
    private String email;

    /* 声明管理员登陆时间 */
    @Column(name = "login_time", columnDefinition = "datetime comment '管理员登陆时间'", nullable = false)
    private Date loginTime;

    /* 声明管理员注册时间 */
    @Column(name = "register_time", columnDefinition = "datetime comment '管理员注册时间'", nullable = false)
    private Date registerTime;

    /* 声明管理员更新时间 */
    @Column(name = "update_time", columnDefinition = "datetime comment '管理员更新时间'", nullable = false)
    private Date updateTime;

    /* 声明管理员登陆IP */
    @Column(name = "login_ip", columnDefinition = "varchar(180) default '' comment '管理员登陆IP'", nullable = false)
    private String loginIp;

    /* 实现获取管理员主键 */
    public Long getAid() {
        return aid;
    }

    /* 实现设置管理员主键 */
    public void setAid(Long aid) {
        this.aid = aid;
    }

    /* 实现获取管理员姓名 */
    public String getUsername() {
        return username;
    }

    /* 实现设置管理员姓名 */
    public void setUsername(String username) {
        this.username = username;
    }

    /* 实现获取管理员真实姓名 */
    public String getName() {
        return name;
    }

    /* 实现设置管理员真实姓名 */
    public void setName(String name) {
        this.name = name;
    }

    /* 实现获取管理员密码 */
    public String getPassword() {
        return password;
    }

    /* 实现设置管理员密码 */
    public void setPassword(String password) {
        this.password = password;
    }

    /* 实现获取管理员手机号码 */
    public String getMobile() {
        return mobile;
    }

    /* 实现设置管理员手机号 */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /* 实现获取管理员电子邮件 */
    public String getEmail() {
        return email;
    }

    /* 实现设置管理员电子邮件 */
    public void setEmail(String email) {
        this.email = email;
    }

    /* 实现获取管理员登陆时间 */
    public Date getLoginTime() {
        return loginTime;
    }

    /* 实现设置管理员登陆时间 */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /* 实现获取管理员注册时间 */
    public Date getRegisterTime() {
        return registerTime;
    }

    /* 实现设置管理员注册时间 */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /* 实现获取管理员更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /* 实现设置管理员更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /* 实现获取管理员登陆IP */
    public String getLoginIp() {
        return loginIp;
    }

    /* 实现设置管理员登陆IP */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}
