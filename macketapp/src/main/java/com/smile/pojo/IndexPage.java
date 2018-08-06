package com.smile.pojo;

import java.util.List;

/**
 * Created by H1N1 on 2018/6/1.
 */
public class IndexPage {

    private List<IndexPageDatabase> headImgs;//首页图片轮播
    private List<Commodity> hotSaleImgs;//超值热卖
    private List<Commodity> newGoodsImags;//新品专区
    private List<Commodity> recommendGoodsImags;//为您推荐

    public List<IndexPageDatabase> getHeadImgs() {
        return headImgs;
    }

    public void setHeadImgs(List<IndexPageDatabase> headImgs) {
        this.headImgs = headImgs;
    }

    public List<Commodity> getHotSaleImgs() {
        return hotSaleImgs;
    }

    public void setHotSaleImgs(List<Commodity> hotSaleImgs) {
        this.hotSaleImgs = hotSaleImgs;
    }

    public List<Commodity> getNewGoodsImags() {
        return newGoodsImags;
    }

    public void setNewGoodsImags(List<Commodity> newGoodsImags) {
        this.newGoodsImags = newGoodsImags;
    }

    public List<Commodity> getRecommendGoodsImags() {
        return recommendGoodsImags;
    }

    public void setRecommendGoodsImags(List<Commodity> recommendGoodsImags) {
        this.recommendGoodsImags = recommendGoodsImags;
    }
}
