package com.smile.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopGoodsDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopGoodsDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCollatingIsNull() {
            addCriterion("Collating is null");
            return (Criteria) this;
        }

        public Criteria andCollatingIsNotNull() {
            addCriterion("Collating is not null");
            return (Criteria) this;
        }

        public Criteria andCollatingEqualTo(Integer value) {
            addCriterion("Collating =", value, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingNotEqualTo(Integer value) {
            addCriterion("Collating <>", value, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingGreaterThan(Integer value) {
            addCriterion("Collating >", value, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("Collating >=", value, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingLessThan(Integer value) {
            addCriterion("Collating <", value, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingLessThanOrEqualTo(Integer value) {
            addCriterion("Collating <=", value, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingIn(List<Integer> values) {
            addCriterion("Collating in", values, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingNotIn(List<Integer> values) {
            addCriterion("Collating not in", values, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingBetween(Integer value1, Integer value2) {
            addCriterion("Collating between", value1, value2, "collating");
            return (Criteria) this;
        }

        public Criteria andCollatingNotBetween(Integer value1, Integer value2) {
            addCriterion("Collating not between", value1, value2, "collating");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierId is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierId is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("SupplierId =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("SupplierId <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("SupplierId >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierId >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("SupplierId <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierId <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("SupplierId in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("SupplierId not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("SupplierId between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierId not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andShortinfoIsNull() {
            addCriterion("ShortInfo is null");
            return (Criteria) this;
        }

        public Criteria andShortinfoIsNotNull() {
            addCriterion("ShortInfo is not null");
            return (Criteria) this;
        }

        public Criteria andShortinfoEqualTo(String value) {
            addCriterion("ShortInfo =", value, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoNotEqualTo(String value) {
            addCriterion("ShortInfo <>", value, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoGreaterThan(String value) {
            addCriterion("ShortInfo >", value, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ShortInfo >=", value, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoLessThan(String value) {
            addCriterion("ShortInfo <", value, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoLessThanOrEqualTo(String value) {
            addCriterion("ShortInfo <=", value, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoLike(String value) {
            addCriterion("ShortInfo like", value, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoNotLike(String value) {
            addCriterion("ShortInfo not like", value, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoIn(List<String> values) {
            addCriterion("ShortInfo in", values, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoNotIn(List<String> values) {
            addCriterion("ShortInfo not in", values, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoBetween(String value1, String value2) {
            addCriterion("ShortInfo between", value1, value2, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andShortinfoNotBetween(String value1, String value2) {
            addCriterion("ShortInfo not between", value1, value2, "shortinfo");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("CategoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("CategoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("CategoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CategoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("CategoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("CategoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("CategoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("CategoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andMarketnumberIsNull() {
            addCriterion("MarketNumber is null");
            return (Criteria) this;
        }

        public Criteria andMarketnumberIsNotNull() {
            addCriterion("MarketNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMarketnumberEqualTo(Integer value) {
            addCriterion("MarketNumber =", value, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberNotEqualTo(Integer value) {
            addCriterion("MarketNumber <>", value, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberGreaterThan(Integer value) {
            addCriterion("MarketNumber >", value, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("MarketNumber >=", value, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberLessThan(Integer value) {
            addCriterion("MarketNumber <", value, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberLessThanOrEqualTo(Integer value) {
            addCriterion("MarketNumber <=", value, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberIn(List<Integer> values) {
            addCriterion("MarketNumber in", values, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberNotIn(List<Integer> values) {
            addCriterion("MarketNumber not in", values, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberBetween(Integer value1, Integer value2) {
            addCriterion("MarketNumber between", value1, value2, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andMarketnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("MarketNumber not between", value1, value2, "marketnumber");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andCoverimgidIsNull() {
            addCriterion("CoverImgId is null");
            return (Criteria) this;
        }

        public Criteria andCoverimgidIsNotNull() {
            addCriterion("CoverImgId is not null");
            return (Criteria) this;
        }

        public Criteria andCoverimgidEqualTo(String value) {
            addCriterion("CoverImgId =", value, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidNotEqualTo(String value) {
            addCriterion("CoverImgId <>", value, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidGreaterThan(String value) {
            addCriterion("CoverImgId >", value, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidGreaterThanOrEqualTo(String value) {
            addCriterion("CoverImgId >=", value, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidLessThan(String value) {
            addCriterion("CoverImgId <", value, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidLessThanOrEqualTo(String value) {
            addCriterion("CoverImgId <=", value, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidLike(String value) {
            addCriterion("CoverImgId like", value, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidNotLike(String value) {
            addCriterion("CoverImgId not like", value, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidIn(List<String> values) {
            addCriterion("CoverImgId in", values, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidNotIn(List<String> values) {
            addCriterion("CoverImgId not in", values, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidBetween(String value1, String value2) {
            addCriterion("CoverImgId between", value1, value2, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andCoverimgidNotBetween(String value1, String value2) {
            addCriterion("CoverImgId not between", value1, value2, "coverimgid");
            return (Criteria) this;
        }

        public Criteria andRollimagesIsNull() {
            addCriterion("RollImages is null");
            return (Criteria) this;
        }

        public Criteria andRollimagesIsNotNull() {
            addCriterion("RollImages is not null");
            return (Criteria) this;
        }

        public Criteria andRollimagesEqualTo(String value) {
            addCriterion("RollImages =", value, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesNotEqualTo(String value) {
            addCriterion("RollImages <>", value, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesGreaterThan(String value) {
            addCriterion("RollImages >", value, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesGreaterThanOrEqualTo(String value) {
            addCriterion("RollImages >=", value, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesLessThan(String value) {
            addCriterion("RollImages <", value, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesLessThanOrEqualTo(String value) {
            addCriterion("RollImages <=", value, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesLike(String value) {
            addCriterion("RollImages like", value, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesNotLike(String value) {
            addCriterion("RollImages not like", value, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesIn(List<String> values) {
            addCriterion("RollImages in", values, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesNotIn(List<String> values) {
            addCriterion("RollImages not in", values, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesBetween(String value1, String value2) {
            addCriterion("RollImages between", value1, value2, "rollimages");
            return (Criteria) this;
        }

        public Criteria andRollimagesNotBetween(String value1, String value2) {
            addCriterion("RollImages not between", value1, value2, "rollimages");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("MarketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("MarketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(BigDecimal value) {
            addCriterion("MarketPrice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(BigDecimal value) {
            addCriterion("MarketPrice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(BigDecimal value) {
            addCriterion("MarketPrice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MarketPrice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(BigDecimal value) {
            addCriterion("MarketPrice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MarketPrice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<BigDecimal> values) {
            addCriterion("MarketPrice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<BigDecimal> values) {
            addCriterion("MarketPrice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MarketPrice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MarketPrice not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNull() {
            addCriterion("SalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNotNull() {
            addCriterion("SalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceEqualTo(BigDecimal value) {
            addCriterion("SalesPrice =", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <>", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThan(BigDecimal value) {
            addCriterion("SalesPrice >", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice >=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThan(BigDecimal value) {
            addCriterion("SalesPrice <", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIn(List<BigDecimal> values) {
            addCriterion("SalesPrice in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice not in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice not between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNull() {
            addCriterion("CostPrice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("CostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(BigDecimal value) {
            addCriterion("CostPrice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("CostPrice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(BigDecimal value) {
            addCriterion("CostPrice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CostPrice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(BigDecimal value) {
            addCriterion("CostPrice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CostPrice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<BigDecimal> values) {
            addCriterion("CostPrice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("CostPrice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostPrice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostPrice not between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("PV is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("PV is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(BigDecimal value) {
            addCriterion("PV =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(BigDecimal value) {
            addCriterion("PV <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(BigDecimal value) {
            addCriterion("PV >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PV >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(BigDecimal value) {
            addCriterion("PV <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PV <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<BigDecimal> values) {
            addCriterion("PV in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<BigDecimal> values) {
            addCriterion("PV not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PV between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PV not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("Inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("Inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("Inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("Inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("Inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("Inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("Inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("Inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("Inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("Inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("Inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryIsNull() {
            addCriterion("WarningInventory is null");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryIsNotNull() {
            addCriterion("WarningInventory is not null");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryEqualTo(Integer value) {
            addCriterion("WarningInventory =", value, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryNotEqualTo(Integer value) {
            addCriterion("WarningInventory <>", value, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryGreaterThan(Integer value) {
            addCriterion("WarningInventory >", value, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("WarningInventory >=", value, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryLessThan(Integer value) {
            addCriterion("WarningInventory <", value, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryLessThanOrEqualTo(Integer value) {
            addCriterion("WarningInventory <=", value, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryIn(List<Integer> values) {
            addCriterion("WarningInventory in", values, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryNotIn(List<Integer> values) {
            addCriterion("WarningInventory not in", values, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryBetween(Integer value1, Integer value2) {
            addCriterion("WarningInventory between", value1, value2, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andWarninginventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("WarningInventory not between", value1, value2, "warninginventory");
            return (Criteria) this;
        }

        public Criteria andIsnormIsNull() {
            addCriterion("IsNorm is null");
            return (Criteria) this;
        }

        public Criteria andIsnormIsNotNull() {
            addCriterion("IsNorm is not null");
            return (Criteria) this;
        }

        public Criteria andIsnormEqualTo(Byte value) {
            addCriterion("IsNorm =", value, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormNotEqualTo(Byte value) {
            addCriterion("IsNorm <>", value, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormGreaterThan(Byte value) {
            addCriterion("IsNorm >", value, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsNorm >=", value, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormLessThan(Byte value) {
            addCriterion("IsNorm <", value, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormLessThanOrEqualTo(Byte value) {
            addCriterion("IsNorm <=", value, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormIn(List<Byte> values) {
            addCriterion("IsNorm in", values, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormNotIn(List<Byte> values) {
            addCriterion("IsNorm not in", values, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormBetween(Byte value1, Byte value2) {
            addCriterion("IsNorm between", value1, value2, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsnormNotBetween(Byte value1, Byte value2) {
            addCriterion("IsNorm not between", value1, value2, "isnorm");
            return (Criteria) this;
        }

        public Criteria andIsputawayIsNull() {
            addCriterion("IsPutaway is null");
            return (Criteria) this;
        }

        public Criteria andIsputawayIsNotNull() {
            addCriterion("IsPutaway is not null");
            return (Criteria) this;
        }

        public Criteria andIsputawayEqualTo(Byte value) {
            addCriterion("IsPutaway =", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotEqualTo(Byte value) {
            addCriterion("IsPutaway <>", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayGreaterThan(Byte value) {
            addCriterion("IsPutaway >", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsPutaway >=", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayLessThan(Byte value) {
            addCriterion("IsPutaway <", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayLessThanOrEqualTo(Byte value) {
            addCriterion("IsPutaway <=", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayIn(List<Byte> values) {
            addCriterion("IsPutaway in", values, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotIn(List<Byte> values) {
            addCriterion("IsPutaway not in", values, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayBetween(Byte value1, Byte value2) {
            addCriterion("IsPutaway between", value1, value2, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotBetween(Byte value1, Byte value2) {
            addCriterion("IsPutaway not between", value1, value2, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsonsaleIsNull() {
            addCriterion("IsOnSale is null");
            return (Criteria) this;
        }

        public Criteria andIsonsaleIsNotNull() {
            addCriterion("IsOnSale is not null");
            return (Criteria) this;
        }

        public Criteria andIsonsaleEqualTo(Byte value) {
            addCriterion("IsOnSale =", value, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleNotEqualTo(Byte value) {
            addCriterion("IsOnSale <>", value, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleGreaterThan(Byte value) {
            addCriterion("IsOnSale >", value, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsOnSale >=", value, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleLessThan(Byte value) {
            addCriterion("IsOnSale <", value, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleLessThanOrEqualTo(Byte value) {
            addCriterion("IsOnSale <=", value, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleIn(List<Byte> values) {
            addCriterion("IsOnSale in", values, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleNotIn(List<Byte> values) {
            addCriterion("IsOnSale not in", values, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleBetween(Byte value1, Byte value2) {
            addCriterion("IsOnSale between", value1, value2, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsonsaleNotBetween(Byte value1, Byte value2) {
            addCriterion("IsOnSale not between", value1, value2, "isonsale");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsIsNull() {
            addCriterion("IsSpecialGoods is null");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsIsNotNull() {
            addCriterion("IsSpecialGoods is not null");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsEqualTo(Byte value) {
            addCriterion("IsSpecialGoods =", value, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsNotEqualTo(Byte value) {
            addCriterion("IsSpecialGoods <>", value, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsGreaterThan(Byte value) {
            addCriterion("IsSpecialGoods >", value, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsSpecialGoods >=", value, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsLessThan(Byte value) {
            addCriterion("IsSpecialGoods <", value, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsLessThanOrEqualTo(Byte value) {
            addCriterion("IsSpecialGoods <=", value, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsIn(List<Byte> values) {
            addCriterion("IsSpecialGoods in", values, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsNotIn(List<Byte> values) {
            addCriterion("IsSpecialGoods not in", values, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsBetween(Byte value1, Byte value2) {
            addCriterion("IsSpecialGoods between", value1, value2, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIsspecialgoodsNotBetween(Byte value1, Byte value2) {
            addCriterion("IsSpecialGoods not between", value1, value2, "isspecialgoods");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("IsHot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("IsHot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(Byte value) {
            addCriterion("IsHot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(Byte value) {
            addCriterion("IsHot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(Byte value) {
            addCriterion("IsHot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsHot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(Byte value) {
            addCriterion("IsHot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(Byte value) {
            addCriterion("IsHot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<Byte> values) {
            addCriterion("IsHot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<Byte> values) {
            addCriterion("IsHot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(Byte value1, Byte value2) {
            addCriterion("IsHot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(Byte value1, Byte value2) {
            addCriterion("IsHot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNull() {
            addCriterion("IsNew is null");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNotNull() {
            addCriterion("IsNew is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewEqualTo(Byte value) {
            addCriterion("IsNew =", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotEqualTo(Byte value) {
            addCriterion("IsNew <>", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThan(Byte value) {
            addCriterion("IsNew >", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsNew >=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThan(Byte value) {
            addCriterion("IsNew <", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThanOrEqualTo(Byte value) {
            addCriterion("IsNew <=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewIn(List<Byte> values) {
            addCriterion("IsNew in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotIn(List<Byte> values) {
            addCriterion("IsNew not in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewBetween(Byte value1, Byte value2) {
            addCriterion("IsNew between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotBetween(Byte value1, Byte value2) {
            addCriterion("IsNew not between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andUnitstitleIsNull() {
            addCriterion("UnitsTitle is null");
            return (Criteria) this;
        }

        public Criteria andUnitstitleIsNotNull() {
            addCriterion("UnitsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andUnitstitleEqualTo(String value) {
            addCriterion("UnitsTitle =", value, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleNotEqualTo(String value) {
            addCriterion("UnitsTitle <>", value, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleGreaterThan(String value) {
            addCriterion("UnitsTitle >", value, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleGreaterThanOrEqualTo(String value) {
            addCriterion("UnitsTitle >=", value, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleLessThan(String value) {
            addCriterion("UnitsTitle <", value, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleLessThanOrEqualTo(String value) {
            addCriterion("UnitsTitle <=", value, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleLike(String value) {
            addCriterion("UnitsTitle like", value, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleNotLike(String value) {
            addCriterion("UnitsTitle not like", value, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleIn(List<String> values) {
            addCriterion("UnitsTitle in", values, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleNotIn(List<String> values) {
            addCriterion("UnitsTitle not in", values, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleBetween(String value1, String value2) {
            addCriterion("UnitsTitle between", value1, value2, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andUnitstitleNotBetween(String value1, String value2) {
            addCriterion("UnitsTitle not between", value1, value2, "unitstitle");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNull() {
            addCriterion("IsEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("IsEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(Byte value) {
            addCriterion("IsEnabled =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Byte value) {
            addCriterion("IsEnabled <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Byte value) {
            addCriterion("IsEnabled >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsEnabled >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Byte value) {
            addCriterion("IsEnabled <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Byte value) {
            addCriterion("IsEnabled <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Byte> values) {
            addCriterion("IsEnabled in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Byte> values) {
            addCriterion("IsEnabled not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Byte value1, Byte value2) {
            addCriterion("IsEnabled between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Byte value1, Byte value2) {
            addCriterion("IsEnabled not between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("IsDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("IsDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Byte value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Byte value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Byte value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Byte value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Byte value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Byte> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Byte> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Byte value1, Byte value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Long value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Long value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Long value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Long value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Long> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Long> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Long value1, Long value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Long value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Long value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Long value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Long value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Long value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Long> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Long> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Long value1, Long value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Long value1, Long value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andGoodscodeIsNull() {
            addCriterion("GoodsCode is null");
            return (Criteria) this;
        }

        public Criteria andGoodscodeIsNotNull() {
            addCriterion("GoodsCode is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscodeEqualTo(String value) {
            addCriterion("GoodsCode =", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotEqualTo(String value) {
            addCriterion("GoodsCode <>", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeGreaterThan(String value) {
            addCriterion("GoodsCode >", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsCode >=", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLessThan(String value) {
            addCriterion("GoodsCode <", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLessThanOrEqualTo(String value) {
            addCriterion("GoodsCode <=", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLike(String value) {
            addCriterion("GoodsCode like", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotLike(String value) {
            addCriterion("GoodsCode not like", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeIn(List<String> values) {
            addCriterion("GoodsCode in", values, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotIn(List<String> values) {
            addCriterion("GoodsCode not in", values, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeBetween(String value1, String value2) {
            addCriterion("GoodsCode between", value1, value2, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotBetween(String value1, String value2) {
            addCriterion("GoodsCode not between", value1, value2, "goodscode");
            return (Criteria) this;
        }

        public Criteria andAuditreasonIsNull() {
            addCriterion("AuditReason is null");
            return (Criteria) this;
        }

        public Criteria andAuditreasonIsNotNull() {
            addCriterion("AuditReason is not null");
            return (Criteria) this;
        }

        public Criteria andAuditreasonEqualTo(String value) {
            addCriterion("AuditReason =", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonNotEqualTo(String value) {
            addCriterion("AuditReason <>", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonGreaterThan(String value) {
            addCriterion("AuditReason >", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonGreaterThanOrEqualTo(String value) {
            addCriterion("AuditReason >=", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonLessThan(String value) {
            addCriterion("AuditReason <", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonLessThanOrEqualTo(String value) {
            addCriterion("AuditReason <=", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonLike(String value) {
            addCriterion("AuditReason like", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonNotLike(String value) {
            addCriterion("AuditReason not like", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonIn(List<String> values) {
            addCriterion("AuditReason in", values, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonNotIn(List<String> values) {
            addCriterion("AuditReason not in", values, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonBetween(String value1, String value2) {
            addCriterion("AuditReason between", value1, value2, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonNotBetween(String value1, String value2) {
            addCriterion("AuditReason not between", value1, value2, "auditreason");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidIsNull() {
            addCriterion("ExpressTemplateId is null");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidIsNotNull() {
            addCriterion("ExpressTemplateId is not null");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidEqualTo(Integer value) {
            addCriterion("ExpressTemplateId =", value, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidNotEqualTo(Integer value) {
            addCriterion("ExpressTemplateId <>", value, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidGreaterThan(Integer value) {
            addCriterion("ExpressTemplateId >", value, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExpressTemplateId >=", value, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidLessThan(Integer value) {
            addCriterion("ExpressTemplateId <", value, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidLessThanOrEqualTo(Integer value) {
            addCriterion("ExpressTemplateId <=", value, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidIn(List<Integer> values) {
            addCriterion("ExpressTemplateId in", values, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidNotIn(List<Integer> values) {
            addCriterion("ExpressTemplateId not in", values, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidBetween(Integer value1, Integer value2) {
            addCriterion("ExpressTemplateId between", value1, value2, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andExpresstemplateidNotBetween(Integer value1, Integer value2) {
            addCriterion("ExpressTemplateId not between", value1, value2, "expresstemplateid");
            return (Criteria) this;
        }

        public Criteria andUserpercentIsNull() {
            addCriterion("UserPercent is null");
            return (Criteria) this;
        }

        public Criteria andUserpercentIsNotNull() {
            addCriterion("UserPercent is not null");
            return (Criteria) this;
        }

        public Criteria andUserpercentEqualTo(BigDecimal value) {
            addCriterion("UserPercent =", value, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentNotEqualTo(BigDecimal value) {
            addCriterion("UserPercent <>", value, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentGreaterThan(BigDecimal value) {
            addCriterion("UserPercent >", value, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UserPercent >=", value, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentLessThan(BigDecimal value) {
            addCriterion("UserPercent <", value, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UserPercent <=", value, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentIn(List<BigDecimal> values) {
            addCriterion("UserPercent in", values, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentNotIn(List<BigDecimal> values) {
            addCriterion("UserPercent not in", values, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UserPercent between", value1, value2, "userpercent");
            return (Criteria) this;
        }

        public Criteria andUserpercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UserPercent not between", value1, value2, "userpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentIsNull() {
            addCriterion("FatherPercent is null");
            return (Criteria) this;
        }

        public Criteria andFatherpercentIsNotNull() {
            addCriterion("FatherPercent is not null");
            return (Criteria) this;
        }

        public Criteria andFatherpercentEqualTo(BigDecimal value) {
            addCriterion("FatherPercent =", value, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentNotEqualTo(BigDecimal value) {
            addCriterion("FatherPercent <>", value, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentGreaterThan(BigDecimal value) {
            addCriterion("FatherPercent >", value, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FatherPercent >=", value, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentLessThan(BigDecimal value) {
            addCriterion("FatherPercent <", value, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FatherPercent <=", value, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentIn(List<BigDecimal> values) {
            addCriterion("FatherPercent in", values, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentNotIn(List<BigDecimal> values) {
            addCriterion("FatherPercent not in", values, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FatherPercent between", value1, value2, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andFatherpercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FatherPercent not between", value1, value2, "fatherpercent");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsIsNull() {
            addCriterion("IsPublicGoods is null");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsIsNotNull() {
            addCriterion("IsPublicGoods is not null");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsEqualTo(Byte value) {
            addCriterion("IsPublicGoods =", value, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsNotEqualTo(Byte value) {
            addCriterion("IsPublicGoods <>", value, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsGreaterThan(Byte value) {
            addCriterion("IsPublicGoods >", value, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsPublicGoods >=", value, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsLessThan(Byte value) {
            addCriterion("IsPublicGoods <", value, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsLessThanOrEqualTo(Byte value) {
            addCriterion("IsPublicGoods <=", value, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsIn(List<Byte> values) {
            addCriterion("IsPublicGoods in", values, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsNotIn(List<Byte> values) {
            addCriterion("IsPublicGoods not in", values, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsBetween(Byte value1, Byte value2) {
            addCriterion("IsPublicGoods between", value1, value2, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andIspublicgoodsNotBetween(Byte value1, Byte value2) {
            addCriterion("IsPublicGoods not between", value1, value2, "ispublicgoods");
            return (Criteria) this;
        }

        public Criteria andPublicpercentIsNull() {
            addCriterion("PublicPercent is null");
            return (Criteria) this;
        }

        public Criteria andPublicpercentIsNotNull() {
            addCriterion("PublicPercent is not null");
            return (Criteria) this;
        }

        public Criteria andPublicpercentEqualTo(BigDecimal value) {
            addCriterion("PublicPercent =", value, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentNotEqualTo(BigDecimal value) {
            addCriterion("PublicPercent <>", value, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentGreaterThan(BigDecimal value) {
            addCriterion("PublicPercent >", value, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PublicPercent >=", value, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentLessThan(BigDecimal value) {
            addCriterion("PublicPercent <", value, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PublicPercent <=", value, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentIn(List<BigDecimal> values) {
            addCriterion("PublicPercent in", values, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentNotIn(List<BigDecimal> values) {
            addCriterion("PublicPercent not in", values, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PublicPercent between", value1, value2, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andPublicpercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PublicPercent not between", value1, value2, "publicpercent");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsIsNull() {
            addCriterion("IsExchangeGoods is null");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsIsNotNull() {
            addCriterion("IsExchangeGoods is not null");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsEqualTo(Byte value) {
            addCriterion("IsExchangeGoods =", value, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsNotEqualTo(Byte value) {
            addCriterion("IsExchangeGoods <>", value, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsGreaterThan(Byte value) {
            addCriterion("IsExchangeGoods >", value, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsExchangeGoods >=", value, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsLessThan(Byte value) {
            addCriterion("IsExchangeGoods <", value, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsLessThanOrEqualTo(Byte value) {
            addCriterion("IsExchangeGoods <=", value, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsIn(List<Byte> values) {
            addCriterion("IsExchangeGoods in", values, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsNotIn(List<Byte> values) {
            addCriterion("IsExchangeGoods not in", values, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsBetween(Byte value1, Byte value2) {
            addCriterion("IsExchangeGoods between", value1, value2, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andIsexchangegoodsNotBetween(Byte value1, Byte value2) {
            addCriterion("IsExchangeGoods not between", value1, value2, "isexchangegoods");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsIsNull() {
            addCriterion("Homepurchaserestrictions is null");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsIsNotNull() {
            addCriterion("Homepurchaserestrictions is not null");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsEqualTo(String value) {
            addCriterion("Homepurchaserestrictions =", value, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsNotEqualTo(String value) {
            addCriterion("Homepurchaserestrictions <>", value, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsGreaterThan(String value) {
            addCriterion("Homepurchaserestrictions >", value, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsGreaterThanOrEqualTo(String value) {
            addCriterion("Homepurchaserestrictions >=", value, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsLessThan(String value) {
            addCriterion("Homepurchaserestrictions <", value, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsLessThanOrEqualTo(String value) {
            addCriterion("Homepurchaserestrictions <=", value, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsLike(String value) {
            addCriterion("Homepurchaserestrictions like", value, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsNotLike(String value) {
            addCriterion("Homepurchaserestrictions not like", value, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsIn(List<String> values) {
            addCriterion("Homepurchaserestrictions in", values, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsNotIn(List<String> values) {
            addCriterion("Homepurchaserestrictions not in", values, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsBetween(String value1, String value2) {
            addCriterion("Homepurchaserestrictions between", value1, value2, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andHomepurchaserestrictionsNotBetween(String value1, String value2) {
            addCriterion("Homepurchaserestrictions not between", value1, value2, "homepurchaserestrictions");
            return (Criteria) this;
        }

        public Criteria andTimingIsNull() {
            addCriterion("Timing is null");
            return (Criteria) this;
        }

        public Criteria andTimingIsNotNull() {
            addCriterion("Timing is not null");
            return (Criteria) this;
        }

        public Criteria andTimingEqualTo(Long value) {
            addCriterion("Timing =", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotEqualTo(Long value) {
            addCriterion("Timing <>", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingGreaterThan(Long value) {
            addCriterion("Timing >", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingGreaterThanOrEqualTo(Long value) {
            addCriterion("Timing >=", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLessThan(Long value) {
            addCriterion("Timing <", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLessThanOrEqualTo(Long value) {
            addCriterion("Timing <=", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingIn(List<Long> values) {
            addCriterion("Timing in", values, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotIn(List<Long> values) {
            addCriterion("Timing not in", values, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingBetween(Long value1, Long value2) {
            addCriterion("Timing between", value1, value2, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotBetween(Long value1, Long value2) {
            addCriterion("Timing not between", value1, value2, "timing");
            return (Criteria) this;
        }

        public Criteria andTimeframeIsNull() {
            addCriterion("Timeframe is null");
            return (Criteria) this;
        }

        public Criteria andTimeframeIsNotNull() {
            addCriterion("Timeframe is not null");
            return (Criteria) this;
        }

        public Criteria andTimeframeEqualTo(Long value) {
            addCriterion("Timeframe =", value, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeNotEqualTo(Long value) {
            addCriterion("Timeframe <>", value, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeGreaterThan(Long value) {
            addCriterion("Timeframe >", value, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeGreaterThanOrEqualTo(Long value) {
            addCriterion("Timeframe >=", value, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeLessThan(Long value) {
            addCriterion("Timeframe <", value, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeLessThanOrEqualTo(Long value) {
            addCriterion("Timeframe <=", value, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeIn(List<Long> values) {
            addCriterion("Timeframe in", values, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeNotIn(List<Long> values) {
            addCriterion("Timeframe not in", values, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeBetween(Long value1, Long value2) {
            addCriterion("Timeframe between", value1, value2, "timeframe");
            return (Criteria) this;
        }

        public Criteria andTimeframeNotBetween(Long value1, Long value2) {
            addCriterion("Timeframe not between", value1, value2, "timeframe");
            return (Criteria) this;
        }

        public Criteria andPublicnumberIsNull() {
            addCriterion("PublicNumber is null");
            return (Criteria) this;
        }

        public Criteria andPublicnumberIsNotNull() {
            addCriterion("PublicNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPublicnumberEqualTo(Integer value) {
            addCriterion("PublicNumber =", value, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberNotEqualTo(Integer value) {
            addCriterion("PublicNumber <>", value, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberGreaterThan(Integer value) {
            addCriterion("PublicNumber >", value, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("PublicNumber >=", value, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberLessThan(Integer value) {
            addCriterion("PublicNumber <", value, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberLessThanOrEqualTo(Integer value) {
            addCriterion("PublicNumber <=", value, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberIn(List<Integer> values) {
            addCriterion("PublicNumber in", values, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberNotIn(List<Integer> values) {
            addCriterion("PublicNumber not in", values, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberBetween(Integer value1, Integer value2) {
            addCriterion("PublicNumber between", value1, value2, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("PublicNumber not between", value1, value2, "publicnumber");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryIsNull() {
            addCriterion("PublicInventory is null");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryIsNotNull() {
            addCriterion("PublicInventory is not null");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryEqualTo(Integer value) {
            addCriterion("PublicInventory =", value, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryNotEqualTo(Integer value) {
            addCriterion("PublicInventory <>", value, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryGreaterThan(Integer value) {
            addCriterion("PublicInventory >", value, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("PublicInventory >=", value, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryLessThan(Integer value) {
            addCriterion("PublicInventory <", value, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryLessThanOrEqualTo(Integer value) {
            addCriterion("PublicInventory <=", value, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryIn(List<Integer> values) {
            addCriterion("PublicInventory in", values, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryNotIn(List<Integer> values) {
            addCriterion("PublicInventory not in", values, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryBetween(Integer value1, Integer value2) {
            addCriterion("PublicInventory between", value1, value2, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andPublicinventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("PublicInventory not between", value1, value2, "publicinventory");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeIsNull() {
            addCriterion("CutDownTime is null");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeIsNotNull() {
            addCriterion("CutDownTime is not null");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeEqualTo(Integer value) {
            addCriterion("CutDownTime =", value, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeNotEqualTo(Integer value) {
            addCriterion("CutDownTime <>", value, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeGreaterThan(Integer value) {
            addCriterion("CutDownTime >", value, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CutDownTime >=", value, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeLessThan(Integer value) {
            addCriterion("CutDownTime <", value, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeLessThanOrEqualTo(Integer value) {
            addCriterion("CutDownTime <=", value, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeIn(List<Integer> values) {
            addCriterion("CutDownTime in", values, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeNotIn(List<Integer> values) {
            addCriterion("CutDownTime not in", values, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeBetween(Integer value1, Integer value2) {
            addCriterion("CutDownTime between", value1, value2, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andCutdowntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("CutDownTime not between", value1, value2, "cutdowntime");
            return (Criteria) this;
        }

        public Criteria andLowpriceIsNull() {
            addCriterion("LowPrice is null");
            return (Criteria) this;
        }

        public Criteria andLowpriceIsNotNull() {
            addCriterion("LowPrice is not null");
            return (Criteria) this;
        }

        public Criteria andLowpriceEqualTo(BigDecimal value) {
            addCriterion("LowPrice =", value, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceNotEqualTo(BigDecimal value) {
            addCriterion("LowPrice <>", value, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceGreaterThan(BigDecimal value) {
            addCriterion("LowPrice >", value, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LowPrice >=", value, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceLessThan(BigDecimal value) {
            addCriterion("LowPrice <", value, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LowPrice <=", value, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceIn(List<BigDecimal> values) {
            addCriterion("LowPrice in", values, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceNotIn(List<BigDecimal> values) {
            addCriterion("LowPrice not in", values, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LowPrice between", value1, value2, "lowprice");
            return (Criteria) this;
        }

        public Criteria andLowpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LowPrice not between", value1, value2, "lowprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceIsNull() {
            addCriterion("HighPrice is null");
            return (Criteria) this;
        }

        public Criteria andHighpriceIsNotNull() {
            addCriterion("HighPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHighpriceEqualTo(BigDecimal value) {
            addCriterion("HighPrice =", value, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceNotEqualTo(BigDecimal value) {
            addCriterion("HighPrice <>", value, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceGreaterThan(BigDecimal value) {
            addCriterion("HighPrice >", value, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HighPrice >=", value, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceLessThan(BigDecimal value) {
            addCriterion("HighPrice <", value, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HighPrice <=", value, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceIn(List<BigDecimal> values) {
            addCriterion("HighPrice in", values, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceNotIn(List<BigDecimal> values) {
            addCriterion("HighPrice not in", values, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HighPrice between", value1, value2, "highprice");
            return (Criteria) this;
        }

        public Criteria andHighpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HighPrice not between", value1, value2, "highprice");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsIsNull() {
            addCriterion("IsBargainGoods is null");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsIsNotNull() {
            addCriterion("IsBargainGoods is not null");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsEqualTo(Byte value) {
            addCriterion("IsBargainGoods =", value, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsNotEqualTo(Byte value) {
            addCriterion("IsBargainGoods <>", value, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsGreaterThan(Byte value) {
            addCriterion("IsBargainGoods >", value, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsBargainGoods >=", value, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsLessThan(Byte value) {
            addCriterion("IsBargainGoods <", value, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsLessThanOrEqualTo(Byte value) {
            addCriterion("IsBargainGoods <=", value, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsIn(List<Byte> values) {
            addCriterion("IsBargainGoods in", values, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsNotIn(List<Byte> values) {
            addCriterion("IsBargainGoods not in", values, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsBetween(Byte value1, Byte value2) {
            addCriterion("IsBargainGoods between", value1, value2, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andIsbargaingoodsNotBetween(Byte value1, Byte value2) {
            addCriterion("IsBargainGoods not between", value1, value2, "isbargaingoods");
            return (Criteria) this;
        }

        public Criteria andCheapIsNull() {
            addCriterion("Cheap is null");
            return (Criteria) this;
        }

        public Criteria andCheapIsNotNull() {
            addCriterion("Cheap is not null");
            return (Criteria) this;
        }

        public Criteria andCheapEqualTo(BigDecimal value) {
            addCriterion("Cheap =", value, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapNotEqualTo(BigDecimal value) {
            addCriterion("Cheap <>", value, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapGreaterThan(BigDecimal value) {
            addCriterion("Cheap >", value, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Cheap >=", value, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapLessThan(BigDecimal value) {
            addCriterion("Cheap <", value, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Cheap <=", value, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapIn(List<BigDecimal> values) {
            addCriterion("Cheap in", values, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapNotIn(List<BigDecimal> values) {
            addCriterion("Cheap not in", values, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Cheap between", value1, value2, "cheap");
            return (Criteria) this;
        }

        public Criteria andCheapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Cheap not between", value1, value2, "cheap");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralIsNull() {
            addCriterion("MaxUseIntegral is null");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralIsNotNull() {
            addCriterion("MaxUseIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralEqualTo(Integer value) {
            addCriterion("MaxUseIntegral =", value, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralNotEqualTo(Integer value) {
            addCriterion("MaxUseIntegral <>", value, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralGreaterThan(Integer value) {
            addCriterion("MaxUseIntegral >", value, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxUseIntegral >=", value, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralLessThan(Integer value) {
            addCriterion("MaxUseIntegral <", value, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralLessThanOrEqualTo(Integer value) {
            addCriterion("MaxUseIntegral <=", value, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralIn(List<Integer> values) {
            addCriterion("MaxUseIntegral in", values, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralNotIn(List<Integer> values) {
            addCriterion("MaxUseIntegral not in", values, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralBetween(Integer value1, Integer value2) {
            addCriterion("MaxUseIntegral between", value1, value2, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andMaxuseintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxUseIntegral not between", value1, value2, "maxuseintegral");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsIsNull() {
            addCriterion("IsLuckGoods is null");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsIsNotNull() {
            addCriterion("IsLuckGoods is not null");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsEqualTo(Byte value) {
            addCriterion("IsLuckGoods =", value, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsNotEqualTo(Byte value) {
            addCriterion("IsLuckGoods <>", value, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsGreaterThan(Byte value) {
            addCriterion("IsLuckGoods >", value, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsLuckGoods >=", value, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsLessThan(Byte value) {
            addCriterion("IsLuckGoods <", value, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsLessThanOrEqualTo(Byte value) {
            addCriterion("IsLuckGoods <=", value, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsIn(List<Byte> values) {
            addCriterion("IsLuckGoods in", values, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsNotIn(List<Byte> values) {
            addCriterion("IsLuckGoods not in", values, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsBetween(Byte value1, Byte value2) {
            addCriterion("IsLuckGoods between", value1, value2, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andIsluckgoodsNotBetween(Byte value1, Byte value2) {
            addCriterion("IsLuckGoods not between", value1, value2, "isluckgoods");
            return (Criteria) this;
        }

        public Criteria andFullnumIsNull() {
            addCriterion("FullNum is null");
            return (Criteria) this;
        }

        public Criteria andFullnumIsNotNull() {
            addCriterion("FullNum is not null");
            return (Criteria) this;
        }

        public Criteria andFullnumEqualTo(Integer value) {
            addCriterion("FullNum =", value, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumNotEqualTo(Integer value) {
            addCriterion("FullNum <>", value, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumGreaterThan(Integer value) {
            addCriterion("FullNum >", value, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FullNum >=", value, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumLessThan(Integer value) {
            addCriterion("FullNum <", value, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumLessThanOrEqualTo(Integer value) {
            addCriterion("FullNum <=", value, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumIn(List<Integer> values) {
            addCriterion("FullNum in", values, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumNotIn(List<Integer> values) {
            addCriterion("FullNum not in", values, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumBetween(Integer value1, Integer value2) {
            addCriterion("FullNum between", value1, value2, "fullnum");
            return (Criteria) this;
        }

        public Criteria andFullnumNotBetween(Integer value1, Integer value2) {
            addCriterion("FullNum not between", value1, value2, "fullnum");
            return (Criteria) this;
        }

        public Criteria andReducenumIsNull() {
            addCriterion("ReduceNum is null");
            return (Criteria) this;
        }

        public Criteria andReducenumIsNotNull() {
            addCriterion("ReduceNum is not null");
            return (Criteria) this;
        }

        public Criteria andReducenumEqualTo(Integer value) {
            addCriterion("ReduceNum =", value, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumNotEqualTo(Integer value) {
            addCriterion("ReduceNum <>", value, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumGreaterThan(Integer value) {
            addCriterion("ReduceNum >", value, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReduceNum >=", value, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumLessThan(Integer value) {
            addCriterion("ReduceNum <", value, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumLessThanOrEqualTo(Integer value) {
            addCriterion("ReduceNum <=", value, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumIn(List<Integer> values) {
            addCriterion("ReduceNum in", values, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumNotIn(List<Integer> values) {
            addCriterion("ReduceNum not in", values, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumBetween(Integer value1, Integer value2) {
            addCriterion("ReduceNum between", value1, value2, "reducenum");
            return (Criteria) this;
        }

        public Criteria andReducenumNotBetween(Integer value1, Integer value2) {
            addCriterion("ReduceNum not between", value1, value2, "reducenum");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoIsNull() {
            addCriterion("SalesPriceTwo is null");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoIsNotNull() {
            addCriterion("SalesPriceTwo is not null");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoEqualTo(BigDecimal value) {
            addCriterion("SalesPriceTwo =", value, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoNotEqualTo(BigDecimal value) {
            addCriterion("SalesPriceTwo <>", value, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoGreaterThan(BigDecimal value) {
            addCriterion("SalesPriceTwo >", value, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPriceTwo >=", value, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoLessThan(BigDecimal value) {
            addCriterion("SalesPriceTwo <", value, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPriceTwo <=", value, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoIn(List<BigDecimal> values) {
            addCriterion("SalesPriceTwo in", values, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoNotIn(List<BigDecimal> values) {
            addCriterion("SalesPriceTwo not in", values, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPriceTwo between", value1, value2, "salespricetwo");
            return (Criteria) this;
        }

        public Criteria andSalespricetwoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPriceTwo not between", value1, value2, "salespricetwo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}