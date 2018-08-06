package com.smile.pojo;

/**
 * Created by H1N1 on 2018/7/17.
 */
public class ShopOrderGoods {

    private int id;//
    private int supplierId;//供应商ID
    private int orderId;//订单ID
    private String orderNo;//订单号
    private int goodsId;//商品ID
    private String goodsName;//商品名称
    private int goodsNum;//商品数量
    private String goodsShortInfo;//商品简介
    private int goodsCategoryId;//商品类别ID
    private String goodsCategoryTitle;//
    private double goodsWeight;//商品重量
    private String goodsCoverImgId;//
    private String goodsRollImages;
    private double goodsSalesPrice;//商品单价
    private double goodsCostPrice;//商品成本价
    private String  goodsDescribe;//商品描述
    private String goodsIsNorm;//上否为规格商品
    private int goodsNormId;//商品规格ID
    private String goodsNorms;//商品规格名称
    private String onSale;//是否优惠出售
    private String publicNumber;//公益产品批号
    private double maxUseIntegral;//允许最大使用积分
    private double salesPriceTwo;//需要使用多少现金

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

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsShortInfo() {
        return goodsShortInfo;
    }

    public void setGoodsShortInfo(String goodsShortInfo) {
        this.goodsShortInfo = goodsShortInfo;
    }

    public int getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(int goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public String getGoodsCategoryTitle() {
        return goodsCategoryTitle;
    }

    public void setGoodsCategoryTitle(String goodsCategoryTitle) {
        this.goodsCategoryTitle = goodsCategoryTitle;
    }

    public double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getGoodsCoverImgId() {
        return goodsCoverImgId;
    }

    public void setGoodsCoverImgId(String goodsCoverImgId) {
        this.goodsCoverImgId = goodsCoverImgId;
    }

    public String getGoodsRollImages() {
        return goodsRollImages;
    }

    public void setGoodsRollImages(String goodsRollImages) {
        this.goodsRollImages = goodsRollImages;
    }

    public double getGoodsSalesPrice() {
        return goodsSalesPrice;
    }

    public void setGoodsSalesPrice(double goodsSalesPrice) {
        this.goodsSalesPrice = goodsSalesPrice;
    }

    public double getGoodsCostPrice() {
        return goodsCostPrice;
    }

    public void setGoodsCostPrice(double goodsCostPrice) {
        this.goodsCostPrice = goodsCostPrice;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    public String getGoodsIsNorm() {
        return goodsIsNorm;
    }

    public void setGoodsIsNorm(String goodsIsNorm) {
        this.goodsIsNorm = goodsIsNorm;
    }

    public int getGoodsNormId() {
        return goodsNormId;
    }

    public void setGoodsNormId(int goodsNormId) {
        this.goodsNormId = goodsNormId;
    }

    public String getGoodsNorms() {
        return goodsNorms;
    }

    public void setGoodsNorms(String goodsNorms) {
        this.goodsNorms = goodsNorms;
    }

    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }

    public String getPublicNumber() {
        return publicNumber;
    }

    public void setPublicNumber(String publicNumber) {
        this.publicNumber = publicNumber;
    }

    public double getMaxUseIntegral() {
        return maxUseIntegral;
    }

    public void setMaxUseIntegral(double maxUseIntegral) {
        this.maxUseIntegral = maxUseIntegral;
    }

    public double getSalesPriceTwo() {
        return salesPriceTwo;
    }

    public void setSalesPriceTwo(double salesPriceTwo) {
        this.salesPriceTwo = salesPriceTwo;
    }
}
