package com.chenyou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeClassExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public IncomeClassExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
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

        public Criteria andInIdIsNull() {
            addCriterion("in_id is null");
            return (Criteria) this;
        }

        public Criteria andInIdIsNotNull() {
            addCriterion("in_id is not null");
            return (Criteria) this;
        }

        public Criteria andInIdEqualTo(Integer value) {
            addCriterion("in_id =", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotEqualTo(Integer value) {
            addCriterion("in_id <>", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThan(Integer value) {
            addCriterion("in_id >", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_id >=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThan(Integer value) {
            addCriterion("in_id <", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThanOrEqualTo(Integer value) {
            addCriterion("in_id <=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdIn(List<Integer> values) {
            addCriterion("in_id in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotIn(List<Integer> values) {
            addCriterion("in_id not in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdBetween(Integer value1, Integer value2) {
            addCriterion("in_id between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("in_id not between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andPayApIsNull() {
            addCriterion("pay_ap is null");
            return (Criteria) this;
        }

        public Criteria andPayApIsNotNull() {
            addCriterion("pay_ap is not null");
            return (Criteria) this;
        }

        public Criteria andPayApEqualTo(Double value) {
            addCriterion("pay_ap =", value, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApNotEqualTo(Double value) {
            addCriterion("pay_ap <>", value, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApGreaterThan(Double value) {
            addCriterion("pay_ap >", value, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_ap >=", value, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApLessThan(Double value) {
            addCriterion("pay_ap <", value, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApLessThanOrEqualTo(Double value) {
            addCriterion("pay_ap <=", value, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApIn(List<Double> values) {
            addCriterion("pay_ap in", values, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApNotIn(List<Double> values) {
            addCriterion("pay_ap not in", values, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApBetween(Double value1, Double value2) {
            addCriterion("pay_ap between", value1, value2, "payAp");
            return (Criteria) this;
        }

        public Criteria andPayApNotBetween(Double value1, Double value2) {
            addCriterion("pay_ap not between", value1, value2, "payAp");
            return (Criteria) this;
        }

        public Criteria andAddApIsNull() {
            addCriterion("add_ap is null");
            return (Criteria) this;
        }

        public Criteria andAddApIsNotNull() {
            addCriterion("add_ap is not null");
            return (Criteria) this;
        }

        public Criteria andAddApEqualTo(Double value) {
            addCriterion("add_ap =", value, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApNotEqualTo(Double value) {
            addCriterion("add_ap <>", value, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApGreaterThan(Double value) {
            addCriterion("add_ap >", value, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApGreaterThanOrEqualTo(Double value) {
            addCriterion("add_ap >=", value, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApLessThan(Double value) {
            addCriterion("add_ap <", value, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApLessThanOrEqualTo(Double value) {
            addCriterion("add_ap <=", value, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApIn(List<Double> values) {
            addCriterion("add_ap in", values, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApNotIn(List<Double> values) {
            addCriterion("add_ap not in", values, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApBetween(Double value1, Double value2) {
            addCriterion("add_ap between", value1, value2, "addAp");
            return (Criteria) this;
        }

        public Criteria andAddApNotBetween(Double value1, Double value2) {
            addCriterion("add_ap not between", value1, value2, "addAp");
            return (Criteria) this;
        }

        public Criteria andDayIncomeIsNull() {
            addCriterion("day_income is null");
            return (Criteria) this;
        }

        public Criteria andDayIncomeIsNotNull() {
            addCriterion("day_income is not null");
            return (Criteria) this;
        }

        public Criteria andDayIncomeEqualTo(Integer value) {
            addCriterion("day_income =", value, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeNotEqualTo(Integer value) {
            addCriterion("day_income <>", value, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeGreaterThan(Integer value) {
            addCriterion("day_income >", value, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_income >=", value, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeLessThan(Integer value) {
            addCriterion("day_income <", value, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("day_income <=", value, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeIn(List<Integer> values) {
            addCriterion("day_income in", values, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeNotIn(List<Integer> values) {
            addCriterion("day_income not in", values, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeBetween(Integer value1, Integer value2) {
            addCriterion("day_income between", value1, value2, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("day_income not between", value1, value2, "dayIncome");
            return (Criteria) this;
        }

        public Criteria andDayPayrateIsNull() {
            addCriterion("day_payrate is null");
            return (Criteria) this;
        }

        public Criteria andDayPayrateIsNotNull() {
            addCriterion("day_payrate is not null");
            return (Criteria) this;
        }

        public Criteria andDayPayrateEqualTo(String value) {
            addCriterion("day_payrate =", value, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateNotEqualTo(String value) {
            addCriterion("day_payrate <>", value, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateGreaterThan(String value) {
            addCriterion("day_payrate >", value, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateGreaterThanOrEqualTo(String value) {
            addCriterion("day_payrate >=", value, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateLessThan(String value) {
            addCriterion("day_payrate <", value, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateLessThanOrEqualTo(String value) {
            addCriterion("day_payrate <=", value, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateLike(String value) {
            addCriterion("day_payrate like", value, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateNotLike(String value) {
            addCriterion("day_payrate not like", value, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateIn(List<String> values) {
            addCriterion("day_payrate in", values, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateNotIn(List<String> values) {
            addCriterion("day_payrate not in", values, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateBetween(String value1, String value2) {
            addCriterion("day_payrate between", value1, value2, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andDayPayrateNotBetween(String value1, String value2) {
            addCriterion("day_payrate not between", value1, value2, "dayPayrate");
            return (Criteria) this;
        }

        public Criteria andAddRateUserIsNull() {
            addCriterion("add_rate_user is null");
            return (Criteria) this;
        }

        public Criteria andAddRateUserIsNotNull() {
            addCriterion("add_rate_user is not null");
            return (Criteria) this;
        }

        public Criteria andAddRateUserEqualTo(Integer value) {
            addCriterion("add_rate_user =", value, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserNotEqualTo(Integer value) {
            addCriterion("add_rate_user <>", value, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserGreaterThan(Integer value) {
            addCriterion("add_rate_user >", value, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_rate_user >=", value, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserLessThan(Integer value) {
            addCriterion("add_rate_user <", value, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserLessThanOrEqualTo(Integer value) {
            addCriterion("add_rate_user <=", value, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserIn(List<Integer> values) {
            addCriterion("add_rate_user in", values, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserNotIn(List<Integer> values) {
            addCriterion("add_rate_user not in", values, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserBetween(Integer value1, Integer value2) {
            addCriterion("add_rate_user between", value1, value2, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andAddRateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("add_rate_user not between", value1, value2, "addRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserIsNull() {
            addCriterion("count_rate_user is null");
            return (Criteria) this;
        }

        public Criteria andCountRateUserIsNotNull() {
            addCriterion("count_rate_user is not null");
            return (Criteria) this;
        }

        public Criteria andCountRateUserEqualTo(Integer value) {
            addCriterion("count_rate_user =", value, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserNotEqualTo(Integer value) {
            addCriterion("count_rate_user <>", value, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserGreaterThan(Integer value) {
            addCriterion("count_rate_user >", value, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_rate_user >=", value, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserLessThan(Integer value) {
            addCriterion("count_rate_user <", value, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserLessThanOrEqualTo(Integer value) {
            addCriterion("count_rate_user <=", value, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserIn(List<Integer> values) {
            addCriterion("count_rate_user in", values, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserNotIn(List<Integer> values) {
            addCriterion("count_rate_user not in", values, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserBetween(Integer value1, Integer value2) {
            addCriterion("count_rate_user between", value1, value2, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andCountRateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("count_rate_user not between", value1, value2, "countRateUser");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Integer value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Integer value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Integer value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Integer value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Integer value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Integer> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Integer> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Integer value1, Integer value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeIsNull() {
            addCriterion("recorde_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeIsNotNull() {
            addCriterion("recorde_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeEqualTo(Date value) {
            addCriterion("recorde_time =", value, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeNotEqualTo(Date value) {
            addCriterion("recorde_time <>", value, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeGreaterThan(Date value) {
            addCriterion("recorde_time >", value, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recorde_time >=", value, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeLessThan(Date value) {
            addCriterion("recorde_time <", value, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeLessThanOrEqualTo(Date value) {
            addCriterion("recorde_time <=", value, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeIn(List<Date> values) {
            addCriterion("recorde_time in", values, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeNotIn(List<Date> values) {
            addCriterion("recorde_time not in", values, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeBetween(Date value1, Date value2) {
            addCriterion("recorde_time between", value1, value2, "recordeTime");
            return (Criteria) this;
        }

        public Criteria andRecordeTimeNotBetween(Date value1, Date value2) {
            addCriterion("recorde_time not between", value1, value2, "recordeTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_income_class
     *
     * @mbggenerated do_not_delete_during_merge Sat Sep 08 10:57:32 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_income_class
     *
     * @mbggenerated Sat Sep 08 10:57:32 CST 2018
     */
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