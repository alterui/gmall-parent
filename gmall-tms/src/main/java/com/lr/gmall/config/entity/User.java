package com.lr.gmall.config.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author alterui
 * @since 2020-05-24 16:58:11
 */
public class User implements Serializable {
    private static final long serialVersionUID = 547359875100212931L;
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
    
    private String city;
    
    private Date createTime;


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

}