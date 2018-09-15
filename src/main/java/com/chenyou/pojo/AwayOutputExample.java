package com.chenyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class AwayOutputExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public AwayOutputExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
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
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
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

        public Criteria andAwayIdIsNull() {
            addCriterion("away_id is null");
            return (Criteria) this;
        }

        public Criteria andAwayIdIsNotNull() {
            addCriterion("away_id is not null");
            return (Criteria) this;
        }

        public Criteria andAwayIdEqualTo(Integer value) {
            addCriterion("away_id =", value, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdNotEqualTo(Integer value) {
            addCriterion("away_id <>", value, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdGreaterThan(Integer value) {
            addCriterion("away_id >", value, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("away_id >=", value, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdLessThan(Integer value) {
            addCriterion("away_id <", value, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdLessThanOrEqualTo(Integer value) {
            addCriterion("away_id <=", value, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdIn(List<Integer> values) {
            addCriterion("away_id in", values, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdNotIn(List<Integer> values) {
            addCriterion("away_id not in", values, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdBetween(Integer value1, Integer value2) {
            addCriterion("away_id between", value1, value2, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("away_id not between", value1, value2, "awayId");
            return (Criteria) this;
        }

        public Criteria andAwayOutputIsNull() {
            addCriterion("away_output is null");
            return (Criteria) this;
        }

        public Criteria andAwayOutputIsNotNull() {
            addCriterion("away_output is not null");
            return (Criteria) this;
        }

        public Criteria andAwayOutputEqualTo(String value) {
            addCriterion("away_output =", value, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputNotEqualTo(String value) {
            addCriterion("away_output <>", value, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputGreaterThan(String value) {
            addCriterion("away_output >", value, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputGreaterThanOrEqualTo(String value) {
            addCriterion("away_output >=", value, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputLessThan(String value) {
            addCriterion("away_output <", value, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputLessThanOrEqualTo(String value) {
            addCriterion("away_output <=", value, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputLike(String value) {
            addCriterion("away_output like", value, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputNotLike(String value) {
            addCriterion("away_output not like", value, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputIn(List<String> values) {
            addCriterion("away_output in", values, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputNotIn(List<String> values) {
            addCriterion("away_output not in", values, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputBetween(String value1, String value2) {
            addCriterion("away_output between", value1, value2, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andAwayOutputNotBetween(String value1, String value2) {
            addCriterion("away_output not between", value1, value2, "awayOutput");
            return (Criteria) this;
        }

        public Criteria andCountPlayerIsNull() {
            addCriterion("count_player is null");
            return (Criteria) this;
        }

        public Criteria andCountPlayerIsNotNull() {
            addCriterion("count_player is not null");
            return (Criteria) this;
        }

        public Criteria andCountPlayerEqualTo(Integer value) {
            addCriterion("count_player =", value, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerNotEqualTo(Integer value) {
            addCriterion("count_player <>", value, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerGreaterThan(Integer value) {
            addCriterion("count_player >", value, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_player >=", value, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerLessThan(Integer value) {
            addCriterion("count_player <", value, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerLessThanOrEqualTo(Integer value) {
            addCriterion("count_player <=", value, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerIn(List<Integer> values) {
            addCriterion("count_player in", values, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerNotIn(List<Integer> values) {
            addCriterion("count_player not in", values, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerBetween(Integer value1, Integer value2) {
            addCriterion("count_player between", value1, value2, "countPlayer");
            return (Criteria) this;
        }

        public Criteria andCountPlayerNotBetween(Integer value1, Integer value2) {
            addCriterion("count_player not between", value1, value2, "countPlayer");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_away_output
     *
     * @mbggenerated do_not_delete_during_merge Sat Sep 15 11:57:40 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_away_output
     *
     * @mbggenerated Sat Sep 15 11:57:40 CST 2018
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