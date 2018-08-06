package com.smile.pojo;

import java.math.BigDecimal;

public class ShopGoodsDO {
    private Integer id;

    private Integer collating;

    private Integer supplierid;

    private String name;

    private String shortinfo;

    private Integer categoryid;

    private Integer marketnumber;

    private BigDecimal weight;

    private String coverimgid;

    private String rollimages;

    private BigDecimal marketprice;

    private BigDecimal salesprice;

    private BigDecimal costprice;

    private BigDecimal pv;

    private Integer inventory;

    private Integer warninginventory;

    private Byte isnorm;

    private Byte isputaway;

    private Byte isonsale;

    private Byte isspecialgoods;

    private Byte ishot;

    private Byte isnew;

    private String unitstitle;

    private Byte isenabled;

    private Byte isdeleted;

    private Long createtime;

    private Long updatetime;

    private String goodscode;

    private String auditreason;

    private Integer expresstemplateid;

    private BigDecimal userpercent;

    private BigDecimal fatherpercent;

    private Byte ispublicgoods;

    private BigDecimal publicpercent;

    private Byte isexchangegoods;

    private String homepurchaserestrictions;

    private Long timing;

    private Long timeframe;

    private Integer publicnumber;

    private Integer publicinventory;

    private Integer cutdowntime;

    private BigDecimal lowprice;

    private BigDecimal highprice;

    private Byte isbargaingoods;

    private BigDecimal cheap;

    private Integer maxuseintegral;

    private Byte isluckgoods;

    private Integer fullnum;

    private Integer reducenum;

    private BigDecimal salespricetwo;

    private String describe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollating() {
        return collating;
    }

    public void setCollating(Integer collating) {
        this.collating = collating;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShortinfo() {
        return shortinfo;
    }

    public void setShortinfo(String shortinfo) {
        this.shortinfo = shortinfo == null ? null : shortinfo.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getMarketnumber() {
        return marketnumber;
    }

    public void setMarketnumber(Integer marketnumber) {
        this.marketnumber = marketnumber;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getCoverimgid() {
        return coverimgid;
    }

    public void setCoverimgid(String coverimgid) {
        this.coverimgid = coverimgid == null ? null : coverimgid.trim();
    }

    public String getRollimages() {
        return rollimages;
    }

    public void setRollimages(String rollimages) {
        this.rollimages = rollimages == null ? null : rollimages.trim();
    }

    public BigDecimal getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    public BigDecimal getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(BigDecimal salesprice) {
        this.salesprice = salesprice;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getPv() {
        return pv;
    }

    public void setPv(BigDecimal pv) {
        this.pv = pv;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getWarninginventory() {
        return warninginventory;
    }

    public void setWarninginventory(Integer warninginventory) {
        this.warninginventory = warninginventory;
    }

    public Byte getIsnorm() {
        return isnorm;
    }

    public void setIsnorm(Byte isnorm) {
        this.isnorm = isnorm;
    }

    public Byte getIsputaway() {
        return isputaway;
    }

    public void setIsputaway(Byte isputaway) {
        this.isputaway = isputaway;
    }

    public Byte getIsonsale() {
        return isonsale;
    }

    public void setIsonsale(Byte isonsale) {
        this.isonsale = isonsale;
    }

    public Byte getIsspecialgoods() {
        return isspecialgoods;
    }

    public void setIsspecialgoods(Byte isspecialgoods) {
        this.isspecialgoods = isspecialgoods;
    }

    public Byte getIshot() {
        return ishot;
    }

    public void setIshot(Byte ishot) {
        this.ishot = ishot;
    }

    public Byte getIsnew() {
        return isnew;
    }

    public void setIsnew(Byte isnew) {
        this.isnew = isnew;
    }

    public String getUnitstitle() {
        return unitstitle;
    }

    public void setUnitstitle(String unitstitle) {
        this.unitstitle = unitstitle == null ? null : unitstitle.trim();
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

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode == null ? null : goodscode.trim();
    }

    public String getAuditreason() {
        return auditreason;
    }

    public void setAuditreason(String auditreason) {
        this.auditreason = auditreason == null ? null : auditreason.trim();
    }

    public Integer getExpresstemplateid() {
        return expresstemplateid;
    }

    public void setExpresstemplateid(Integer expresstemplateid) {
        this.expresstemplateid = expresstemplateid;
    }

    public BigDecimal getUserpercent() {
        return userpercent;
    }

    public void setUserpercent(BigDecimal userpercent) {
        this.userpercent = userpercent;
    }

    public BigDecimal getFatherpercent() {
        return fatherpercent;
    }

    public void setFatherpercent(BigDecimal fatherpercent) {
        this.fatherpercent = fatherpercent;
    }

    public Byte getIspublicgoods() {
        return ispublicgoods;
    }

    public void setIspublicgoods(Byte ispublicgoods) {
        this.ispublicgoods = ispublicgoods;
    }

    public BigDecimal getPublicpercent() {
        return publicpercent;
    }

    public void setPublicpercent(BigDecimal publicpercent) {
        this.publicpercent = publicpercent;
    }

    public Byte getIsexchangegoods() {
        return isexchangegoods;
    }

    public void setIsexchangegoods(Byte isexchangegoods) {
        this.isexchangegoods = isexchangegoods;
    }

    public String getHomepurchaserestrictions() {
        return homepurchaserestrictions;
    }

    public void setHomepurchaserestrictions(String homepurchaserestrictions) {
        this.homepurchaserestrictions = homepurchaserestrictions == null ? null : homepurchaserestrictions.trim();
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

    public Integer getPublicnumber() {
        return publicnumber;
    }

    public void setPublicnumber(Integer publicnumber) {
        this.publicnumber = publicnumber;
    }

    public Integer getPublicinventory() {
        return publicinventory;
    }

    public void setPublicinventory(Integer publicinventory) {
        this.publicinventory = publicinventory;
    }

    public Integer getCutdowntime() {
        return cutdowntime;
    }

    public void setCutdowntime(Integer cutdowntime) {
        this.cutdowntime = cutdowntime;
    }

    public BigDecimal getLowprice() {
        return lowprice;
    }

    public void setLowprice(BigDecimal lowprice) {
        this.lowprice = lowprice;
    }

    public BigDecimal getHighprice() {
        return highprice;
    }

    public void setHighprice(BigDecimal highprice) {
        this.highprice = highprice;
    }

    public Byte getIsbargaingoods() {
        return isbargaingoods;
    }

    public void setIsbargaingoods(Byte isbargaingoods) {
        this.isbargaingoods = isbargaingoods;
    }

    public BigDecimal getCheap() {
        return cheap;
    }

    public void setCheap(BigDecimal cheap) {
        this.cheap = cheap;
    }

    public Integer getMaxuseintegral() {
        return maxuseintegral;
    }

    public void setMaxuseintegral(Integer maxuseintegral) {
        this.maxuseintegral = maxuseintegral;
    }

    public Byte getIsluckgoods() {
        return isluckgoods;
    }

    public void setIsluckgoods(Byte isluckgoods) {
        this.isluckgoods = isluckgoods;
    }

    public Integer getFullnum() {
        return fullnum;
    }

    public void setFullnum(Integer fullnum) {
        this.fullnum = fullnum;
    }

    public Integer getReducenum() {
        return reducenum;
    }

    public void setReducenum(Integer reducenum) {
        this.reducenum = reducenum;
    }

    public BigDecimal getSalespricetwo() {
        return salespricetwo;
    }

    public void setSalespricetwo(BigDecimal salespricetwo) {
        this.salespricetwo = salespricetwo;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}