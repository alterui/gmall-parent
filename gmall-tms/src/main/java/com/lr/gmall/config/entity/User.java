package com.lr.gmall.config.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author liurui
 * @since 2020-05-25 17:34:17
 */
public class User implements Serializable {
    private static final long serialVersionUID = -69716228083479962L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 姓名
    */
    private String userName;
    /**
    * 年龄
    */
    private Integer userAge;
    /**
    * 城市名称
    */
    private String city;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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