package com.smile.pojo;

/**
 * Created by H1N1 on 2018/7/16.
 */
public class SubOrderDTO {

    private int goodsId;//商品ID
    private int goodsNum;//商品数目
    private int goodsNormId;//商品规格
    private int cartIds;//购物车ID
    private int paymentId;//
    private int transportRulesId;
    private int receiverId;//收货地址id
    private String invoiceType;//发票类型
    private String invoiceTitle;//发票抬头
    private String leaveWord;//用户留言

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public int getGoodsNormId() {
        return goodsNormId;
    }

    public void setGoodsNormId(int goodsNormId) {
        this.goodsNormId = goodsNormId;
    }

    public int getCartIds() {
        return cartIds;
    }

    public void setCartIds(int cartIds) {
        this.cartIds = cartIds;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getTransportRulesId() {
        return transportRulesId;
    }

    public void setTransportRulesId(int transportRulesId) {
        this.transportRulesId = transportRulesId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getLeaveWord() {
        return leaveWord;
    }

    public void setLeaveWord(String leaveWord) {
        this.leaveWord = leaveWord;
    }
}
