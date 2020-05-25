package com.lr.gmall.config.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(Order)实体类
 *
 * @author liurui
 * @since 2020-05-25 19:28:30
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 965768523022816649L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 订单编号
    */
    private Integer orderId;
    /**
    * 商品名称
    */
    private String productName;
    /**
    * 商品数量
    */
    private Integer productNumber;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
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