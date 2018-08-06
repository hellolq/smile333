package com.liqiaoyes.top.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H1N1 on 2018/7/31.
 */
public class GoodsDetailPageDTO {

    private  List<String> mainImgs = new ArrayList<>();
    private  List<String> detailImgs = new ArrayList<>();
    private ScGoods scGoods;

    public List<String> getMainImgs() {
        return mainImgs;
    }

    public void setMainImgs(List<String> mainImgs) {
        this.mainImgs = mainImgs;
    }

    public List<String> getDetailImgs() {
        return detailImgs;
    }

    public void setDetailImgs(List<String> detailImgs) {
        this.detailImgs = detailImgs;
    }

    public ScGoods getScGoods() {
        return scGoods;
    }

    public void setScGoods(ScGoods scGoods) {
        this.scGoods = scGoods;
    }
}
