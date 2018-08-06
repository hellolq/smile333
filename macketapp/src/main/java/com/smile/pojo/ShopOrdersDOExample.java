package com.smile.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopOrdersDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrdersDOExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTotalordernoIsNull() {
            addCriterion("ToTalOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andTotalordernoIsNotNull() {
            addCriterion("ToTalOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andTotalordernoEqualTo(String value) {
            addCriterion("ToTalOrderNo =", value, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoNotEqualTo(String value) {
            addCriterion("ToTalOrderNo <>", value, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoGreaterThan(String value) {
            addCriterion("ToTalOrderNo >", value, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoGreaterThanOrEqualTo(String value) {
            addCriterion("ToTalOrderNo >=", value, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoLessThan(String value) {
            addCriterion("ToTalOrderNo <", value, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoLessThanOrEqualTo(String value) {
            addCriterion("ToTalOrderNo <=", value, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoLike(String value) {
            addCriterion("ToTalOrderNo like", value, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoNotLike(String value) {
            addCriterion("ToTalOrderNo not like", value, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoIn(List<String> values) {
            addCriterion("ToTalOrderNo in", values, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoNotIn(List<String> values) {
            addCriterion("ToTalOrderNo not in", values, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoBetween(String value1, String value2) {
            addCriterion("ToTalOrderNo between", value1, value2, "totalorderno");
            return (Criteria) this;
        }

        public Criteria andTotalordernoNotBetween(String value1, String value2) {
            addCriterion("ToTalOrderNo not between", value1, value2, "totalorderno");
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

        public Criteria andOrderstateIsNull() {
            addCriterion("OrderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("OrderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Integer value) {
            addCriterion("OrderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Integer value) {
            addCriterion("OrderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Integer value) {
            addCriterion("OrderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Integer value) {
            addCriterion("OrderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("OrderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Integer> values) {
            addCriterion("OrderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Integer> values) {
            addCriterion("OrderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("OrderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderState not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PayType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PayType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Integer value) {
            addCriterion("PayType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Integer value) {
            addCriterion("PayType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Integer value) {
            addCriterion("PayType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Integer value) {
            addCriterion("PayType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("PayType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Integer> values) {
            addCriterion("PayType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Integer> values) {
            addCriterion("PayType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("PayType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PayType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNull() {
            addCriterion("PayState is null");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNotNull() {
            addCriterion("PayState is not null");
            return (Criteria) this;
        }

        public Criteria andPaystateEqualTo(Integer value) {
            addCriterion("PayState =", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotEqualTo(Integer value) {
            addCriterion("PayState <>", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThan(Integer value) {
            addCriterion("PayState >", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayState >=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThan(Integer value) {
            addCriterion("PayState <", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThanOrEqualTo(Integer value) {
            addCriterion("PayState <=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateIn(List<Integer> values) {
            addCriterion("PayState in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotIn(List<Integer> values) {
            addCriterion("PayState not in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateBetween(Integer value1, Integer value2) {
            addCriterion("PayState between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotBetween(Integer value1, Integer value2) {
            addCriterion("PayState not between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNull() {
            addCriterion("ExpressId is null");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNotNull() {
            addCriterion("ExpressId is not null");
            return (Criteria) this;
        }

        public Criteria andExpressidEqualTo(Integer value) {
            addCriterion("ExpressId =", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotEqualTo(Integer value) {
            addCriterion("ExpressId <>", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThan(Integer value) {
            addCriterion("ExpressId >", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExpressId >=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThan(Integer value) {
            addCriterion("ExpressId <", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThanOrEqualTo(Integer value) {
            addCriterion("ExpressId <=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidIn(List<Integer> values) {
            addCriterion("ExpressId in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotIn(List<Integer> values) {
            addCriterion("ExpressId not in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidBetween(Integer value1, Integer value2) {
            addCriterion("ExpressId between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotBetween(Integer value1, Integer value2) {
            addCriterion("ExpressId not between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressnameIsNull() {
            addCriterion("ExpressName is null");
            return (Criteria) this;
        }

        public Criteria andExpressnameIsNotNull() {
            addCriterion("ExpressName is not null");
            return (Criteria) this;
        }

        public Criteria andExpressnameEqualTo(String value) {
            addCriterion("ExpressName =", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotEqualTo(String value) {
            addCriterion("ExpressName <>", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameGreaterThan(String value) {
            addCriterion("ExpressName >", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameGreaterThanOrEqualTo(String value) {
            addCriterion("ExpressName >=", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLessThan(String value) {
            addCriterion("ExpressName <", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLessThanOrEqualTo(String value) {
            addCriterion("ExpressName <=", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLike(String value) {
            addCriterion("ExpressName like", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotLike(String value) {
            addCriterion("ExpressName not like", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameIn(List<String> values) {
            addCriterion("ExpressName in", values, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotIn(List<String> values) {
            addCriterion("ExpressName not in", values, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameBetween(String value1, String value2) {
            addCriterion("ExpressName between", value1, value2, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotBetween(String value1, String value2) {
            addCriterion("ExpressName not between", value1, value2, "expressname");
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

        public Criteria andGoodstotalcostpriceIsNull() {
            addCriterion("GoodsTotalCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceIsNotNull() {
            addCriterion("GoodsTotalCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalCostPrice =", value, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceNotEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalCostPrice <>", value, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceGreaterThan(BigDecimal value) {
            addCriterion("GoodsTotalCostPrice >", value, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalCostPrice >=", value, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceLessThan(BigDecimal value) {
            addCriterion("GoodsTotalCostPrice <", value, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalCostPrice <=", value, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceIn(List<BigDecimal> values) {
            addCriterion("GoodsTotalCostPrice in", values, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceNotIn(List<BigDecimal> values) {
            addCriterion("GoodsTotalCostPrice not in", values, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsTotalCostPrice between", value1, value2, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalcostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsTotalCostPrice not between", value1, value2, "goodstotalcostprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceIsNull() {
            addCriterion("GoodsTotalPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceIsNotNull() {
            addCriterion("GoodsTotalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPrice =", value, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPrice <>", value, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceGreaterThan(BigDecimal value) {
            addCriterion("GoodsTotalPrice >", value, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPrice >=", value, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceLessThan(BigDecimal value) {
            addCriterion("GoodsTotalPrice <", value, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPrice <=", value, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceIn(List<BigDecimal> values) {
            addCriterion("GoodsTotalPrice in", values, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("GoodsTotalPrice not in", values, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsTotalPrice between", value1, value2, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsTotalPrice not between", value1, value2, "goodstotalprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceIsNull() {
            addCriterion("GoodsTotalPVPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceIsNotNull() {
            addCriterion("GoodsTotalPVPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPVPrice =", value, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceNotEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPVPrice <>", value, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceGreaterThan(BigDecimal value) {
            addCriterion("GoodsTotalPVPrice >", value, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPVPrice >=", value, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceLessThan(BigDecimal value) {
            addCriterion("GoodsTotalPVPrice <", value, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPVPrice <=", value, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceIn(List<BigDecimal> values) {
            addCriterion("GoodsTotalPVPrice in", values, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceNotIn(List<BigDecimal> values) {
            addCriterion("GoodsTotalPVPrice not in", values, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsTotalPVPrice between", value1, value2, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpvpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsTotalPVPrice not between", value1, value2, "goodstotalpvprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceIsNull() {
            addCriterion("ExpressPrice is null");
            return (Criteria) this;
        }

        public Criteria andExpresspriceIsNotNull() {
            addCriterion("ExpressPrice is not null");
            return (Criteria) this;
        }

        public Criteria andExpresspriceEqualTo(BigDecimal value) {
            addCriterion("ExpressPrice =", value, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceNotEqualTo(BigDecimal value) {
            addCriterion("ExpressPrice <>", value, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceGreaterThan(BigDecimal value) {
            addCriterion("ExpressPrice >", value, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ExpressPrice >=", value, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceLessThan(BigDecimal value) {
            addCriterion("ExpressPrice <", value, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ExpressPrice <=", value, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceIn(List<BigDecimal> values) {
            addCriterion("ExpressPrice in", values, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceNotIn(List<BigDecimal> values) {
            addCriterion("ExpressPrice not in", values, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExpressPrice between", value1, value2, "expressprice");
            return (Criteria) this;
        }

        public Criteria andExpresspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExpressPrice not between", value1, value2, "expressprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("TotalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("TotalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(BigDecimal value) {
            addCriterion("TotalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("TotalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(BigDecimal value) {
            addCriterion("TotalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(BigDecimal value) {
            addCriterion("TotalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<BigDecimal> values) {
            addCriterion("TotalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("TotalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPrice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("PayTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("PayTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Long value) {
            addCriterion("PayTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Long value) {
            addCriterion("PayTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Long value) {
            addCriterion("PayTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Long value) {
            addCriterion("PayTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Long value) {
            addCriterion("PayTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Long value) {
            addCriterion("PayTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Long> values) {
            addCriterion("PayTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Long> values) {
            addCriterion("PayTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Long value1, Long value2) {
            addCriterion("PayTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Long value1, Long value2) {
            addCriterion("PayTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoIsNull() {
            addCriterion("OuttranOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoIsNotNull() {
            addCriterion("OuttranOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoEqualTo(String value) {
            addCriterion("OuttranOrderNo =", value, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoNotEqualTo(String value) {
            addCriterion("OuttranOrderNo <>", value, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoGreaterThan(String value) {
            addCriterion("OuttranOrderNo >", value, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoGreaterThanOrEqualTo(String value) {
            addCriterion("OuttranOrderNo >=", value, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoLessThan(String value) {
            addCriterion("OuttranOrderNo <", value, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoLessThanOrEqualTo(String value) {
            addCriterion("OuttranOrderNo <=", value, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoLike(String value) {
            addCriterion("OuttranOrderNo like", value, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoNotLike(String value) {
            addCriterion("OuttranOrderNo not like", value, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoIn(List<String> values) {
            addCriterion("OuttranOrderNo in", values, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoNotIn(List<String> values) {
            addCriterion("OuttranOrderNo not in", values, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoBetween(String value1, String value2) {
            addCriterion("OuttranOrderNo between", value1, value2, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andOuttranordernoNotBetween(String value1, String value2) {
            addCriterion("OuttranOrderNo not between", value1, value2, "outtranorderno");
            return (Criteria) this;
        }

        public Criteria andLeavewordIsNull() {
            addCriterion("LeaveWord is null");
            return (Criteria) this;
        }

        public Criteria andLeavewordIsNotNull() {
            addCriterion("LeaveWord is not null");
            return (Criteria) this;
        }

        public Criteria andLeavewordEqualTo(String value) {
            addCriterion("LeaveWord =", value, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordNotEqualTo(String value) {
            addCriterion("LeaveWord <>", value, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordGreaterThan(String value) {
            addCriterion("LeaveWord >", value, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordGreaterThanOrEqualTo(String value) {
            addCriterion("LeaveWord >=", value, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordLessThan(String value) {
            addCriterion("LeaveWord <", value, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordLessThanOrEqualTo(String value) {
            addCriterion("LeaveWord <=", value, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordLike(String value) {
            addCriterion("LeaveWord like", value, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordNotLike(String value) {
            addCriterion("LeaveWord not like", value, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordIn(List<String> values) {
            addCriterion("LeaveWord in", values, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordNotIn(List<String> values) {
            addCriterion("LeaveWord not in", values, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordBetween(String value1, String value2) {
            addCriterion("LeaveWord between", value1, value2, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordNotBetween(String value1, String value2) {
            addCriterion("LeaveWord not between", value1, value2, "leaveword");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoIsNull() {
            addCriterion("LeaveWordTwo is null");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoIsNotNull() {
            addCriterion("LeaveWordTwo is not null");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoEqualTo(String value) {
            addCriterion("LeaveWordTwo =", value, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoNotEqualTo(String value) {
            addCriterion("LeaveWordTwo <>", value, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoGreaterThan(String value) {
            addCriterion("LeaveWordTwo >", value, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoGreaterThanOrEqualTo(String value) {
            addCriterion("LeaveWordTwo >=", value, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoLessThan(String value) {
            addCriterion("LeaveWordTwo <", value, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoLessThanOrEqualTo(String value) {
            addCriterion("LeaveWordTwo <=", value, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoLike(String value) {
            addCriterion("LeaveWordTwo like", value, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoNotLike(String value) {
            addCriterion("LeaveWordTwo not like", value, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoIn(List<String> values) {
            addCriterion("LeaveWordTwo in", values, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoNotIn(List<String> values) {
            addCriterion("LeaveWordTwo not in", values, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoBetween(String value1, String value2) {
            addCriterion("LeaveWordTwo between", value1, value2, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andLeavewordtwoNotBetween(String value1, String value2) {
            addCriterion("LeaveWordTwo not between", value1, value2, "leavewordtwo");
            return (Criteria) this;
        }

        public Criteria andBalanceoneIsNull() {
            addCriterion("BalanceOne is null");
            return (Criteria) this;
        }

        public Criteria andBalanceoneIsNotNull() {
            addCriterion("BalanceOne is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceoneEqualTo(BigDecimal value) {
            addCriterion("BalanceOne =", value, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneNotEqualTo(BigDecimal value) {
            addCriterion("BalanceOne <>", value, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneGreaterThan(BigDecimal value) {
            addCriterion("BalanceOne >", value, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BalanceOne >=", value, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneLessThan(BigDecimal value) {
            addCriterion("BalanceOne <", value, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BalanceOne <=", value, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneIn(List<BigDecimal> values) {
            addCriterion("BalanceOne in", values, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneNotIn(List<BigDecimal> values) {
            addCriterion("BalanceOne not in", values, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BalanceOne between", value1, value2, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalanceoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BalanceOne not between", value1, value2, "balanceone");
            return (Criteria) this;
        }

        public Criteria andBalancetwoIsNull() {
            addCriterion("BalanceTwo is null");
            return (Criteria) this;
        }

        public Criteria andBalancetwoIsNotNull() {
            addCriterion("BalanceTwo is not null");
            return (Criteria) this;
        }

        public Criteria andBalancetwoEqualTo(BigDecimal value) {
            addCriterion("BalanceTwo =", value, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoNotEqualTo(BigDecimal value) {
            addCriterion("BalanceTwo <>", value, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoGreaterThan(BigDecimal value) {
            addCriterion("BalanceTwo >", value, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BalanceTwo >=", value, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoLessThan(BigDecimal value) {
            addCriterion("BalanceTwo <", value, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BalanceTwo <=", value, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoIn(List<BigDecimal> values) {
            addCriterion("BalanceTwo in", values, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoNotIn(List<BigDecimal> values) {
            addCriterion("BalanceTwo not in", values, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BalanceTwo between", value1, value2, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andBalancetwoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BalanceTwo not between", value1, value2, "balancetwo");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("Integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("Integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(BigDecimal value) {
            addCriterion("Integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(BigDecimal value) {
            addCriterion("Integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(BigDecimal value) {
            addCriterion("Integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(BigDecimal value) {
            addCriterion("Integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<BigDecimal> values) {
            addCriterion("Integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<BigDecimal> values) {
            addCriterion("Integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyIsNull() {
            addCriterion("WeixinMoney is null");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyIsNotNull() {
            addCriterion("WeixinMoney is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyEqualTo(BigDecimal value) {
            addCriterion("WeixinMoney =", value, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyNotEqualTo(BigDecimal value) {
            addCriterion("WeixinMoney <>", value, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyGreaterThan(BigDecimal value) {
            addCriterion("WeixinMoney >", value, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WeixinMoney >=", value, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyLessThan(BigDecimal value) {
            addCriterion("WeixinMoney <", value, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WeixinMoney <=", value, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyIn(List<BigDecimal> values) {
            addCriterion("WeixinMoney in", values, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyNotIn(List<BigDecimal> values) {
            addCriterion("WeixinMoney not in", values, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WeixinMoney between", value1, value2, "weixinmoney");
            return (Criteria) this;
        }

        public Criteria andWeixinmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WeixinMoney not between", value1, value2, "weixinmoney");
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

        public Criteria andReceivernameIsNull() {
            addCriterion("ReceiverName is null");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNotNull() {
            addCriterion("ReceiverName is not null");
            return (Criteria) this;
        }

        public Criteria andReceivernameEqualTo(String value) {
            addCriterion("ReceiverName =", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotEqualTo(String value) {
            addCriterion("ReceiverName <>", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThan(String value) {
            addCriterion("ReceiverName >", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverName >=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThan(String value) {
            addCriterion("ReceiverName <", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThanOrEqualTo(String value) {
            addCriterion("ReceiverName <=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLike(String value) {
            addCriterion("ReceiverName like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotLike(String value) {
            addCriterion("ReceiverName not like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIn(List<String> values) {
            addCriterion("ReceiverName in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotIn(List<String> values) {
            addCriterion("ReceiverName not in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameBetween(String value1, String value2) {
            addCriterion("ReceiverName between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotBetween(String value1, String value2) {
            addCriterion("ReceiverName not between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivermobileIsNull() {
            addCriterion("ReceiverMobile is null");
            return (Criteria) this;
        }

        public Criteria andReceivermobileIsNotNull() {
            addCriterion("ReceiverMobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceivermobileEqualTo(String value) {
            addCriterion("ReceiverMobile =", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileNotEqualTo(String value) {
            addCriterion("ReceiverMobile <>", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileGreaterThan(String value) {
            addCriterion("ReceiverMobile >", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverMobile >=", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileLessThan(String value) {
            addCriterion("ReceiverMobile <", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileLessThanOrEqualTo(String value) {
            addCriterion("ReceiverMobile <=", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileLike(String value) {
            addCriterion("ReceiverMobile like", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileNotLike(String value) {
            addCriterion("ReceiverMobile not like", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileIn(List<String> values) {
            addCriterion("ReceiverMobile in", values, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileNotIn(List<String> values) {
            addCriterion("ReceiverMobile not in", values, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileBetween(String value1, String value2) {
            addCriterion("ReceiverMobile between", value1, value2, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileNotBetween(String value1, String value2) {
            addCriterion("ReceiverMobile not between", value1, value2, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneIsNull() {
            addCriterion("ReceiverTelPhone is null");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneIsNotNull() {
            addCriterion("ReceiverTelPhone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneEqualTo(String value) {
            addCriterion("ReceiverTelPhone =", value, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneNotEqualTo(String value) {
            addCriterion("ReceiverTelPhone <>", value, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneGreaterThan(String value) {
            addCriterion("ReceiverTelPhone >", value, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverTelPhone >=", value, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneLessThan(String value) {
            addCriterion("ReceiverTelPhone <", value, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneLessThanOrEqualTo(String value) {
            addCriterion("ReceiverTelPhone <=", value, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneLike(String value) {
            addCriterion("ReceiverTelPhone like", value, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneNotLike(String value) {
            addCriterion("ReceiverTelPhone not like", value, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneIn(List<String> values) {
            addCriterion("ReceiverTelPhone in", values, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneNotIn(List<String> values) {
            addCriterion("ReceiverTelPhone not in", values, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneBetween(String value1, String value2) {
            addCriterion("ReceiverTelPhone between", value1, value2, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceivertelphoneNotBetween(String value1, String value2) {
            addCriterion("ReceiverTelPhone not between", value1, value2, "receivertelphone");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidIsNull() {
            addCriterion("ReceiverProvinceId is null");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidIsNotNull() {
            addCriterion("ReceiverProvinceId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidEqualTo(Integer value) {
            addCriterion("ReceiverProvinceId =", value, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidNotEqualTo(Integer value) {
            addCriterion("ReceiverProvinceId <>", value, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidGreaterThan(Integer value) {
            addCriterion("ReceiverProvinceId >", value, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceiverProvinceId >=", value, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidLessThan(Integer value) {
            addCriterion("ReceiverProvinceId <", value, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidLessThanOrEqualTo(Integer value) {
            addCriterion("ReceiverProvinceId <=", value, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidIn(List<Integer> values) {
            addCriterion("ReceiverProvinceId in", values, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidNotIn(List<Integer> values) {
            addCriterion("ReceiverProvinceId not in", values, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidBetween(Integer value1, Integer value2) {
            addCriterion("ReceiverProvinceId between", value1, value2, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceiverprovinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceiverProvinceId not between", value1, value2, "receiverprovinceid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidIsNull() {
            addCriterion("ReceiverCityId is null");
            return (Criteria) this;
        }

        public Criteria andReceivercityidIsNotNull() {
            addCriterion("ReceiverCityId is not null");
            return (Criteria) this;
        }

        public Criteria andReceivercityidEqualTo(Integer value) {
            addCriterion("ReceiverCityId =", value, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidNotEqualTo(Integer value) {
            addCriterion("ReceiverCityId <>", value, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidGreaterThan(Integer value) {
            addCriterion("ReceiverCityId >", value, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceiverCityId >=", value, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidLessThan(Integer value) {
            addCriterion("ReceiverCityId <", value, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidLessThanOrEqualTo(Integer value) {
            addCriterion("ReceiverCityId <=", value, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidIn(List<Integer> values) {
            addCriterion("ReceiverCityId in", values, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidNotIn(List<Integer> values) {
            addCriterion("ReceiverCityId not in", values, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidBetween(Integer value1, Integer value2) {
            addCriterion("ReceiverCityId between", value1, value2, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceivercityidNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceiverCityId not between", value1, value2, "receivercityid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidIsNull() {
            addCriterion("ReceiverAreaId is null");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidIsNotNull() {
            addCriterion("ReceiverAreaId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidEqualTo(Integer value) {
            addCriterion("ReceiverAreaId =", value, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidNotEqualTo(Integer value) {
            addCriterion("ReceiverAreaId <>", value, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidGreaterThan(Integer value) {
            addCriterion("ReceiverAreaId >", value, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceiverAreaId >=", value, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidLessThan(Integer value) {
            addCriterion("ReceiverAreaId <", value, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidLessThanOrEqualTo(Integer value) {
            addCriterion("ReceiverAreaId <=", value, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidIn(List<Integer> values) {
            addCriterion("ReceiverAreaId in", values, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidNotIn(List<Integer> values) {
            addCriterion("ReceiverAreaId not in", values, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidBetween(Integer value1, Integer value2) {
            addCriterion("ReceiverAreaId between", value1, value2, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiverareaidNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceiverAreaId not between", value1, value2, "receiverareaid");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressIsNull() {
            addCriterion("ReceiverAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressIsNotNull() {
            addCriterion("ReceiverAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressEqualTo(String value) {
            addCriterion("ReceiverAddress =", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressNotEqualTo(String value) {
            addCriterion("ReceiverAddress <>", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressGreaterThan(String value) {
            addCriterion("ReceiverAddress >", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverAddress >=", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressLessThan(String value) {
            addCriterion("ReceiverAddress <", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressLessThanOrEqualTo(String value) {
            addCriterion("ReceiverAddress <=", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressLike(String value) {
            addCriterion("ReceiverAddress like", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressNotLike(String value) {
            addCriterion("ReceiverAddress not like", value, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressIn(List<String> values) {
            addCriterion("ReceiverAddress in", values, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressNotIn(List<String> values) {
            addCriterion("ReceiverAddress not in", values, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressBetween(String value1, String value2) {
            addCriterion("ReceiverAddress between", value1, value2, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andReceiveraddressNotBetween(String value1, String value2) {
            addCriterion("ReceiverAddress not between", value1, value2, "receiveraddress");
            return (Criteria) this;
        }

        public Criteria andSendexpressidIsNull() {
            addCriterion("SendExpressId is null");
            return (Criteria) this;
        }

        public Criteria andSendexpressidIsNotNull() {
            addCriterion("SendExpressId is not null");
            return (Criteria) this;
        }

        public Criteria andSendexpressidEqualTo(Integer value) {
            addCriterion("SendExpressId =", value, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidNotEqualTo(Integer value) {
            addCriterion("SendExpressId <>", value, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidGreaterThan(Integer value) {
            addCriterion("SendExpressId >", value, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SendExpressId >=", value, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidLessThan(Integer value) {
            addCriterion("SendExpressId <", value, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidLessThanOrEqualTo(Integer value) {
            addCriterion("SendExpressId <=", value, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidIn(List<Integer> values) {
            addCriterion("SendExpressId in", values, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidNotIn(List<Integer> values) {
            addCriterion("SendExpressId not in", values, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidBetween(Integer value1, Integer value2) {
            addCriterion("SendExpressId between", value1, value2, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressidNotBetween(Integer value1, Integer value2) {
            addCriterion("SendExpressId not between", value1, value2, "sendexpressid");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameIsNull() {
            addCriterion("SendExpressName is null");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameIsNotNull() {
            addCriterion("SendExpressName is not null");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameEqualTo(String value) {
            addCriterion("SendExpressName =", value, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameNotEqualTo(String value) {
            addCriterion("SendExpressName <>", value, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameGreaterThan(String value) {
            addCriterion("SendExpressName >", value, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameGreaterThanOrEqualTo(String value) {
            addCriterion("SendExpressName >=", value, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameLessThan(String value) {
            addCriterion("SendExpressName <", value, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameLessThanOrEqualTo(String value) {
            addCriterion("SendExpressName <=", value, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameLike(String value) {
            addCriterion("SendExpressName like", value, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameNotLike(String value) {
            addCriterion("SendExpressName not like", value, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameIn(List<String> values) {
            addCriterion("SendExpressName in", values, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameNotIn(List<String> values) {
            addCriterion("SendExpressName not in", values, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameBetween(String value1, String value2) {
            addCriterion("SendExpressName between", value1, value2, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnameNotBetween(String value1, String value2) {
            addCriterion("SendExpressName not between", value1, value2, "sendexpressname");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoIsNull() {
            addCriterion("SendExpressNo is null");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoIsNotNull() {
            addCriterion("SendExpressNo is not null");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoEqualTo(String value) {
            addCriterion("SendExpressNo =", value, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoNotEqualTo(String value) {
            addCriterion("SendExpressNo <>", value, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoGreaterThan(String value) {
            addCriterion("SendExpressNo >", value, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoGreaterThanOrEqualTo(String value) {
            addCriterion("SendExpressNo >=", value, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoLessThan(String value) {
            addCriterion("SendExpressNo <", value, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoLessThanOrEqualTo(String value) {
            addCriterion("SendExpressNo <=", value, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoLike(String value) {
            addCriterion("SendExpressNo like", value, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoNotLike(String value) {
            addCriterion("SendExpressNo not like", value, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoIn(List<String> values) {
            addCriterion("SendExpressNo in", values, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoNotIn(List<String> values) {
            addCriterion("SendExpressNo not in", values, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoBetween(String value1, String value2) {
            addCriterion("SendExpressNo between", value1, value2, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andSendexpressnoNotBetween(String value1, String value2) {
            addCriterion("SendExpressNo not between", value1, value2, "sendexpressno");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIsNull() {
            addCriterion("IsInvoice is null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIsNotNull() {
            addCriterion("IsInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceEqualTo(Byte value) {
            addCriterion("IsInvoice =", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotEqualTo(Byte value) {
            addCriterion("IsInvoice <>", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceGreaterThan(Byte value) {
            addCriterion("IsInvoice >", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsInvoice >=", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceLessThan(Byte value) {
            addCriterion("IsInvoice <", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceLessThanOrEqualTo(Byte value) {
            addCriterion("IsInvoice <=", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIn(List<Byte> values) {
            addCriterion("IsInvoice in", values, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotIn(List<Byte> values) {
            addCriterion("IsInvoice not in", values, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceBetween(Byte value1, Byte value2) {
            addCriterion("IsInvoice between", value1, value2, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotBetween(Byte value1, Byte value2) {
            addCriterion("IsInvoice not between", value1, value2, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("InvoiceType is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("InvoiceType is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(String value) {
            addCriterion("InvoiceType =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(String value) {
            addCriterion("InvoiceType <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(String value) {
            addCriterion("InvoiceType >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceType >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(String value) {
            addCriterion("InvoiceType <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(String value) {
            addCriterion("InvoiceType <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLike(String value) {
            addCriterion("InvoiceType like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotLike(String value) {
            addCriterion("InvoiceType not like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<String> values) {
            addCriterion("InvoiceType in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<String> values) {
            addCriterion("InvoiceType not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(String value1, String value2) {
            addCriterion("InvoiceType between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(String value1, String value2) {
            addCriterion("InvoiceType not between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIsNull() {
            addCriterion("InvoiceTitle is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIsNotNull() {
            addCriterion("InvoiceTitle is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleEqualTo(String value) {
            addCriterion("InvoiceTitle =", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotEqualTo(String value) {
            addCriterion("InvoiceTitle <>", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleGreaterThan(String value) {
            addCriterion("InvoiceTitle >", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceTitle >=", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLessThan(String value) {
            addCriterion("InvoiceTitle <", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLessThanOrEqualTo(String value) {
            addCriterion("InvoiceTitle <=", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLike(String value) {
            addCriterion("InvoiceTitle like", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotLike(String value) {
            addCriterion("InvoiceTitle not like", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIn(List<String> values) {
            addCriterion("InvoiceTitle in", values, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotIn(List<String> values) {
            addCriterion("InvoiceTitle not in", values, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleBetween(String value1, String value2) {
            addCriterion("InvoiceTitle between", value1, value2, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotBetween(String value1, String value2) {
            addCriterion("InvoiceTitle not between", value1, value2, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andH5payordernoIsNull() {
            addCriterion("H5PayOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andH5payordernoIsNotNull() {
            addCriterion("H5PayOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andH5payordernoEqualTo(String value) {
            addCriterion("H5PayOrderNo =", value, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoNotEqualTo(String value) {
            addCriterion("H5PayOrderNo <>", value, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoGreaterThan(String value) {
            addCriterion("H5PayOrderNo >", value, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoGreaterThanOrEqualTo(String value) {
            addCriterion("H5PayOrderNo >=", value, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoLessThan(String value) {
            addCriterion("H5PayOrderNo <", value, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoLessThanOrEqualTo(String value) {
            addCriterion("H5PayOrderNo <=", value, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoLike(String value) {
            addCriterion("H5PayOrderNo like", value, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoNotLike(String value) {
            addCriterion("H5PayOrderNo not like", value, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoIn(List<String> values) {
            addCriterion("H5PayOrderNo in", values, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoNotIn(List<String> values) {
            addCriterion("H5PayOrderNo not in", values, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoBetween(String value1, String value2) {
            addCriterion("H5PayOrderNo between", value1, value2, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andH5payordernoNotBetween(String value1, String value2) {
            addCriterion("H5PayOrderNo not between", value1, value2, "h5payorderno");
            return (Criteria) this;
        }

        public Criteria andWxopenidIsNull() {
            addCriterion("wxOpenId is null");
            return (Criteria) this;
        }

        public Criteria andWxopenidIsNotNull() {
            addCriterion("wxOpenId is not null");
            return (Criteria) this;
        }

        public Criteria andWxopenidEqualTo(String value) {
            addCriterion("wxOpenId =", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotEqualTo(String value) {
            addCriterion("wxOpenId <>", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidGreaterThan(String value) {
            addCriterion("wxOpenId >", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidGreaterThanOrEqualTo(String value) {
            addCriterion("wxOpenId >=", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLessThan(String value) {
            addCriterion("wxOpenId <", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLessThanOrEqualTo(String value) {
            addCriterion("wxOpenId <=", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLike(String value) {
            addCriterion("wxOpenId like", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotLike(String value) {
            addCriterion("wxOpenId not like", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidIn(List<String> values) {
            addCriterion("wxOpenId in", values, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotIn(List<String> values) {
            addCriterion("wxOpenId not in", values, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidBetween(String value1, String value2) {
            addCriterion("wxOpenId between", value1, value2, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotBetween(String value1, String value2) {
            addCriterion("wxOpenId not between", value1, value2, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andNewtimeIsNull() {
            addCriterion("NewTime is null");
            return (Criteria) this;
        }

        public Criteria andNewtimeIsNotNull() {
            addCriterion("NewTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewtimeEqualTo(Long value) {
            addCriterion("NewTime =", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeNotEqualTo(Long value) {
            addCriterion("NewTime <>", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeGreaterThan(Long value) {
            addCriterion("NewTime >", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("NewTime >=", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeLessThan(Long value) {
            addCriterion("NewTime <", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeLessThanOrEqualTo(Long value) {
            addCriterion("NewTime <=", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeIn(List<Long> values) {
            addCriterion("NewTime in", values, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeNotIn(List<Long> values) {
            addCriterion("NewTime not in", values, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeBetween(Long value1, Long value2) {
            addCriterion("NewTime between", value1, value2, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeNotBetween(Long value1, Long value2) {
            addCriterion("NewTime not between", value1, value2, "newtime");
            return (Criteria) this;
        }

        public Criteria andBargainidIsNull() {
            addCriterion("BargainId is null");
            return (Criteria) this;
        }

        public Criteria andBargainidIsNotNull() {
            addCriterion("BargainId is not null");
            return (Criteria) this;
        }

        public Criteria andBargainidEqualTo(Integer value) {
            addCriterion("BargainId =", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidNotEqualTo(Integer value) {
            addCriterion("BargainId <>", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidGreaterThan(Integer value) {
            addCriterion("BargainId >", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BargainId >=", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidLessThan(Integer value) {
            addCriterion("BargainId <", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidLessThanOrEqualTo(Integer value) {
            addCriterion("BargainId <=", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidIn(List<Integer> values) {
            addCriterion("BargainId in", values, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidNotIn(List<Integer> values) {
            addCriterion("BargainId not in", values, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidBetween(Integer value1, Integer value2) {
            addCriterion("BargainId between", value1, value2, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidNotBetween(Integer value1, Integer value2) {
            addCriterion("BargainId not between", value1, value2, "bargainid");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralIsNull() {
            addCriterion("AllowMaxUseIntegral is null");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralIsNotNull() {
            addCriterion("AllowMaxUseIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralEqualTo(Integer value) {
            addCriterion("AllowMaxUseIntegral =", value, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralNotEqualTo(Integer value) {
            addCriterion("AllowMaxUseIntegral <>", value, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralGreaterThan(Integer value) {
            addCriterion("AllowMaxUseIntegral >", value, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("AllowMaxUseIntegral >=", value, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralLessThan(Integer value) {
            addCriterion("AllowMaxUseIntegral <", value, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralLessThanOrEqualTo(Integer value) {
            addCriterion("AllowMaxUseIntegral <=", value, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralIn(List<Integer> values) {
            addCriterion("AllowMaxUseIntegral in", values, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralNotIn(List<Integer> values) {
            addCriterion("AllowMaxUseIntegral not in", values, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralBetween(Integer value1, Integer value2) {
            addCriterion("AllowMaxUseIntegral between", value1, value2, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andAllowmaxuseintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("AllowMaxUseIntegral not between", value1, value2, "allowmaxuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralIsNull() {
            addCriterion("RealUseIntegral is null");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralIsNotNull() {
            addCriterion("RealUseIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralEqualTo(Integer value) {
            addCriterion("RealUseIntegral =", value, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralNotEqualTo(Integer value) {
            addCriterion("RealUseIntegral <>", value, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralGreaterThan(Integer value) {
            addCriterion("RealUseIntegral >", value, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("RealUseIntegral >=", value, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralLessThan(Integer value) {
            addCriterion("RealUseIntegral <", value, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralLessThanOrEqualTo(Integer value) {
            addCriterion("RealUseIntegral <=", value, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralIn(List<Integer> values) {
            addCriterion("RealUseIntegral in", values, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralNotIn(List<Integer> values) {
            addCriterion("RealUseIntegral not in", values, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralBetween(Integer value1, Integer value2) {
            addCriterion("RealUseIntegral between", value1, value2, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andRealuseintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("RealUseIntegral not between", value1, value2, "realuseintegral");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoIsNull() {
            addCriterion("TotalPriceTwo is null");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoIsNotNull() {
            addCriterion("TotalPriceTwo is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoEqualTo(BigDecimal value) {
            addCriterion("TotalPriceTwo =", value, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoNotEqualTo(BigDecimal value) {
            addCriterion("TotalPriceTwo <>", value, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoGreaterThan(BigDecimal value) {
            addCriterion("TotalPriceTwo >", value, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPriceTwo >=", value, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoLessThan(BigDecimal value) {
            addCriterion("TotalPriceTwo <", value, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPriceTwo <=", value, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoIn(List<BigDecimal> values) {
            addCriterion("TotalPriceTwo in", values, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoNotIn(List<BigDecimal> values) {
            addCriterion("TotalPriceTwo not in", values, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPriceTwo between", value1, value2, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andTotalpricetwoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPriceTwo not between", value1, value2, "totalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoIsNull() {
            addCriterion("GoodsTotalPriceTwo is null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoIsNotNull() {
            addCriterion("GoodsTotalPriceTwo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPriceTwo =", value, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoNotEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPriceTwo <>", value, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoGreaterThan(BigDecimal value) {
            addCriterion("GoodsTotalPriceTwo >", value, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPriceTwo >=", value, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoLessThan(BigDecimal value) {
            addCriterion("GoodsTotalPriceTwo <", value, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GoodsTotalPriceTwo <=", value, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoIn(List<BigDecimal> values) {
            addCriterion("GoodsTotalPriceTwo in", values, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoNotIn(List<BigDecimal> values) {
            addCriterion("GoodsTotalPriceTwo not in", values, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsTotalPriceTwo between", value1, value2, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andGoodstotalpricetwoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GoodsTotalPriceTwo not between", value1, value2, "goodstotalpricetwo");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayIsNull() {
            addCriterion("IsUseIntegralPay is null");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayIsNotNull() {
            addCriterion("IsUseIntegralPay is not null");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayEqualTo(Byte value) {
            addCriterion("IsUseIntegralPay =", value, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayNotEqualTo(Byte value) {
            addCriterion("IsUseIntegralPay <>", value, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayGreaterThan(Byte value) {
            addCriterion("IsUseIntegralPay >", value, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsUseIntegralPay >=", value, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayLessThan(Byte value) {
            addCriterion("IsUseIntegralPay <", value, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayLessThanOrEqualTo(Byte value) {
            addCriterion("IsUseIntegralPay <=", value, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayIn(List<Byte> values) {
            addCriterion("IsUseIntegralPay in", values, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayNotIn(List<Byte> values) {
            addCriterion("IsUseIntegralPay not in", values, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayBetween(Byte value1, Byte value2) {
            addCriterion("IsUseIntegralPay between", value1, value2, "isuseintegralpay");
            return (Criteria) this;
        }

        public Criteria andIsuseintegralpayNotBetween(Byte value1, Byte value2) {
            addCriterion("IsUseIntegralPay not between", value1, value2, "isuseintegralpay");
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