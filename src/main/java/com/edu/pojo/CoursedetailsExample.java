package com.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CoursedetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursedetailsExample() {
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

        public Criteria andHomeworkIsNull() {
            addCriterion("Homework is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkIsNotNull() {
            addCriterion("Homework is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkEqualTo(String value) {
            addCriterion("Homework =", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkNotEqualTo(String value) {
            addCriterion("Homework <>", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkGreaterThan(String value) {
            addCriterion("Homework >", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkGreaterThanOrEqualTo(String value) {
            addCriterion("Homework >=", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkLessThan(String value) {
            addCriterion("Homework <", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkLessThanOrEqualTo(String value) {
            addCriterion("Homework <=", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkLike(String value) {
            addCriterion("Homework like", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkNotLike(String value) {
            addCriterion("Homework not like", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkIn(List<String> values) {
            addCriterion("Homework in", values, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkNotIn(List<String> values) {
            addCriterion("Homework not in", values, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkBetween(String value1, String value2) {
            addCriterion("Homework between", value1, value2, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkNotBetween(String value1, String value2) {
            addCriterion("Homework not between", value1, value2, "homework");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNull() {
            addCriterion("VideoURL is null");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNotNull() {
            addCriterion("VideoURL is not null");
            return (Criteria) this;
        }

        public Criteria andVideourlEqualTo(String value) {
            addCriterion("VideoURL =", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotEqualTo(String value) {
            addCriterion("VideoURL <>", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThan(String value) {
            addCriterion("VideoURL >", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThanOrEqualTo(String value) {
            addCriterion("VideoURL >=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThan(String value) {
            addCriterion("VideoURL <", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThanOrEqualTo(String value) {
            addCriterion("VideoURL <=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLike(String value) {
            addCriterion("VideoURL like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotLike(String value) {
            addCriterion("VideoURL not like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlIn(List<String> values) {
            addCriterion("VideoURL in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotIn(List<String> values) {
            addCriterion("VideoURL not in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlBetween(String value1, String value2) {
            addCriterion("VideoURL between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotBetween(String value1, String value2) {
            addCriterion("VideoURL not between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andPpturlIsNull() {
            addCriterion("PPTURL is null");
            return (Criteria) this;
        }

        public Criteria andPpturlIsNotNull() {
            addCriterion("PPTURL is not null");
            return (Criteria) this;
        }

        public Criteria andPpturlEqualTo(String value) {
            addCriterion("PPTURL =", value, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlNotEqualTo(String value) {
            addCriterion("PPTURL <>", value, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlGreaterThan(String value) {
            addCriterion("PPTURL >", value, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlGreaterThanOrEqualTo(String value) {
            addCriterion("PPTURL >=", value, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlLessThan(String value) {
            addCriterion("PPTURL <", value, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlLessThanOrEqualTo(String value) {
            addCriterion("PPTURL <=", value, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlLike(String value) {
            addCriterion("PPTURL like", value, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlNotLike(String value) {
            addCriterion("PPTURL not like", value, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlIn(List<String> values) {
            addCriterion("PPTURL in", values, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlNotIn(List<String> values) {
            addCriterion("PPTURL not in", values, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlBetween(String value1, String value2) {
            addCriterion("PPTURL between", value1, value2, "ppturl");
            return (Criteria) this;
        }

        public Criteria andPpturlNotBetween(String value1, String value2) {
            addCriterion("PPTURL not between", value1, value2, "ppturl");
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