package com.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("MessageId is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("MessageId is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("MessageId =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("MessageId <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("MessageId >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MessageId >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("MessageId <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("MessageId <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("MessageId in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("MessageId not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("MessageId between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("MessageId not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andFromidIsNull() {
            addCriterion("FromId is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("FromId is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(Integer value) {
            addCriterion("FromId =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(Integer value) {
            addCriterion("FromId <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(Integer value) {
            addCriterion("FromId >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FromId >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(Integer value) {
            addCriterion("FromId <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(Integer value) {
            addCriterion("FromId <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<Integer> values) {
            addCriterion("FromId in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<Integer> values) {
            addCriterion("FromId not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(Integer value1, Integer value2) {
            addCriterion("FromId between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(Integer value1, Integer value2) {
            addCriterion("FromId not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andToidIsNull() {
            addCriterion("ToId is null");
            return (Criteria) this;
        }

        public Criteria andToidIsNotNull() {
            addCriterion("ToId is not null");
            return (Criteria) this;
        }

        public Criteria andToidEqualTo(Integer value) {
            addCriterion("ToId =", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotEqualTo(Integer value) {
            addCriterion("ToId <>", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThan(Integer value) {
            addCriterion("ToId >", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ToId >=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThan(Integer value) {
            addCriterion("ToId <", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThanOrEqualTo(Integer value) {
            addCriterion("ToId <=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidIn(List<Integer> values) {
            addCriterion("ToId in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotIn(List<Integer> values) {
            addCriterion("ToId not in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidBetween(Integer value1, Integer value2) {
            addCriterion("ToId between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotBetween(Integer value1, Integer value2) {
            addCriterion("ToId not between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andColumn5IsNull() {
            addCriterion("Column_5 is null");
            return (Criteria) this;
        }

        public Criteria andColumn5IsNotNull() {
            addCriterion("Column_5 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn5EqualTo(Date value) {
            addCriterion("Column_5 =", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotEqualTo(Date value) {
            addCriterion("Column_5 <>", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5GreaterThan(Date value) {
            addCriterion("Column_5 >", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5GreaterThanOrEqualTo(Date value) {
            addCriterion("Column_5 >=", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5LessThan(Date value) {
            addCriterion("Column_5 <", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5LessThanOrEqualTo(Date value) {
            addCriterion("Column_5 <=", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5In(List<Date> values) {
            addCriterion("Column_5 in", values, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotIn(List<Date> values) {
            addCriterion("Column_5 not in", values, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5Between(Date value1, Date value2) {
            addCriterion("Column_5 between", value1, value2, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotBetween(Date value1, Date value2) {
            addCriterion("Column_5 not between", value1, value2, "column5");
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