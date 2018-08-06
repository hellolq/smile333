package com.smile.pojo;

import java.util.Date;

/**
 * Created by H1N1 on 2018/7/18.
 *
 * 对应 shopGoods 表
 */
public class ShopGoods {
    private int id;//商品ID
    private int  supplierId;//供应商ID
    private String name;//商品名称
    private String shortInfo;//简介
    private int categoryId;//类别ID
    private int marketNumber;//销售数
    private double weight;//重量
    private String coverImgId;
    private String rollImages;
    private double marketPrice;
    private double salesPrice;
    private double costPrice;
    private double pv;
    private int inventory;//库存
    private int warningInventory;//预存报警
    private String describes;//描述
    private String norm;
    private String putaway;
    private String onSale;
    private String specialGoods;
    private String hot;
    private String news;//是否为本周新品
    private String unitsTitle;//商品单位
    private String goodsCode;//产品款号
    private String auditReason;//审核理由
    private int expressTemplateId;//快递模板ID
    private double userPercent;//用户返佣
    private double fatherPercent;//上级返佣比
    private String publicGoods;//是否为公益产品
    private double publicPercent;//公益基金比例
    private String exchangeGoods;//是否积分兑换产品 0，不是，1是
    private String homepurchaserestrictions;//限购数量
    private Long timing;//上架时间
    private Long timeframe;//定时下架时间
    private int publicNumber;//公益礼包产品批号
    private int publicInventory;//公益产品同一批次限购数量，默认0为不限购
    private Long cutDownTime;//新增砍价时间
    private double lowPrice;//新增砍价范围
    private double highPrice;//新增砍价范围
    private String bargainGoods;//是否砍价商品
    private double cheap;//底价
    private double maxUseIntegral;//最大使用积分
    private String luckGoods;//
    private int fullNum;
    private int reduceNum;
    private double salesPriceTwo;//现金+金币支付时，需使用现金多少


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getMarketNumber() {
        return marketNumber;
    }

