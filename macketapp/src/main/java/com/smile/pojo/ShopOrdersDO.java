package com.smile.pojo;

import java.math.BigDecimal;
import java.util.List;

public class ShopOrdersDO {
    private Integer id;

    private Integer supplierid;

    private Integer userid;

    private String totalorderno;

    private String orderno;

    private Integer orderstate;

    private Integer paytype;

    private Integer paystate;

    private Integer expressid;

    private String expressname;

    private Integer expresstemplateid;

    private BigDecimal goodstotalcostprice;

    private BigDecimal goodstotalprice;

    private BigDecimal goodstotalpvprice;

    private BigDecimal expressprice;

    private BigDecimal totalprice;

    private String remark;

    private Long paytime;

    private String outtranorderno;

    private String leaveword;

    private String leavewordtwo;

    private BigDecimal balanceone;

    private BigDecimal balancetwo;

    private BigDecimal integral;

    private BigDecimal weixinmoney;

    private Byte isenabled;

    private Byte isdeleted;

    private Long createtime;

    private Integer updatetime;

    private String receivername;

    private String receivermobile;

    private String receivertelphone;

    private Integer receiverprovinceid;

    private Integer receivercityid;

    private Integer receiverareaid;

    private String receiveraddress;

    private Integer sendexpressid;

    private String sendexpressname;

    private String sendexpressno;

    private Byte isinvoice;

    private String invoicetype;

    private String invoicetitle;

    private String h5payorderno;

    private String wxopenid;

    private Long newtime;

    private Integer bargainid;

    private Integer allowmaxuseintegral;

    private Integer realuseintegral;

    private BigDecimal totalpricetwo;

    private BigDecimal goodstotalpricetwo;

    private Byte isuseintegralpay;

    private List<ShopOrderGoodsDO> shopOrderGoodsDO;

    public List<ShopOrderGoodsDO> getShopOrderGoodsDO() {
        return shopOrderGoodsDO;
    }

    public void setShopOrderGoodsDO(List<ShopOrderGoodsDO> shopOrderGoodsDO) {
        this.shopOrderGoodsDO = shopOrderGoodsDO;
    }

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTotalorderno() {
        return totalorderno;
    }

