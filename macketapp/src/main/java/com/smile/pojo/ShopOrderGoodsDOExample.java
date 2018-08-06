package com.smile.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopOrderGoodsDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrderGoodsDOExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("OrderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("OrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("OrderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("OrderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("OrderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("OrderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("OrderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("OrderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("OrderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("OrderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("OrderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("OrderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("OrderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("GoodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("GoodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("GoodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("GoodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("GoodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("GoodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("GoodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("GoodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("GoodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("GoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("GoodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("GoodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("GoodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("GoodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("GoodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("GoodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("GoodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("GoodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("GoodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("GoodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("GoodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIsNull() {
            addCriterion("GoodsNum is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIsNotNull() {
            addCriterion("GoodsNum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumEqualTo(Integer value) {
            addCriterion("GoodsNum =", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotEqualTo(Integer value) {
            addCriterion("GoodsNum <>", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumGreaterThan(Integer value) {
            addCriterion("GoodsNum >", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsNum >=", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumLessThan(Integer value) {
            addCriterion("GoodsNum <", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsNum <=", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIn(List<Integer> values) {
            addCriterion("GoodsNum in", values, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotIn(List<Integer> values) {
            addCriterion("GoodsNum not in", values, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumBetween(Integer value1, Integer value2) {
            addCriterion("GoodsNum between", value1, value2, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsNum not between", value1, value2, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoIsNull() {
            addCriterion("GoodsShortInfo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoIsNotNull() {
            addCriterion("GoodsShortInfo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoEqualTo(String value) {
            addCriterion("GoodsShortInfo =", value, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoNotEqualTo(String value) {
            addCriterion("GoodsShortInfo <>", value, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoGreaterThan(String value) {
            addCriterion("GoodsShortInfo >", value, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsShortInfo >=", value, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoLessThan(String value) {
            addCriterion("GoodsShortInfo <", value, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoLessThanOrEqualTo(String value) {
            addCriterion("GoodsShortInfo <=", value, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoLike(String value) {
            addCriterion("GoodsShortInfo like", value, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoNotLike(String value) {
            addCriterion("GoodsShortInfo not like", value, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoIn(List<String> values) {
            addCriterion("GoodsShortInfo in", values, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoNotIn(List<String> values) {
            addCriterion("GoodsShortInfo not in", values, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoBetween(String value1, String value2) {
            addCriterion("GoodsShortInfo between", value1, value2, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsshortinfoNotBetween(String value1, String value2) {
            addCriterion("GoodsShortInfo not between", value1, value2, "goodsshortinfo");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidIsNull() {
            addCriterion("GoodsCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidIsNotNull() {
            addCriterion("GoodsCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidEqualTo(Integer value) {
            addCriterion("GoodsCategoryId =", value, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidNotEqualTo(Integer value) {
            addCriterion("GoodsCategoryId <>", value, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidGreaterThan(Integer value) {
            addCriterion("GoodsCategoryId >", value, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsCategoryId >=", value, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidLessThan(Integer value) {
            addCriterion("GoodsCategoryId <", value, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsCategoryId <=", value, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidIn(List<Integer> values) {
            addCriterion("GoodsCategoryId in", values, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidNotIn(List<Integer> values) {
            addCriterion("GoodsCategoryId not in", values, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsCategoryId between", value1, value2, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsCategoryId not between", value1, value2, "goodscategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleIsNull() {
            addCriterion("GoodsCategoryTitle is null");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleIsNotNull() {
            addCriterion("GoodsCategoryTitle is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleEqualTo(String value) {
            addCriterion("GoodsCategoryTitle =", value, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleNotEqualTo(String value) {
            addCriterion("GoodsCategoryTitle <>", value, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleGreaterThan(String value) {
            addCriterion("GoodsCategoryTitle >", value, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsCategoryTitle >=", value, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleLessThan(String value) {
            addCriterion("GoodsCategoryTitle <", value, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleLessThanOrEqualTo(String value) {
            addCriterion("GoodsCategoryTitle <=", value, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleLike(String value) {
            addCriterion("GoodsCategoryTitle like", value, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleNotLike(String value) {
            addCriterion("GoodsCategoryTitle not like", value, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleIn(List<String> values) {
            addCriterion("GoodsCategoryTitle in", values, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleNotIn(List<String> values) {
            addCriterion("GoodsCategoryTitle not in", values, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleBetween(String value1, String value2) {
            addCriterion("GoodsCategoryTitle between", value1, value2, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodscategorytitleNotBetween(String value1, String value2) {
            addCriterion("GoodsCategoryTitle not between", value1, value2, "goodscategorytitle");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNull() {
            addCriterion("GoodsWeight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNotNull() {
            addCriterion("GoodsWeight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightEqualTo(BigDecimal value) {
            addCriterion("GoodsWeight =", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotEqualTo(BigDecimal value) {
            addCriterion("GoodsWeight <>", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThan(BigDecimal value) {
            addCriterion("GoodsWeight >", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsWeight >=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThan(BigDecimal value) {
            addCriterion("GoodsWeight <", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsWeight <=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIn(List<BigDecimal> values) {
            addCriterion("GoodsWeight in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotIn(List<BigDecimal> values) {
            addCriterion("GoodsWeight not in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsWeight between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsWeight not between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidIsNull() {
            addCriterion("GoodsCoverImgId is null");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidIsNotNull() {
            addCriterion("GoodsCoverImgId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidEqualTo(String value) {
            addCriterion("GoodsCoverImgId =", value, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidNotEqualTo(String value) {
            addCriterion("GoodsCoverImgId <>", value, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidGreaterThan(String value) {
            addCriterion("GoodsCoverImgId >", value, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsCoverImgId >=", value, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidLessThan(String value) {
            addCriterion("GoodsCoverImgId <", value, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidLessThanOrEqualTo(String value) {
            addCriterion("GoodsCoverImgId <=", value, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidLike(String value) {
            addCriterion("GoodsCoverImgId like", value, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidNotLike(String value) {
            addCriterion("GoodsCoverImgId not like", value, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidIn(List<String> values) {
            addCriterion("GoodsCoverImgId in", values, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidNotIn(List<String> values) {
            addCriterion("GoodsCoverImgId not in", values, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidBetween(String value1, String value2) {
            addCriterion("GoodsCoverImgId between", value1, value2, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodscoverimgidNotBetween(String value1, String value2) {
            addCriterion("GoodsCoverImgId not between", value1, value2, "goodscoverimgid");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesIsNull() {
            addCriterion("GoodsRollImages is null");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesIsNotNull() {
            addCriterion("GoodsRollImages is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesEqualTo(String value) {
            addCriterion("GoodsRollImages =", value, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesNotEqualTo(String value) {
            addCriterion("GoodsRollImages <>", value, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesGreaterThan(String value) {
            addCriterion("GoodsRollImages >", value, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsRollImages >=", value, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesLessThan(String value) {
            addCriterion("GoodsRollImages <", value, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesLessThanOrEqualTo(String value) {
            addCriterion("GoodsRollImages <=", value, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesLike(String value) {
            addCriterion("GoodsRollImages like", value, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesNotLike(String value) {
            addCriterion("GoodsRollImages not like", value, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesIn(List<String> values) {
            addCriterion("GoodsRollImages in", values, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesNotIn(List<String> values) {
            addCriterion("GoodsRollImages not in", values, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesBetween(String value1, String value2) {
            addCriterion("GoodsRollImages between", value1, value2, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodsrollimagesNotBetween(String value1, String value2) {
            addCriterion("GoodsRollImages not between", value1, value2, "goodsrollimages");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceIsNull() {
            addCriterion("GoodsSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceIsNotNull() {
            addCriterion("GoodsSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceEqualTo(BigDecimal value) {
            addCriterion("GoodsSalesPrice =", value, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceNotEqualTo(BigDecimal value) {
            addCriterion("GoodsSalesPrice <>", value, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceGreaterThan(BigDecimal value) {
            addCriterion("GoodsSalesPrice >", value, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsSalesPrice >=", value, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceLessThan(BigDecimal value) {
            addCriterion("GoodsSalesPrice <", value, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsSalesPrice <=", value, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceIn(List<BigDecimal> values) {
            addCriterion("GoodsSalesPrice in", values, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceNotIn(List<BigDecimal> values) {
            addCriterion("GoodsSalesPrice not in", values, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsSalesPrice between", value1, value2, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodssalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsSalesPrice not between", value1, value2, "goodssalesprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceIsNull() {
            addCriterion("GoodsCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceIsNotNull() {
            addCriterion("GoodsCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceEqualTo(BigDecimal value) {
            addCriterion("GoodsCostPrice =", value, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceNotEqualTo(BigDecimal value) {
            addCriterion("GoodsCostPrice <>", value, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceGreaterThan(BigDecimal value) {
            addCriterion("GoodsCostPrice >", value, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsCostPrice >=", value, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceLessThan(BigDecimal value) {
            addCriterion("GoodsCostPrice <", value, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsCostPrice <=", value, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceIn(List<BigDecimal> values) {
            addCriterion("GoodsCostPrice in", values, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceNotIn(List<BigDecimal> values) {
            addCriterion("GoodsCostPrice not in", values, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsCostPrice between", value1, value2, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodscostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsCostPrice not between", value1, value2, "goodscostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormIsNull() {
            addCriterion("GoodsIsNorm is null");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormIsNotNull() {
            addCriterion("GoodsIsNorm is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormEqualTo(Byte value) {
            addCriterion("GoodsIsNorm =", value, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormNotEqualTo(Byte value) {
            addCriterion("GoodsIsNorm <>", value, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormGreaterThan(Byte value) {
            addCriterion("GoodsIsNorm >", value, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormGreaterThanOrEqualTo(Byte value) {
            addCriterion("GoodsIsNorm >=", value, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormLessThan(Byte value) {
            addCriterion("GoodsIsNorm <", value, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormLessThanOrEqualTo(Byte value) {
            addCriterion("GoodsIsNorm <=", value, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormIn(List<Byte> values) {
            addCriterion("GoodsIsNorm in", values, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormNotIn(List<Byte> values) {
            addCriterion("GoodsIsNorm not in", values, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormBetween(Byte value1, Byte value2) {
            addCriterion("GoodsIsNorm between", value1, value2, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsisnormNotBetween(Byte value1, Byte value2) {
            addCriterion("GoodsIsNorm not between", value1, value2, "goodsisnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidIsNull() {
            addCriterion("GoodsNormId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidIsNotNull() {
            addCriterion("GoodsNormId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidEqualTo(Integer value) {
            addCriterion("GoodsNormId =", value, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidNotEqualTo(Integer value) {
            addCriterion("GoodsNormId <>", value, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidGreaterThan(Integer value) {
            addCriterion("GoodsNormId >", value, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsNormId >=", value, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidLessThan(Integer value) {
            addCriterion("GoodsNormId <", value, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsNormId <=", value, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidIn(List<Integer> values) {
            addCriterion("GoodsNormId in", values, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidNotIn(List<Integer> values) {
            addCriterion("GoodsNormId not in", values, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsNormId between", value1, value2, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsNormId not between", value1, value2, "goodsnormid");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsIsNull() {
            addCriterion("GoodsNorms is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsIsNotNull() {
            addCriterion("GoodsNorms is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsEqualTo(String value) {
            addCriterion("GoodsNorms =", value, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsNotEqualTo(String value) {
            addCriterion("GoodsNorms <>", value, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsGreaterThan(String value) {
            addCriterion("GoodsNorms >", value, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsNorms >=", value, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsLessThan(String value) {
            addCriterion("GoodsNorms <", value, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsLessThanOrEqualTo(String value) {
            addCriterion("GoodsNorms <=", value, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsLike(String value) {
            addCriterion("GoodsNorms like", value, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsNotLike(String value) {
            addCriterion("GoodsNorms not like", value, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsIn(List<String> values) {
            addCriterion("GoodsNorms in", values, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsNotIn(List<String> values) {
            addCriterion("GoodsNorms not in", values, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsBetween(String value1, String value2) {
            addCriterion("GoodsNorms between", value1, value2, "goodsnorms");
            return (Criteria) this;
        }

        public Criteria andGoodsnormsNotBetween(String value1, String value2) {
            addCriterion("GoodsNorms not between", value1, value2, "goodsnorms");
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

        public Criteria andCreatetimeEqualTo(Integer value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Integer value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Integer value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Integer value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Integer> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Integer> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
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