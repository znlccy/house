package com.znlccy.house.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-11:09
 * @Version: v1.0.0
 * @Comment: 用户实体类
 */

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    /* 声明用户主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid", columnDefinition = "bigint(20) comment '用户主键'")
    private Long uid;

    /* 声明用户姓名 */
    @Column(name = "name", columnDefinition = "varchar(40) default '' comment '用户姓名'", nullable = false)
    private String name;

    /* 声明用户手机 */
    @Column(name = "phone", columnDefinition = "varchar(32) default '' comment '用户手机'",nullable = false, unique = true)
    private String phone;

    /* 声明用户电子邮件 */
    @Column(name = "email", columnDefinition = "varchar(90) default '' comment '用户电子邮件'", unique = true, nullable = false)
    private String email;

    /* 声明用户自我介绍 */
    @Column(name = "about_me", columnDefinition = "varchar(255) default '' comment '用户自我介绍'", nullable = false)
    private String aboutMe;

    /* 声明用户密码 */
    @Column(name = "password", columnDefinition = "varchar(64) default '' comment '用户密码'", nullable = false)
    private String password;

    /* 声明用户头像 */
    @Column(name = "avatar", columnDefinition = "varchar(255) default '' comment '用户头像'", nullable = false)
    private String avatar;

    /* 声明用户类型 1:普通用户 2:房屋经纪人 */
    @Column(name = "type", columnDefinition = "tinyint(1) default 0 comment '用户类型 1:普通用户 2:房屋经纪人'", nullable = false)
    private Short type;

    /* 声明用户是否启用 1:启用 2:不启用 */
    @Column(name = "enable", columnDefinition = "tinyint(1) default 0 comment '用户是否启用 1:启用 2:不启用'", nullable = false)
    private Short enable;

    /* 声明用户所属经济机构 */
    private Long agencyId;

    /* 声明用户创建时间 */
    private Date createTime;

    /* 声明用户更新时间 */
    private Date updateTime;

    /* 实现获取用户主键 */
    public Long getUid() {
        return uid;
    }

    /* 实现设置用户主键 */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /* 实现获取用户姓名 */
    public String getName() {
        return name;
    }

    /* 实现设置用户姓名 */
    public void setName(String name) {
        this.name = name;
    }

    /* 实现获取用户手机 */
    public String getPhone() {
        return phone;
    }

    /* 实现设置用户手机 */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /* 实现获取用户电子邮件 */
    public String getEmail() {
        return email;
    }

    /* 实现设置用户电子邮件 */
    public void setEmail(String email) {
        this.email = email;
    }

    /* 实现获取用户自我介绍 */
    public String getAboutMe() {
        return aboutMe;
    }

    /* 实现设置用户自我介绍 */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /* 实现获取用户密码 */
    public String getPassword() {
        return password;
    }

    /* 实现设置用户密码 */
    public void setPassword(String password) {
        this.password = password;
    }

    /* 实现用户头像 */
    public String getAvatar() {
        return avatar;
    }

    /* 实现设置用户头像 */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /* 实现获取用户类型 */
    public Short getType() {
        return type;
    }

    /* 实现设置用户类型 */
    public void setType(Short type) {
        this.type = type;
    }

    /* 实现获取用户是否启用 */
    public Short getEnable() {
        return enable;
    }

    /* 实现设置用户是否启用 */
    public void setEnable(Short enable) {
        this.enable = enable;
    }

    /* 实现获取所属经纪机构 */
    public Long getAgencyId() {
        return agencyId;
    }

    /* 实现设置所属经纪机构 */
    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    /* 实现获取用户创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* 实现设置用户创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* 实现获取用户更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /* 实现设置用户更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
