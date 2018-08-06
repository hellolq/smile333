package com.smile.pojo;

import java.math.BigDecimal;

public class ShopOrderGoodsDO {
    private Integer id;

    private Integer supplierid;

    private Integer orderid;

    private String orderno;

    private Integer goodsid;

    private String goodsname;

    private Integer goodsnum;

    private String goodsshortinfo;

    private Integer goodscategoryid;

    private String goodscategorytitle;

    private BigDecimal goodsweight;

    private String goodscoverimgid;

    private String goodsrollimages;

    private BigDecimal goodssalesprice;

    private BigDecimal goodscostprice;

    private Byte goodsisnorm;

    private Integer goodsnormid;

    private String goodsnorms;

    private Byte isonsale;

    private Byte isenabled;

    private Byte isdeleted;

    private Integer createtime;

    private Integer updatetime;

    private Integer publicnumber;

    private Integer maxuseintegral;

    private BigDecimal salespricetwo;

    private String goodsdescribe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getGoodsshortinfo() {
        return goodsshortinfo;
    }

    public void setGoodsshortinfo(String goodsshortinfo) {
        this.goodsshortinfo = goodsshortinfo == null ? null : goodsshortinfo.trim();
    }

    public Integer getGoodscategoryid() {
        return goodscategoryid;
    }

    public void setGoodscategoryid(Integer goodscategoryid) {
        this.goodscategoryid = goodscategoryid;
    }

    public String getGoodscategorytitle() {
        return goodscategorytitle;
    }

    public void setGoodscategorytitle(String goodscategorytitle) {
        this.goodscategorytitle = goodscategorytitle == null ? null : goodscategorytitle.trim();
    }

    public BigDecimal getGoodsweight() {
        return goodsweight;
    }

    public void setGoodsweight(BigDecimal goodsweight) {
        this.goodsweight = goodsweight;
    }

    public String getGoodscoverimgid() {
        return goodscoverimgid;
    }

    public void setGoodscoverimgid(String goodscoverimgid) {
        this.goodscoverimgid = goodscoverimgid == null ? null : goodscoverimgid.trim();
    }

    public String getGoodsrollimages() {
        return goodsrollimages;
    }

    public void setGoodsrollimages(String goodsrollimages) {
        this.goodsrollimages = goodsrollimages == null ? null : goodsrollimages.trim();
    }

    public BigDecimal getGoodssalesprice() {
        return goodssalesprice;
    }

    public void setGoodssalesprice(BigDecimal goodssalesprice) {
        this.goodssalesprice = goodssalesprice;
    }

    public BigDecimal getGoodscostprice() {
        return goodscostprice;
    }

    public void setGoodscostprice(BigDecimal goodscostprice) {
        this.goodscostprice = goodscostprice;
    }

    public Byte getGoodsisnorm() {
        return goodsisnorm;
    }

    public void setGoodsisnorm(Byte goodsisnorm) {
        this.goodsisnorm = goodsisnorm;
    }

    public Integer getGoodsnormid() {
        return goodsnormid;
    }

    public void setGoodsnormid(Integer goodsnormid) {
        this.goodsnormid = goodsnormid;
    }

    public String getGoodsnorms() {
        return goodsnorms;
    }

    public void setGoodsnorms(String goodsnorms) {
        this.goodsnorms = goodsnorms == null ? null : goodsnorms.trim();
    }

    public Byte getIsonsale() {
        return isonsale;
    }

    public void setIsonsale(Byte isonsale) {
        this.isonsale = isonsale;
    }

    public Byte getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Byte isenabled) {
        this.isenabled = isenabled;
    }

    public Byte getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getPublicnumber() {
        return publicnumber;
    }

    public void setPublicnumber(Integer publicnumber) {
        this.publicnumber = publicnumber;
    }

    public Integer getMaxuseintegral() {
        return maxuseintegral;
    }

    public void setMaxuseintegral(Integer maxuseintegral) {
        this.maxuseintegral = maxuseintegral;
    }

    public BigDecimal getSalespricetwo() {
        return salespricetwo;
    }

    public void setSalespricetwo(BigDecimal salespricetwo) {
        this.salespricetwo = salespricetwo;
    }

    public String getGoodsdescribe() {
        return goodsdescribe;
    }

    public void setGoodsdescribe(String goodsdescribe) {
        this.goodsdescribe = goodsdescribe == null ? null : goodsdescribe.trim();
    }
}