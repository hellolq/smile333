package com.smile.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by H1N1 on 2018/7/17.
 */
public class ShopOrders {
    private int id;
    private int userId;//用户ID
    private String toTalOrderNo;//总订单号
    private String orderNo;//子订单号
    private int orderState;//订单状态
    private int payType;//支付类型
    private int payState;//支付状态
    private int expressId;//用户选择快递ID
    private String expressName;//快递名称
    private int expressTemplateId;//快递模板ID
    private double goodsTotalCostPrice;//商品总成本
    private double goodsTotalPrice;//订单商品总金额
    private double goodsTotalPVPrice;//订单商品总PV
    private double expressPrice;//快递价格
    private double totalPrice;//订单总价（包括快递费等）
    private String remark;//商品标记
    private Date payTime;//支付时间
    private String outtranOrderNo;//第三方支付流水号
    private String leaveWord;//客户留言
    private String LeaveWordTwo;//商户留言
    private double balanceOne;//使用金碗豆
    private double balanceTwo;//使用银碗豆
    private double integral;//使用虚拟积分（只用于线上消费）
    private double weixinMoney;//使用微信支付
    private Date createTime;//创建时间
    private Date updateTime;//创建时间

    private String receiverName;//收货人名称
    private String receiverMobile;//收货人电话
    private String receiverTelPhone;//收货人电话
    private int receiverProvinceId;//省
    private int receiverCityId;//市
    private int receiverAreaId;//区
    private String receiverAddress;//收货地址
    private int sendExpressId;//发货ID
    private String sendExpressName;//发货快递名称
    private String sendExpressNo;//发货快递单号
    private Date newTime;//发货时间

    private int invoice; //是否需要开发票
    private String invoiceType;//发票类型
    private String invoiceTitle;//发票抬头
    private String h5PayOrderNo;//H5支付时的订单号
    private String wxOpenId;//微信用户OPENID

    private int bargainId;//砍价ID
    private double allowMaxUseIntegral;//订单允许最高使用多少金币/积分
    private double realUseIntegral;//用户真实用了多少金币/积分
    private double totalPriceTwo;//总订单使用多少现金(含运费)
    private double goodsTotalPriceTwo;//现金+金币支付时，总现金多少（仅商品部分）
    private int useIntegralPay;//是否使用金币/积分支付

    List<ShopOrderGoods> shopOrderGoods = new ArrayList<>();

    public int getPayState() {
        return payState;
    }

