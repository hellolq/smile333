package com.smile.pojo;

/**
 * Created by H1N1 on 2018/7/12.
 */
public class GoodsCartDTO {
    private int id;
    private int goodsid;
    private int number;
    private String name;
    private String coverImgId;
    private Double salesprice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverImgId() {
        return coverImgId;
    }

    public void setCoverImgId(String coverImgId) {
        this.coverImgId = coverImgId;
    }

    public Double getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(Double salesprice) {
        this.salesprice = salesprice;
    }
}
