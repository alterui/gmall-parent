package com.lr.gmall.config.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author alterui
 * @since 2020-05-24 16:58:11
 */
@Data
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
    
    private Timestamp createTime;



}