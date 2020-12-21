package com.kgc.laws.law.pojo;

import java.util.ArrayList;
import java.util.List;

public class PageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PageExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPagenameIsNull() {
            addCriterion("pagename is null");
            return (Criteria) this;
        }

        public Criteria andPagenameIsNotNull() {
            addCriterion("pagename is not null");
            return (Criteria) this;
        }

        public Criteria andPagenameEqualTo(String value) {
            addCriterion("pagename =", value, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameNotEqualTo(String value) {
            addCriterion("pagename <>", value, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameGreaterThan(String value) {
            addCriterion("pagename >", value, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameGreaterThanOrEqualTo(String value) {
            addCriterion("pagename >=", value, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameLessThan(String value) {
            addCriterion("pagename <", value, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameLessThanOrEqualTo(String value) {
            addCriterion("pagename <=", value, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameLike(String value) {
            addCriterion("pagename like", value, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameNotLike(String value) {
            addCriterion("pagename not like", value, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameIn(List<String> values) {
            addCriterion("pagename in", values, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameNotIn(List<String> values) {
            addCriterion("pagename not in", values, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameBetween(String value1, String value2) {
            addCriterion("pagename between", value1, value2, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagenameNotBetween(String value1, String value2) {
            addCriterion("pagename not between", value1, value2, "pagename");
            return (Criteria) this;
        }

        public Criteria andPagelevelIsNull() {
            addCriterion("pagelevel is null");
            return (Criteria) this;
        }

        public Criteria andPagelevelIsNotNull() {
            addCriterion("pagelevel is not null");
            return (Criteria) this;
        }

        public Criteria andPagelevelEqualTo(Integer value) {
            addCriterion("pagelevel =", value, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelNotEqualTo(Integer value) {
            addCriterion("pagelevel <>", value, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelGreaterThan(Integer value) {
            addCriterion("pagelevel >", value, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pagelevel >=", value, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelLessThan(Integer value) {
            addCriterion("pagelevel <", value, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelLessThanOrEqualTo(Integer value) {
            addCriterion("pagelevel <=", value, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelIn(List<Integer> values) {
            addCriterion("pagelevel in", values, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelNotIn(List<Integer> values) {
            addCriterion("pagelevel not in", values, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelBetween(Integer value1, Integer value2) {
            addCriterion("pagelevel between", value1, value2, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPagelevelNotBetween(Integer value1, Integer value2) {
            addCriterion("pagelevel not between", value1, value2, "pagelevel");
            return (Criteria) this;
        }

        public Criteria andPageparentIsNull() {
            addCriterion("pageparent is null");
            return (Criteria) this;
        }

        public Criteria andPageparentIsNotNull() {
            addCriterion("pageparent is not null");
            return (Criteria) this;
        }

        public Criteria andPageparentEqualTo(Integer value) {
            addCriterion("pageparent =", value, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentNotEqualTo(Integer value) {
            addCriterion("pageparent <>", value, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentGreaterThan(Integer value) {
            addCriterion("pageparent >", value, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageparent >=", value, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentLessThan(Integer value) {
            addCriterion("pageparent <", value, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentLessThanOrEqualTo(Integer value) {
            addCriterion("pageparent <=", value, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentIn(List<Integer> values) {
            addCriterion("pageparent in", values, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentNotIn(List<Integer> values) {
            addCriterion("pageparent not in", values, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentBetween(Integer value1, Integer value2) {
            addCriterion("pageparent between", value1, value2, "pageparent");
            return (Criteria) this;
        }

        public Criteria andPageparentNotBetween(Integer value1, Integer value2) {
            addCriterion("pageparent not between", value1, value2, "pageparent");
            return (Criteria) this;
        }

        public Criteria andLawsidIsNull() {
            addCriterion("lawsid is null");
            return (Criteria) this;
        }

        public Criteria andLawsidIsNotNull() {
            addCriterion("lawsid is not null");
            return (Criteria) this;
        }

        public Criteria andLawsidEqualTo(Integer value) {
            addCriterion("lawsid =", value, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidNotEqualTo(Integer value) {
            addCriterion("lawsid <>", value, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidGreaterThan(Integer value) {
            addCriterion("lawsid >", value, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lawsid >=", value, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidLessThan(Integer value) {
            addCriterion("lawsid <", value, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidLessThanOrEqualTo(Integer value) {
            addCriterion("lawsid <=", value, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidIn(List<Integer> values) {
            addCriterion("lawsid in", values, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidNotIn(List<Integer> values) {
            addCriterion("lawsid not in", values, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidBetween(Integer value1, Integer value2) {
            addCriterion("lawsid between", value1, value2, "lawsid");
            return (Criteria) this;
        }

        public Criteria andLawsidNotBetween(Integer value1, Integer value2) {
            addCriterion("lawsid not between", value1, value2, "lawsid");
            return (Criteria) this;
        }

        public Criteria andPagesortIsNull() {
            addCriterion("pagesort is null");
            return (Criteria) this;
        }

        public Criteria andPagesortIsNotNull() {
            addCriterion("pagesort is not null");
            return (Criteria) this;
        }

        public Criteria andPagesortEqualTo(Integer value) {
            addCriterion("pagesort =", value, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortNotEqualTo(Integer value) {
            addCriterion("pagesort <>", value, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortGreaterThan(Integer value) {
            addCriterion("pagesort >", value, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortGreaterThanOrEqualTo(Integer value) {
            addCriterion("pagesort >=", value, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortLessThan(Integer value) {
            addCriterion("pagesort <", value, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortLessThanOrEqualTo(Integer value) {
            addCriterion("pagesort <=", value, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortIn(List<Integer> values) {
            addCriterion("pagesort in", values, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortNotIn(List<Integer> values) {
            addCriterion("pagesort not in", values, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortBetween(Integer value1, Integer value2) {
            addCriterion("pagesort between", value1, value2, "pagesort");
            return (Criteria) this;
        }

        public Criteria andPagesortNotBetween(Integer value1, Integer value2) {
            addCriterion("pagesort not between", value1, value2, "pagesort");
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