    public void setTotalorderno(String totalorderno) {
        this.totalorderno = totalorderno == null ? null : totalorderno.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getPaystate() {
        return paystate;
    }

    public void setPaystate(Integer paystate) {
        this.paystate = paystate;
    }

    public Integer getExpressid() {
        return expressid;
    }

    public void setExpressid(Integer expressid) {
        this.expressid = expressid;
    }

    public String getExpressname() {
        return expressname;
    }

    public void setExpressname(String expressname) {
        this.expressname = expressname == null ? null : expressname.trim();
    }

    public Integer getExpresstemplateid() {
        return expresstemplateid;
    }

    public void setExpresstemplateid(Integer expresstemplateid) {
        this.expresstemplateid = expresstemplateid;
    }

    public BigDecimal getGoodstotalcostprice() {
        return goodstotalcostprice;
    }

    public void setGoodstotalcostprice(BigDecimal goodstotalcostprice) {
        this.goodstotalcostprice = goodstotalcostprice;
    }

    public BigDecimal getGoodstotalprice() {
        return goodstotalprice;
    }

    public void setGoodstotalprice(BigDecimal goodstotalprice) {
        this.goodstotalprice = goodstotalprice;
    }

    public BigDecimal getGoodstotalpvprice() {
        return goodstotalpvprice;
    }

    public void setGoodstotalpvprice(BigDecimal goodstotalpvprice) {
        this.goodstotalpvprice = goodstotalpvprice;
    }

    public BigDecimal getExpressprice() {
        return expressprice;
    }

    public void setExpressprice(BigDecimal expressprice) {
        this.expressprice = expressprice;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getPaytime() {
        return paytime;
    }

    public void setPaytime(Long paytime) {
        this.paytime = paytime;
    }

    public String getOuttranorderno() {
        return outtranorderno;
    }

    public void setOuttranorderno(String outtranorderno) {
        this.outtranorderno = outtranorderno == null ? null : outtranorderno.trim();
    }

    public String getLeaveword() {
        return leaveword;
    }

    public void setLeaveword(String leaveword) {
        this.leaveword = leaveword == null ? null : leaveword.trim();
    }

    public String getLeavewordtwo() {
        return leavewordtwo;
    }

    public void setLeavewordtwo(String leavewordtwo) {
        this.leavewordtwo = leavewordtwo == null ? null : leavewordtwo.trim();
    }

    public BigDecimal getBalanceone() {
        return balanceone;
    }

    public void setBalanceone(BigDecimal balanceone) {
        this.balanceone = balanceone;
    }

    public BigDecimal getBalancetwo() {
        return balancetwo;
    }

    public void setBalancetwo(BigDecimal balancetwo) {
        this.balancetwo = balancetwo;
    }

    public BigDecimal getIntegral() {
        return integral;
    }

    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    public BigDecimal getWeixinmoney() {
        return weixinmoney;
    }

    public void setWeixinmoney(BigDecimal weixinmoney) {
        this.weixinmoney = weixinmoney;
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

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername == null ? null : receivername.trim();
    }

    public String getReceivermobile() {
        return receivermobile;
    }

    public void setReceivermobile(String receivermobile) {
        this.receivermobile = receivermobile == null ? null : receivermobile.trim();
    }

    public String getReceivertelphone() {
        return receivertelphone;
    }

    public void setReceivertelphone(String receivertelphone) {
        this.receivertelphone = receivertelphone == null ? null : receivertelphone.trim();
    }

    public Integer getReceiverprovinceid() {
        return receiverprovinceid;
    }

    public void setReceiverprovinceid(Integer receiverprovinceid) {
        this.receiverprovinceid = receiverprovinceid;
    }

    public Integer getReceivercityid() {
        return receivercityid;
    }

    public void setReceivercityid(Integer receivercityid) {
        this.receivercityid = receivercityid;
    }

    public Integer getReceiverareaid() {
        return receiverareaid;
    }

    public void setReceiverareaid(Integer receiverareaid) {
        this.receiverareaid = receiverareaid;
    }

    public String getReceiveraddress() {
        return receiveraddress;
    }

    public void setReceiveraddress(String receiveraddress) {
        this.receiveraddress = receiveraddress == null ? null : receiveraddress.trim();
    }

    public Integer getSendexpressid() {
        return sendexpressid;
    }

    public void setSendexpressid(Integer sendexpressid) {
        this.sendexpressid = sendexpressid;
    }

    public String getSendexpressname() {
        return sendexpressname;
    }

    public void setSendexpressname(String sendexpressname) {
        this.sendexpressname = sendexpressname == null ? null : sendexpressname.trim();
    }

    public String getSendexpressno() {
        return sendexpressno;
    }

    public void setSendexpressno(String sendexpressno) {
        this.sendexpressno = sendexpressno == null ? null : sendexpressno.trim();
    }

    public Byte getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(Byte isinvoice) {
        this.isinvoice = isinvoice;
    }

    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype == null ? null : invoicetype.trim();
    }

    public String getInvoicetitle() {
        return invoicetitle;
    }

    public void setInvoicetitle(String invoicetitle) {
        this.invoicetitle = invoicetitle == null ? null : invoicetitle.trim();
    }

    public String getH5payorderno() {
        return h5payorderno;
    }

    public void setH5payorderno(String h5payorderno) {
        this.h5payorderno = h5payorderno == null ? null : h5payorderno.trim();
    }

    public String getWxopenid() {
        return wxopenid;
    }

    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid == null ? null : wxopenid.trim();
    }

    public Long getNewtime() {
        return newtime;
    }

    public void setNewtime(Long newtime) {
        this.newtime = newtime;
    }

    public Integer getBargainid() {
        return bargainid;
    }

    public void setBargainid(Integer bargainid) {
        this.bargainid = bargainid;
    }

    public Integer getAllowmaxuseintegral() {
        return allowmaxuseintegral;
    }

    public void setAllowmaxuseintegral(Integer allowmaxuseintegral) {
        this.allowmaxuseintegral = allowmaxuseintegral;
    }

    public Integer getRealuseintegral() {
        return realuseintegral;
    }

    public void setRealuseintegral(Integer realuseintegral) {
        this.realuseintegral = realuseintegral;
    }

    public BigDecimal getTotalpricetwo() {
        return totalpricetwo;
    }

    public void setTotalpricetwo(BigDecimal totalpricetwo) {
        this.totalpricetwo = totalpricetwo;
    }

    public BigDecimal getGoodstotalpricetwo() {
        return goodstotalpricetwo;
    }

    public void setGoodstotalpricetwo(BigDecimal goodstotalpricetwo) {
        this.goodstotalpricetwo = goodstotalpricetwo;
    }

    public Byte getIsuseintegralpay() {
        return isuseintegralpay;
    }

    public void setIsuseintegralpay(Byte isuseintegralpay) {
        this.isuseintegralpay = isuseintegralpay;
    }
}