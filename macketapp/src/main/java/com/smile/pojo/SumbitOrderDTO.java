package com.smile.pojo;

/**
 * Created by H1N1 on 2018/7/14.
 */
public class SumbitOrderDTO {

    private int id;//商品ID
    private String imgUrl;//商品头像
    private String name;//商品名称
    private int number;//商品数量
    private double postage;//邮费
    private double price;//商品价格

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPostage() {
        return postage;
    }

    public void setPostage(double postage) {
        this.postage = postage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SumbitOrderDTO{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", postage=" + postage +
                ", price=" + price +
                '}';
    }
}
