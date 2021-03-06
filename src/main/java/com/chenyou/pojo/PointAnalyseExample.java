package com.chenyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class PointAnalyseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public PointAnalyseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
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
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
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

        public Criteria andChargingIdIsNull() {
            addCriterion("charging_id is null");
            return (Criteria) this;
        }

        public Criteria andChargingIdIsNotNull() {
            addCriterion("charging_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargingIdEqualTo(Integer value) {
            addCriterion("charging_id =", value, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdNotEqualTo(Integer value) {
            addCriterion("charging_id <>", value, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdGreaterThan(Integer value) {
            addCriterion("charging_id >", value, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_id >=", value, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdLessThan(Integer value) {
            addCriterion("charging_id <", value, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdLessThanOrEqualTo(Integer value) {
            addCriterion("charging_id <=", value, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdIn(List<Integer> values) {
            addCriterion("charging_id in", values, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdNotIn(List<Integer> values) {
            addCriterion("charging_id not in", values, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdBetween(Integer value1, Integer value2) {
            addCriterion("charging_id between", value1, value2, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_id not between", value1, value2, "chargingId");
            return (Criteria) this;
        }

        public Criteria andChargingTimeIsNull() {
            addCriterion("charging_time is null");
            return (Criteria) this;
        }

        public Criteria andChargingTimeIsNotNull() {
            addCriterion("charging_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargingTimeEqualTo(String value) {
            addCriterion("charging_time =", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeNotEqualTo(String value) {
            addCriterion("charging_time <>", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeGreaterThan(String value) {
            addCriterion("charging_time >", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("charging_time >=", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeLessThan(String value) {
            addCriterion("charging_time <", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeLessThanOrEqualTo(String value) {
            addCriterion("charging_time <=", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeLike(String value) {
            addCriterion("charging_time like", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeNotLike(String value) {
            addCriterion("charging_time not like", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeIn(List<String> values) {
            addCriterion("charging_time in", values, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeNotIn(List<String> values) {
            addCriterion("charging_time not in", values, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeBetween(String value1, String value2) {
            addCriterion("charging_time between", value1, value2, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeNotBetween(String value1, String value2) {
            addCriterion("charging_time not between", value1, value2, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserIsNull() {
            addCriterion("buy_num_user is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserIsNotNull() {
            addCriterion("buy_num_user is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserEqualTo(Integer value) {
            addCriterion("buy_num_user =", value, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserNotEqualTo(Integer value) {
            addCriterion("buy_num_user <>", value, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserGreaterThan(Integer value) {
            addCriterion("buy_num_user >", value, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_num_user >=", value, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserLessThan(Integer value) {
            addCriterion("buy_num_user <", value, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserLessThanOrEqualTo(Integer value) {
            addCriterion("buy_num_user <=", value, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserIn(List<Integer> values) {
            addCriterion("buy_num_user in", values, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserNotIn(List<Integer> values) {
            addCriterion("buy_num_user not in", values, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserBetween(Integer value1, Integer value2) {
            addCriterion("buy_num_user between", value1, value2, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andBuyNumUserNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_num_user not between", value1, value2, "buyNumUser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserIsNull() {
            addCriterion("recharge_first_buyuser is null");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserIsNotNull() {
            addCriterion("recharge_first_buyuser is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserEqualTo(Integer value) {
            addCriterion("recharge_first_buyuser =", value, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserNotEqualTo(Integer value) {
            addCriterion("recharge_first_buyuser <>", value, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserGreaterThan(Integer value) {
            addCriterion("recharge_first_buyuser >", value, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_first_buyuser >=", value, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserLessThan(Integer value) {
            addCriterion("recharge_first_buyuser <", value, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_first_buyuser <=", value, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserIn(List<Integer> values) {
            addCriterion("recharge_first_buyuser in", values, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserNotIn(List<Integer> values) {
            addCriterion("recharge_first_buyuser not in", values, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserBetween(Integer value1, Integer value2) {
            addCriterion("recharge_first_buyuser between", value1, value2, "rechargeFirstBuyuser");
            return (Criteria) this;
        }

        public Criteria andRechargeFirstBuyuserNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_first_buyuser not between", value1, value2, "rechargeFirstBuyuser");
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

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNull() {
            addCriterion("show_time is null");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNotNull() {
            addCriterion("show_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowTimeEqualTo(String value) {
            addCriterion("show_time =", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotEqualTo(String value) {
            addCriterion("show_time <>", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThan(String value) {
            addCriterion("show_time >", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThanOrEqualTo(String value) {
            addCriterion("show_time >=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThan(String value) {
            addCriterion("show_time <", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThanOrEqualTo(String value) {
            addCriterion("show_time <=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLike(String value) {
            addCriterion("show_time like", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotLike(String value) {
            addCriterion("show_time not like", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeIn(List<String> values) {
            addCriterion("show_time in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotIn(List<String> values) {
            addCriterion("show_time not in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeBetween(String value1, String value2) {
            addCriterion("show_time between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotBetween(String value1, String value2) {
            addCriterion("show_time not between", value1, value2, "showTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_point_analyse
     *
     * @mbggenerated do_not_delete_during_merge Fri Nov 16 17:02:40 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_point_analyse
     *
     * @mbggenerated Fri Nov 16 17:02:40 CST 2018
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