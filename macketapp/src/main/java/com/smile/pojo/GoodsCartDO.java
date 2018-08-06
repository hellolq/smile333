package com.smile.pojo;

import java.util.Date;

/**
 * Created by H1N1 on 2018/7/14.
 */
public class GoodsCartDO {

    private int id;//购物车ID
    private int supplierId;//供应商ID
    private int goodsId;//商品ID
    private int  number;//商品数量
    private int  normsId;//规格商品ID
    private int userId;//客户ID
    private int normsInfo;//规格说明（如：尺码：S，颜色：红色）
    private int enabled;//IsEnabled
    private int deleted;//IsDeleted
    private Date createTime;//创建时间
    private Date updateTime;//最后更新时间
    private double weight;//重量
    private int expressTemplateId;//快递模板ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNormsId() {
        return normsId;
    }

    public void setNormsId(int normsId) {
        this.normsId = normsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getNormsInfo() {
        return normsInfo;
    }

    public void setNormsInfo(int normsInfo) {
        this.normsInfo = normsInfo;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getExpressTemplateId() {
        return expressTemplateId;
    }

    public void setExpressTemplateId(int expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    @Override
    public String toString() {
        return "GoodsCartDO{" +
                "id=" + id +
                ", supplierId=" + supplierId +
                ", goodsId=" + goodsId +
                ", number=" + number +
                ", normsId=" + normsId +
                ", userId=" + userId +
                ", normsInfo=" + normsInfo +
                ", enabled=" + enabled +
                ", deleted=" + deleted +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", weight=" + weight +
                ", expressTemplateId=" + expressTemplateId +
                '}';
    }

}
