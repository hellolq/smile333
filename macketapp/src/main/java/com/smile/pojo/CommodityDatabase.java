package com.smile.pojo;

import java.util.List;

/**
 * Created by H1N1 on 2018/6/11.
 */
public class CommodityDatabase {

    private String id;//商品id
    private String viewImg;//窗口图片
    private String headImgs;//详情页主图
    private String goodsName;//商品名称
    private Double price;//商品价格
    private Double discount;//商品折扣
    private Double marketPrice;//市场价
    private int goodsNum;//商品销量
    private int goodsStock;//商品库存
    private String goodsDetailHtml;//商品详情页

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

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

    public String getHeadImgs() {
        return headImgs;
    }

    public void setHeadImgs(String headImgs) {
        this.headImgs = headImgs;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    @Override
    public String toString() {
        return "CommodityDatabase{" +
                "id='" + id + '\'' +
                ", viewImg='" + viewImg + '\'' +
                ", headImgs='" + headImgs + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", goodsNum=" + goodsNum +
                ", goodsStock=" + goodsStock +
                ", goodsDetailHtml='" + goodsDetailHtml + '\'' +
                '}';
    }
}