    public void setMarketNumber(int marketNumber) {
        this.marketNumber = marketNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCoverImgId() {
        return coverImgId;
    }

    public void setCoverImgId(String coverImgId) {
        this.coverImgId = coverImgId;
    }

    public String getRollImages() {
        return rollImages;
    }

    public void setRollImages(String rollImages) {
        this.rollImages = rollImages;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getWarningInventory() {
        return warningInventory;
    }

    public void setWarningInventory(int warningInventory) {
        this.warningInventory = warningInventory;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getNorm() {
        return norm;
    }

    public void setNorm(String norm) {
        this.norm = norm;
    }

    public String getPutaway() {
        return putaway;
    }

    public void setPutaway(String putaway) {
        this.putaway = putaway;
    }

    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }

    public String getSpecialGoods() {
        return specialGoods;
    }

    public void setSpecialGoods(String specialGoods) {
        this.specialGoods = specialGoods;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getUnitsTitle() {
        return unitsTitle;
    }

    public void setUnitsTitle(String unitsTitle) {
        this.unitsTitle = unitsTitle;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getAuditReason() {
        return auditReason;
    }

    public void setAuditReason(String auditReason) {
        this.auditReason = auditReason;
    }

    public int getExpressTemplateId() {
        return expressTemplateId;
    }

    public void setExpressTemplateId(int expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    public double getUserPercent() {
        return userPercent;
    }

    public void setUserPercent(double userPercent) {
        this.userPercent = userPercent;
    }

    public double getFatherPercent() {
        return fatherPercent;
    }

    public void setFatherPercent(double fatherPercent) {
        this.fatherPercent = fatherPercent;
    }

    public String getPublicGoods() {
        return publicGoods;
    }

    public void setPublicGoods(String publicGoods) {
        this.publicGoods = publicGoods;
    }

    public double getPublicPercent() {
        return publicPercent;
    }

    public void setPublicPercent(double publicPercent) {
        this.publicPercent = publicPercent;
    }

    public String getExchangeGoods() {
        return exchangeGoods;
    }

    public void setExchangeGoods(String exchangeGoods) {
        this.exchangeGoods = exchangeGoods;
    }

    public String getHomepurchaserestrictions() {
        return homepurchaserestrictions;
    }

    public void setHomepurchaserestrictions(String homepurchaserestrictions) {
        this.homepurchaserestrictions = homepurchaserestrictions;
    }

    public Long getTiming() {
        return timing;
    }

    public void setTiming(Long timing) {
        this.timing = timing;
    }

    public Long getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(Long timeframe) {
        this.timeframe = timeframe;
    }

    public int getPublicNumber() {
        return publicNumber;
    }

    public void setPublicNumber(int publicNumber) {
        this.publicNumber = publicNumber;
    }

    public int getPublicInventory() {
        return publicInventory;
    }

    public void setPublicInventory(int publicInventory) {
        this.publicInventory = publicInventory;
    }

    public Long getCutDownTime() {
        return cutDownTime;
    }

    public void setCutDownTime(Long cutDownTime) {
        this.cutDownTime = cutDownTime;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(double highPrice) {
        this.highPrice = highPrice;
    }

    public String getBargainGoods() {
        return bargainGoods;
    }

    public void setBargainGoods(String bargainGoods) {
        this.bargainGoods = bargainGoods;
    }

    public double getCheap() {
        return cheap;
    }

    public void setCheap(double cheap) {
        this.cheap = cheap;
    }

    public double getMaxUseIntegral() {
        return maxUseIntegral;
    }

    public void setMaxUseIntegral(double maxUseIntegral) {
        this.maxUseIntegral = maxUseIntegral;
    }

    public String getLuckGoods() {
        return luckGoods;
    }

    public void setLuckGoods(String luckGoods) {
        this.luckGoods = luckGoods;
    }

    public int getFullNum() {
        return fullNum;
    }

    public void setFullNum(int fullNum) {
        this.fullNum = fullNum;
    }

    public int getReduceNum() {
        return reduceNum;
    }

    public void setReduceNum(int reduceNum) {
        this.reduceNum = reduceNum;
    }

    public double getSalesPriceTwo() {
        return salesPriceTwo;
    }

    public void setSalesPriceTwo(double salesPriceTwo) {
        this.salesPriceTwo = salesPriceTwo;
    }

    @Override
    public String toString() {
        return "ShopGoods{" +
                "id=" + id +
                ", supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", shortInfo='" + shortInfo + '\'' +
                ", categoryId=" + categoryId +
                ", marketNumber=" + marketNumber +
                ", weight=" + weight +
                ", coverImgId='" + coverImgId + '\'' +
                ", rollImages='" + rollImages + '\'' +
                ", marketPrice=" + marketPrice +
                ", salesPrice=" + salesPrice +
                ", costPrice=" + costPrice +
                ", pv=" + pv +
                ", inventory=" + inventory +
                ", warningInventory=" + warningInventory +
                ", describes='" + describes + '\'' +
                ", norm='" + norm + '\'' +
                ", putaway='" + putaway + '\'' +
                ", onSale='" + onSale + '\'' +
                ", specialGoods='" + specialGoods + '\'' +
                ", hot='" + hot + '\'' +
                ", news='" + news + '\'' +
                ", unitsTitle='" + unitsTitle + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", auditReason='" + auditReason + '\'' +
                ", expressTemplateId=" + expressTemplateId +
                ", userPercent=" + userPercent +
                ", fatherPercent=" + fatherPercent +
                ", publicGoods='" + publicGoods + '\'' +
                ", publicPercent=" + publicPercent +
                ", exchangeGoods='" + exchangeGoods + '\'' +
                ", homepurchaserestrictions='" + homepurchaserestrictions + '\'' +
                ", timing=" + timing +
                ", timeframe=" + timeframe +
                ", publicNumber=" + publicNumber +
                ", publicInventory=" + publicInventory +
                ", cutDownTime=" + cutDownTime +
                ", lowPrice=" + lowPrice +
                ", highPrice=" + highPrice +
                ", bargainGoods='" + bargainGoods + '\'' +
                ", cheap=" + cheap +
                ", maxUseIntegral=" + maxUseIntegral +
                ", luckGoods='" + luckGoods + '\'' +
                ", fullNum=" + fullNum +
                ", reduceNum=" + reduceNum +
                ", salesPriceTwo=" + salesPriceTwo +
                '}';
    }
}
