package com.smile.pojo;

import java.util.Date;

/**
 * Created by H1N1 on 2018/6/14.
 */
public class OrderDatabase {

    private int  id;// 自增ID 订单编号
    private int personId;//客户ID
    private int expressId;//快递模板ID
    private int acceptGoodsAddressId;//发货地址 ID
    private String payStatus;//支付状态
    private Date initTime;//下单时间
    private Date payTime;//支付时间
    private String payType;//支付方式
    private double receivable;//应收
    private double receipts;//实收


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getExpressId() {
        return expressId;
    }

    public void setExpressId(int expressId) {
        this.expressId = expressId;
    }

    public int getAcceptGoodsAddressId() {
        return acceptGoodsAddressId;
    }

    public void setAcceptGoodsAddressId(int acceptGoodsAddressId) {
        this.acceptGoodsAddressId = acceptGoodsAddressId;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public Date getInitTime() {
        return initTime;
    }

    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public double getReceivable() {
        return receivable;
    }

    public void setReceivable(double receivable) {
        this.receivable = receivable;
    }

    public double getReceipts() {
        return receipts;
    }

    public void setReceipts(double receipts) {
        this.receipts = receipts;
    }

    @Override
    public String toString() {
        return "OrderDatabase{" +
                "id=" + id +
                ", personId=" + personId +
                ", expressId=" + expressId +
                ", acceptGoodsAddressId=" + acceptGoodsAddressId +
                ", payStatus='" + payStatus + '\'' +
                ", initTime=" + initTime +
                ", payTime=" + payTime +
                ", payType='" + payType + '\'' +
                ", receivable=" + receivable +
                ", receipts=" + receipts +
                '}';
    }
}
