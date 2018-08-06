package com.smile.pojo;

import java.util.List;

/**
 * Created by H1N1 on 2018/5/28.
 */
public class Commodity {

    private String id;//商品id
    private String viewImg;//窗口图片
    private List<String> headImgs;//详情页主图
    private String goodsName;//商品名称
    private String shortInfo;//商品简介
    private Double price;//商品价格
    private Double discount;//商品折扣
    private int goodsNum;//商品销量
    private int goodsStock;//商品库存
    private String goodsDetailHtml;//商品详情页 - 待删除
    private List<String> detailImg;//商品详情页图片
    private List<CommodityContent> commodityContents;//商品评论集
    private String marketPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getViewImg() {
        return viewImg;
    }

    public void setViewImg(String viewImg) {
        this.viewImg = viewImg;
    }

    public List<String> getHeadImgs() {
        return headImgs;
    }

    public void setHeadImgs(List<String> headImgs) {
        this.headImgs = headImgs;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public int getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(int goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getGoodsDetailHtml() {
        return goodsDetailHtml;
    }

    public void setGoodsDetailHtml(String goodsDetailHtml) {
        this.goodsDetailHtml = goodsDetailHtml;
    }

    public List<String> getDetailImg() {
        return detailImg;
    }

    public void setDetailImg(List<String> detailImg) {
        this.detailImg = detailImg;
    }

    public List<CommodityContent> getCommodityContents() {
        return commodityContents;
    }

    public void setCommodityContents(List<CommodityContent> commodityContents) {
        this.commodityContents = commodityContents;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id='" + id + '\'' +
                ", viewImg='" + viewImg + '\'' +
                ", headImgs=" + headImgs +
                ", goodsName='" + goodsName + '\'' +
                ", shortInfo='" + shortInfo + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", goodsNum=" + goodsNum +
                ", goodsStock=" + goodsStock +
                ", goodsDetailHtml='" + goodsDetailHtml + '\'' +
                ", detailImg=" + detailImg +
                ", commodityContents=" + commodityContents +
                ", marketPrice='" + marketPrice + '\'' +
                '}';
    }
}