    public void setPayState(int payState) {
        this.payState = payState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getToTalOrderNo() {
        return toTalOrderNo;
    }

    public void setToTalOrderNo(String toTalOrderNo) {
        this.toTalOrderNo = toTalOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getExpressId() {
        return expressId;
    }

    public void setExpressId(int expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public int getExpressTemplateId() {
        return expressTemplateId;
    }

    public void setExpressTemplateId(int expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    public double getGoodsTotalCostPrice() {
        return goodsTotalCostPrice;
    }

    public void setGoodsTotalCostPrice(double goodsTotalCostPrice) {
        this.goodsTotalCostPrice = goodsTotalCostPrice;
    }

    public double getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(double goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public double getGoodsTotalPVPrice() {
        return goodsTotalPVPrice;
    }

    public void setGoodsTotalPVPrice(double goodsTotalPVPrice) {
        this.goodsTotalPVPrice = goodsTotalPVPrice;
    }

    public double getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(double expressPrice) {
        this.expressPrice = expressPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getOuttranOrderNo() {
        return outtranOrderNo;
    }

    public void setOuttranOrderNo(String outtranOrderNo) {
        this.outtranOrderNo = outtranOrderNo;
    }

    public String getLeaveWord() {
        return leaveWord;
    }

    public void setLeaveWord(String leaveWord) {
        this.leaveWord = leaveWord;
    }

    public String getLeaveWordTwo() {
        return LeaveWordTwo;
    }

    public void setLeaveWordTwo(String leaveWordTwo) {
        LeaveWordTwo = leaveWordTwo;
    }

    public double getBalanceOne() {
        return balanceOne;
    }

    public void setBalanceOne(double balanceOne) {
        this.balanceOne = balanceOne;
    }

    public double getBalanceTwo() {
        return balanceTwo;
    }

    public void setBalanceTwo(double balanceTwo) {
        this.balanceTwo = balanceTwo;
    }

    public double getIntegral() {
        return integral;
    }

    public void setIntegral(double integral) {
        this.integral = integral;
    }

    public double getWeixinMoney() {
        return weixinMoney;
    }

    public void setWeixinMoney(double weixinMoney) {
        this.weixinMoney = weixinMoney;
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

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverTelPhone() {
        return receiverTelPhone;
    }

    public void setReceiverTelPhone(String receiverTelPhone) {
        this.receiverTelPhone = receiverTelPhone;
    }

    public int getReceiverProvinceId() {
        return receiverProvinceId;
    }

    public void setReceiverProvinceId(int receiverProvinceId) {
        this.receiverProvinceId = receiverProvinceId;
    }

    public int getReceiverCityId() {
        return receiverCityId;
    }

    public void setReceiverCityId(int receiverCityId) {
        this.receiverCityId = receiverCityId;
    }

    public int getReceiverAreaId() {
        return receiverAreaId;
    }

    public void setReceiverAreaId(int receiverAreaId) {
        this.receiverAreaId = receiverAreaId;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public int getSendExpressId() {
        return sendExpressId;
    }

    public void setSendExpressId(int sendExpressId) {
        this.sendExpressId = sendExpressId;
    }

    public String getSendExpressName() {
        return sendExpressName;
    }

    public void setSendExpressName(String sendExpressName) {
        this.sendExpressName = sendExpressName;
    }

    public String getSendExpressNo() {
        return sendExpressNo;
    }

    public void setSendExpressNo(String sendExpressNo) {
        this.sendExpressNo = sendExpressNo;
    }

    public Date getNewTime() {
        return newTime;
    }

    public void setNewTime(Date newTime) {
        this.newTime = newTime;
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
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

    public String getH5PayOrderNo() {
        return h5PayOrderNo;
    }

    public void setH5PayOrderNo(String h5PayOrderNo) {
        this.h5PayOrderNo = h5PayOrderNo;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public int getBargainId() {
        return bargainId;
    }

    public void setBargainId(int bargainId) {
        this.bargainId = bargainId;
    }

    public double getAllowMaxUseIntegral() {
        return allowMaxUseIntegral;
    }

    public void setAllowMaxUseIntegral(double allowMaxUseIntegral) {
        this.allowMaxUseIntegral = allowMaxUseIntegral;
    }

    public double getRealUseIntegral() {
        return realUseIntegral;
    }

    public void setRealUseIntegral(double realUseIntegral) {
        this.realUseIntegral = realUseIntegral;
    }

    public double getTotalPriceTwo() {
        return totalPriceTwo;
    }

    public void setTotalPriceTwo(double totalPriceTwo) {
        this.totalPriceTwo = totalPriceTwo;
    }

    public double getGoodsTotalPriceTwo() {
        return goodsTotalPriceTwo;
    }

    public void setGoodsTotalPriceTwo(double goodsTotalPriceTwo) {
        this.goodsTotalPriceTwo = goodsTotalPriceTwo;
    }

    public int getUseIntegralPay() {
        return useIntegralPay;
    }

    public void setUseIntegralPay(int useIntegralPay) {
        this.useIntegralPay = useIntegralPay;
    }

    public List<ShopOrderGoods> getShopOrderGoods() {
        return shopOrderGoods;
    }

    public void setShopOrderGoods(List<ShopOrderGoods> shopOrderGoods) {
        this.shopOrderGoods = shopOrderGoods;
    }
}
