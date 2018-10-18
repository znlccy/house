package com.znlccy.house.common.model;

import java.io.Serializable;
import java.util.Date;

public class HouseMessage implements Serializable {

    private Long hmid;

    private String message;

    private Long agentId;

    private Long houseId;

    private String username;

    private Date createTime;

    private Date updateTime;

    public Long getHmid() {
        return hmid;
    }

    public void setHmid(Long hmid) {
        this.hmid = hmid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
