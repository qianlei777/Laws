package com.kgc.laws.law.pojo;

import java.util.ArrayList;
import java.util.List;

public class LawsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawsExample() {
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

        public Criteria andLawsnameIsNull() {
            addCriterion("lawsname is null");
            return (Criteria) this;
        }

        public Criteria andLawsnameIsNotNull() {
            addCriterion("lawsname is not null");
            return (Criteria) this;
        }

        public Criteria andLawsnameEqualTo(String value) {
            addCriterion("lawsname =", value, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameNotEqualTo(String value) {
            addCriterion("lawsname <>", value, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameGreaterThan(String value) {
            addCriterion("lawsname >", value, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameGreaterThanOrEqualTo(String value) {
            addCriterion("lawsname >=", value, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameLessThan(String value) {
            addCriterion("lawsname <", value, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameLessThanOrEqualTo(String value) {
            addCriterion("lawsname <=", value, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameLike(String value) {
            addCriterion("lawsname like", value, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameNotLike(String value) {
            addCriterion("lawsname not like", value, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameIn(List<String> values) {
            addCriterion("lawsname in", values, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameNotIn(List<String> values) {
            addCriterion("lawsname not in", values, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameBetween(String value1, String value2) {
            addCriterion("lawsname between", value1, value2, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsnameNotBetween(String value1, String value2) {
            addCriterion("lawsname not between", value1, value2, "lawsname");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainIsNull() {
            addCriterion("lawsexlpain is null");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainIsNotNull() {
            addCriterion("lawsexlpain is not null");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainEqualTo(String value) {
            addCriterion("lawsexlpain =", value, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainNotEqualTo(String value) {
            addCriterion("lawsexlpain <>", value, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainGreaterThan(String value) {
            addCriterion("lawsexlpain >", value, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainGreaterThanOrEqualTo(String value) {
            addCriterion("lawsexlpain >=", value, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainLessThan(String value) {
            addCriterion("lawsexlpain <", value, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainLessThanOrEqualTo(String value) {
            addCriterion("lawsexlpain <=", value, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainLike(String value) {
            addCriterion("lawsexlpain like", value, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainNotLike(String value) {
            addCriterion("lawsexlpain not like", value, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainIn(List<String> values) {
            addCriterion("lawsexlpain in", values, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainNotIn(List<String> values) {
            addCriterion("lawsexlpain not in", values, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainBetween(String value1, String value2) {
            addCriterion("lawsexlpain between", value1, value2, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawsexlpainNotBetween(String value1, String value2) {
            addCriterion("lawsexlpain not between", value1, value2, "lawsexlpain");
            return (Criteria) this;
        }

        public Criteria andLawspictureIsNull() {
            addCriterion("lawspicture is null");
            return (Criteria) this;
        }

        public Criteria andLawspictureIsNotNull() {
            addCriterion("lawspicture is not null");
            return (Criteria) this;
        }

        public Criteria andLawspictureEqualTo(String value) {
            addCriterion("lawspicture =", value, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureNotEqualTo(String value) {
            addCriterion("lawspicture <>", value, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureGreaterThan(String value) {
            addCriterion("lawspicture >", value, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureGreaterThanOrEqualTo(String value) {
            addCriterion("lawspicture >=", value, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureLessThan(String value) {
            addCriterion("lawspicture <", value, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureLessThanOrEqualTo(String value) {
            addCriterion("lawspicture <=", value, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureLike(String value) {
            addCriterion("lawspicture like", value, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureNotLike(String value) {
            addCriterion("lawspicture not like", value, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureIn(List<String> values) {
            addCriterion("lawspicture in", values, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureNotIn(List<String> values) {
            addCriterion("lawspicture not in", values, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureBetween(String value1, String value2) {
            addCriterion("lawspicture between", value1, value2, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawspictureNotBetween(String value1, String value2) {
            addCriterion("lawspicture not between", value1, value2, "lawspicture");
            return (Criteria) this;
        }

        public Criteria andLawsshowIsNull() {
            addCriterion("lawsshow is null");
            return (Criteria) this;
        }

        public Criteria andLawsshowIsNotNull() {
            addCriterion("lawsshow is not null");
            return (Criteria) this;
        }

        public Criteria andLawsshowEqualTo(Integer value) {
            addCriterion("lawsshow =", value, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowNotEqualTo(Integer value) {
            addCriterion("lawsshow <>", value, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowGreaterThan(Integer value) {
            addCriterion("lawsshow >", value, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("lawsshow >=", value, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowLessThan(Integer value) {
            addCriterion("lawsshow <", value, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowLessThanOrEqualTo(Integer value) {
            addCriterion("lawsshow <=", value, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowIn(List<Integer> values) {
            addCriterion("lawsshow in", values, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowNotIn(List<Integer> values) {
            addCriterion("lawsshow not in", values, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowBetween(Integer value1, Integer value2) {
            addCriterion("lawsshow between", value1, value2, "lawsshow");
            return (Criteria) this;
        }

        public Criteria andLawsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("lawsshow not between", value1, value2, "lawsshow");
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