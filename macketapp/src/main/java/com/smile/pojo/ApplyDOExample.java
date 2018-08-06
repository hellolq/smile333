package com.smile.pojo;

import java.util.ArrayList;
import java.util.List;

public class ApplyDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyDOExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("IDNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("IDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("IDNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("IDNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("IDNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("IDNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("IDNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("IDNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("IDNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("IDNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("IDNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("IDNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("IDNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("Flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNull() {
            addCriterion("BankType is null");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNotNull() {
            addCriterion("BankType is not null");
            return (Criteria) this;
        }

        public Criteria andBanktypeEqualTo(Integer value) {
            addCriterion("BankType =", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotEqualTo(Integer value) {
            addCriterion("BankType <>", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThan(Integer value) {
            addCriterion("BankType >", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BankType >=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThan(Integer value) {
            addCriterion("BankType <", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThanOrEqualTo(Integer value) {
            addCriterion("BankType <=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeIn(List<Integer> values) {
            addCriterion("BankType in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotIn(List<Integer> values) {
            addCriterion("BankType not in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeBetween(Integer value1, Integer value2) {
            addCriterion("BankType between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BankType not between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIsNull() {
            addCriterion("BankCardNo is null");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIsNotNull() {
            addCriterion("BankCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardnoEqualTo(String value) {
            addCriterion("BankCardNo =", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotEqualTo(String value) {
            addCriterion("BankCardNo <>", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoGreaterThan(String value) {
            addCriterion("BankCardNo >", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("BankCardNo >=", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLessThan(String value) {
            addCriterion("BankCardNo <", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLessThanOrEqualTo(String value) {
            addCriterion("BankCardNo <=", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLike(String value) {
            addCriterion("BankCardNo like", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotLike(String value) {
            addCriterion("BankCardNo not like", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIn(List<String> values) {
            addCriterion("BankCardNo in", values, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotIn(List<String> values) {
            addCriterion("BankCardNo not in", values, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoBetween(String value1, String value2) {
            addCriterion("BankCardNo between", value1, value2, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotBetween(String value1, String value2) {
            addCriterion("BankCardNo not between", value1, value2, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameIsNull() {
            addCriterion("BankCardUserName is null");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameIsNotNull() {
            addCriterion("BankCardUserName is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameEqualTo(String value) {
            addCriterion("BankCardUserName =", value, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameNotEqualTo(String value) {
            addCriterion("BankCardUserName <>", value, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameGreaterThan(String value) {
            addCriterion("BankCardUserName >", value, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameGreaterThanOrEqualTo(String value) {
            addCriterion("BankCardUserName >=", value, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameLessThan(String value) {
            addCriterion("BankCardUserName <", value, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameLessThanOrEqualTo(String value) {
            addCriterion("BankCardUserName <=", value, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameLike(String value) {
            addCriterion("BankCardUserName like", value, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameNotLike(String value) {
            addCriterion("BankCardUserName not like", value, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameIn(List<String> values) {
            addCriterion("BankCardUserName in", values, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameNotIn(List<String> values) {
            addCriterion("BankCardUserName not in", values, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameBetween(String value1, String value2) {
            addCriterion("BankCardUserName between", value1, value2, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andBankcardusernameNotBetween(String value1, String value2) {
            addCriterion("BankCardUserName not between", value1, value2, "bankcardusername");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNull() {
            addCriterion("IsChecked is null");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNotNull() {
            addCriterion("IsChecked is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckedEqualTo(Integer value) {
            addCriterion("IsChecked =", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotEqualTo(Integer value) {
            addCriterion("IsChecked <>", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThan(Integer value) {
            addCriterion("IsChecked >", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsChecked >=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThan(Integer value) {
            addCriterion("IsChecked <", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThanOrEqualTo(Integer value) {
            addCriterion("IsChecked <=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedIn(List<Integer> values) {
            addCriterion("IsChecked in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotIn(List<Integer> values) {
            addCriterion("IsChecked not in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedBetween(Integer value1, Integer value2) {
            addCriterion("IsChecked between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsChecked not between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIfsignIsNull() {
            addCriterion("Ifsign is null");
            return (Criteria) this;
        }

        public Criteria andIfsignIsNotNull() {
            addCriterion("Ifsign is not null");
            return (Criteria) this;
        }

        public Criteria andIfsignEqualTo(Byte value) {
            addCriterion("Ifsign =", value, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignNotEqualTo(Byte value) {
            addCriterion("Ifsign <>", value, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignGreaterThan(Byte value) {
            addCriterion("Ifsign >", value, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignGreaterThanOrEqualTo(Byte value) {
            addCriterion("Ifsign >=", value, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignLessThan(Byte value) {
            addCriterion("Ifsign <", value, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignLessThanOrEqualTo(Byte value) {
            addCriterion("Ifsign <=", value, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignIn(List<Byte> values) {
            addCriterion("Ifsign in", values, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignNotIn(List<Byte> values) {
            addCriterion("Ifsign not in", values, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignBetween(Byte value1, Byte value2) {
            addCriterion("Ifsign between", value1, value2, "ifsign");
            return (Criteria) this;
        }

        public Criteria andIfsignNotBetween(Byte value1, Byte value2) {
            addCriterion("Ifsign not between", value1, value2, "ifsign");
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