package com.smile.pojo;

import com.smile.mapper.AcceptGoodsAddressDatabaseMapper;

import java.util.List;

/**
 * Created by H1N1 on 2018/6/13.
 */
public class SumbitPage {


    private double sumXsje;//总价格
    private double postage;//邮费
    List<CommodityDatabase> commodityDatabase;//商品
    AcceptGoodsAddressDatabase address;//默认收货地址

    public double getSumXsje() {
        return sumXsje;
    }

    public void setSumXsje(double sumXsje) {
        this.sumXsje = sumXsje;
    }

    public double getPostage() {
        return postage;
    }

    public void setPostage(double postage) {
        this.postage = postage;
    }

    public List<CommodityDatabase> getCommodityDatabase() {
        return commodityDatabase;
    }

    public void setCommodityDatabase(List<CommodityDatabase> commodityDatabase) {
        this.commodityDatabase = commodityDatabase;
    }

    public AcceptGoodsAddressDatabase getAddress() {
        return address;
    }

    public void setAddress(AcceptGoodsAddressDatabase address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SumbitPage{" +
                "sumXsje=" + sumXsje +
                ", postage=" + postage +
                ", commodityDatabase=" + commodityDatabase +
                ", address=" + address +
                '}';
    }
}
