package com.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseselectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseselectExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("CourseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("CourseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("CourseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("CourseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("CourseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("CourseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("CourseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("CourseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("CourseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("CourseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("ClassId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("ClassId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("ClassId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("ClassId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("ClassId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("ClassId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("ClassId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("ClassId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("ClassId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNull() {
            addCriterion("Schedule is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNotNull() {
            addCriterion("Schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEqualTo(Integer value) {
            addCriterion("Schedule =", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotEqualTo(Integer value) {
            addCriterion("Schedule <>", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThan(Integer value) {
            addCriterion("Schedule >", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Schedule >=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThan(Integer value) {
            addCriterion("Schedule <", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThanOrEqualTo(Integer value) {
            addCriterion("Schedule <=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleIn(List<Integer> values) {
            addCriterion("Schedule in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotIn(List<Integer> values) {
            addCriterion("Schedule not in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleBetween(Integer value1, Integer value2) {
            addCriterion("Schedule between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotBetween(Integer value1, Integer value2) {
            addCriterion("Schedule not between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andMark1IsNull() {
            addCriterion("Mark1 is null");
            return (Criteria) this;
        }

        public Criteria andMark1IsNotNull() {
            addCriterion("Mark1 is not null");
            return (Criteria) this;
        }

        public Criteria andMark1EqualTo(Integer value) {
            addCriterion("Mark1 =", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotEqualTo(Integer value) {
            addCriterion("Mark1 <>", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1GreaterThan(Integer value) {
            addCriterion("Mark1 >", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1GreaterThanOrEqualTo(Integer value) {
            addCriterion("Mark1 >=", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1LessThan(Integer value) {
            addCriterion("Mark1 <", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1LessThanOrEqualTo(Integer value) {
            addCriterion("Mark1 <=", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1In(List<Integer> values) {
            addCriterion("Mark1 in", values, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotIn(List<Integer> values) {
            addCriterion("Mark1 not in", values, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1Between(Integer value1, Integer value2) {
            addCriterion("Mark1 between", value1, value2, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotBetween(Integer value1, Integer value2) {
            addCriterion("Mark1 not between", value1, value2, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark2IsNull() {
            addCriterion("Mark2 is null");
            return (Criteria) this;
        }

        public Criteria andMark2IsNotNull() {
            addCriterion("Mark2 is not null");
            return (Criteria) this;
        }

        public Criteria andMark2EqualTo(Integer value) {
            addCriterion("Mark2 =", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2NotEqualTo(Integer value) {
            addCriterion("Mark2 <>", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2GreaterThan(Integer value) {
            addCriterion("Mark2 >", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2GreaterThanOrEqualTo(Integer value) {
            addCriterion("Mark2 >=", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2LessThan(Integer value) {
            addCriterion("Mark2 <", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2LessThanOrEqualTo(Integer value) {
            addCriterion("Mark2 <=", value, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2In(List<Integer> values) {
            addCriterion("Mark2 in", values, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2NotIn(List<Integer> values) {
            addCriterion("Mark2 not in", values, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2Between(Integer value1, Integer value2) {
            addCriterion("Mark2 between", value1, value2, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark2NotBetween(Integer value1, Integer value2) {
            addCriterion("Mark2 not between", value1, value2, "mark2");
            return (Criteria) this;
        }

        public Criteria andMark3IsNull() {
            addCriterion("Mark3 is null");
            return (Criteria) this;
        }

        public Criteria andMark3IsNotNull() {
            addCriterion("Mark3 is not null");
            return (Criteria) this;
        }

        public Criteria andMark3EqualTo(Integer value) {
            addCriterion("Mark3 =", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3NotEqualTo(Integer value) {
            addCriterion("Mark3 <>", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3GreaterThan(Integer value) {
            addCriterion("Mark3 >", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3GreaterThanOrEqualTo(Integer value) {
            addCriterion("Mark3 >=", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3LessThan(Integer value) {
            addCriterion("Mark3 <", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3LessThanOrEqualTo(Integer value) {
            addCriterion("Mark3 <=", value, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3In(List<Integer> values) {
            addCriterion("Mark3 in", values, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3NotIn(List<Integer> values) {
            addCriterion("Mark3 not in", values, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3Between(Integer value1, Integer value2) {
            addCriterion("Mark3 between", value1, value2, "mark3");
            return (Criteria) this;
        }

        public Criteria andMark3NotBetween(Integer value1, Integer value2) {
            addCriterion("Mark3 not between", value1, value2, "mark3");
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