package com.kgc.laws.law.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClauseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClauseExample() {
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

        public Criteria andLawidIsNull() {
            addCriterion("lawid is null");
            return (Criteria) this;
        }

        public Criteria andLawidIsNotNull() {
            addCriterion("lawid is not null");
            return (Criteria) this;
        }

        public Criteria andLawidEqualTo(Integer value) {
            addCriterion("lawid =", value, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidNotEqualTo(Integer value) {
            addCriterion("lawid <>", value, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidGreaterThan(Integer value) {
            addCriterion("lawid >", value, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lawid >=", value, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidLessThan(Integer value) {
            addCriterion("lawid <", value, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidLessThanOrEqualTo(Integer value) {
            addCriterion("lawid <=", value, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidIn(List<Integer> values) {
            addCriterion("lawid in", values, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidNotIn(List<Integer> values) {
            addCriterion("lawid not in", values, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidBetween(Integer value1, Integer value2) {
            addCriterion("lawid between", value1, value2, "lawid");
            return (Criteria) this;
        }

        public Criteria andLawidNotBetween(Integer value1, Integer value2) {
            addCriterion("lawid not between", value1, value2, "lawid");
            return (Criteria) this;
        }

        public Criteria andPageidIsNull() {
            addCriterion("pageid is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("pageid is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(Integer value) {
            addCriterion("pageid =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(Integer value) {
            addCriterion("pageid <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(Integer value) {
            addCriterion("pageid >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageid >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(Integer value) {
            addCriterion("pageid <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(Integer value) {
            addCriterion("pageid <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<Integer> values) {
            addCriterion("pageid in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<Integer> values) {
            addCriterion("pageid not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(Integer value1, Integer value2) {
            addCriterion("pageid between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(Integer value1, Integer value2) {
            addCriterion("pageid not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andClauseidIsNull() {
            addCriterion("clauseid is null");
            return (Criteria) this;
        }

        public Criteria andClauseidIsNotNull() {
            addCriterion("clauseid is not null");
            return (Criteria) this;
        }

        public Criteria andClauseidEqualTo(String value) {
            addCriterion("clauseid =", value, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidNotEqualTo(String value) {
            addCriterion("clauseid <>", value, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidGreaterThan(String value) {
            addCriterion("clauseid >", value, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidGreaterThanOrEqualTo(String value) {
            addCriterion("clauseid >=", value, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidLessThan(String value) {
            addCriterion("clauseid <", value, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidLessThanOrEqualTo(String value) {
            addCriterion("clauseid <=", value, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidLike(String value) {
            addCriterion("clauseid like", value, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidNotLike(String value) {
            addCriterion("clauseid not like", value, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidIn(List<String> values) {
            addCriterion("clauseid in", values, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidNotIn(List<String> values) {
            addCriterion("clauseid not in", values, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidBetween(String value1, String value2) {
            addCriterion("clauseid between", value1, value2, "clauseid");
            return (Criteria) this;
        }

        public Criteria andClauseidNotBetween(String value1, String value2) {
            addCriterion("clauseid not between", value1, value2, "clauseid");
            return (Criteria) this;
        }

        public Criteria andLawstypeIsNull() {
            addCriterion("lawstype is null");
            return (Criteria) this;
        }

        public Criteria andLawstypeIsNotNull() {
            addCriterion("lawstype is not null");
            return (Criteria) this;
        }

        public Criteria andLawstypeEqualTo(String value) {
            addCriterion("lawstype =", value, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeNotEqualTo(String value) {
            addCriterion("lawstype <>", value, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeGreaterThan(String value) {
            addCriterion("lawstype >", value, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeGreaterThanOrEqualTo(String value) {
            addCriterion("lawstype >=", value, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeLessThan(String value) {
            addCriterion("lawstype <", value, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeLessThanOrEqualTo(String value) {
            addCriterion("lawstype <=", value, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeLike(String value) {
            addCriterion("lawstype like", value, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeNotLike(String value) {
            addCriterion("lawstype not like", value, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeIn(List<String> values) {
            addCriterion("lawstype in", values, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeNotIn(List<String> values) {
            addCriterion("lawstype not in", values, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeBetween(String value1, String value2) {
            addCriterion("lawstype between", value1, value2, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawstypeNotBetween(String value1, String value2) {
            addCriterion("lawstype not between", value1, value2, "lawstype");
            return (Criteria) this;
        }

        public Criteria andLawsversionIsNull() {
            addCriterion("lawsversion is null");
            return (Criteria) this;
        }

        public Criteria andLawsversionIsNotNull() {
            addCriterion("lawsversion is not null");
            return (Criteria) this;
        }

        public Criteria andLawsversionEqualTo(String value) {
            addCriterion("lawsversion =", value, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionNotEqualTo(String value) {
            addCriterion("lawsversion <>", value, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionGreaterThan(String value) {
            addCriterion("lawsversion >", value, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionGreaterThanOrEqualTo(String value) {
            addCriterion("lawsversion >=", value, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionLessThan(String value) {
            addCriterion("lawsversion <", value, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionLessThanOrEqualTo(String value) {
            addCriterion("lawsversion <=", value, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionLike(String value) {
            addCriterion("lawsversion like", value, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionNotLike(String value) {
            addCriterion("lawsversion not like", value, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionIn(List<String> values) {
            addCriterion("lawsversion in", values, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionNotIn(List<String> values) {
            addCriterion("lawsversion not in", values, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionBetween(String value1, String value2) {
            addCriterion("lawsversion between", value1, value2, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andLawsversionNotBetween(String value1, String value2) {
            addCriterion("lawsversion not between", value1, value2, "lawsversion");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCcontentIsNull() {
            addCriterion("ccontent is null");
            return (Criteria) this;
        }

        public Criteria andCcontentIsNotNull() {
            addCriterion("ccontent is not null");
            return (Criteria) this;
        }

        public Criteria andCcontentEqualTo(String value) {
            addCriterion("ccontent =", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotEqualTo(String value) {
            addCriterion("ccontent <>", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentGreaterThan(String value) {
            addCriterion("ccontent >", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ccontent >=", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLessThan(String value) {
            addCriterion("ccontent <", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLessThanOrEqualTo(String value) {
            addCriterion("ccontent <=", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLike(String value) {
            addCriterion("ccontent like", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotLike(String value) {
            addCriterion("ccontent not like", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentIn(List<String> values) {
            addCriterion("ccontent in", values, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotIn(List<String> values) {
            addCriterion("ccontent not in", values, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentBetween(String value1, String value2) {
            addCriterion("ccontent between", value1, value2, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotBetween(String value1, String value2) {
            addCriterion("ccontent not between", value1, value2, "ccontent");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
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