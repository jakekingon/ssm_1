package com.cn.hnust.pojo;

import java.util.ArrayList;
import java.util.List;

public class DbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbUserExample() {
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
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("usertype like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("usertype not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1IsNull() {
            addCriterion("remarkcode1 is null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1IsNotNull() {
            addCriterion("remarkcode1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1EqualTo(String value) {
            addCriterion("remarkcode1 =", value, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1NotEqualTo(String value) {
            addCriterion("remarkcode1 <>", value, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1GreaterThan(String value) {
            addCriterion("remarkcode1 >", value, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1GreaterThanOrEqualTo(String value) {
            addCriterion("remarkcode1 >=", value, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1LessThan(String value) {
            addCriterion("remarkcode1 <", value, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1LessThanOrEqualTo(String value) {
            addCriterion("remarkcode1 <=", value, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1Like(String value) {
            addCriterion("remarkcode1 like", value, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1NotLike(String value) {
            addCriterion("remarkcode1 not like", value, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1In(List<String> values) {
            addCriterion("remarkcode1 in", values, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1NotIn(List<String> values) {
            addCriterion("remarkcode1 not in", values, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1Between(String value1, String value2) {
            addCriterion("remarkcode1 between", value1, value2, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode1NotBetween(String value1, String value2) {
            addCriterion("remarkcode1 not between", value1, value2, "remarkcode1");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2IsNull() {
            addCriterion("remarkcode2 is null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2IsNotNull() {
            addCriterion("remarkcode2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2EqualTo(String value) {
            addCriterion("remarkcode2 =", value, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2NotEqualTo(String value) {
            addCriterion("remarkcode2 <>", value, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2GreaterThan(String value) {
            addCriterion("remarkcode2 >", value, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2GreaterThanOrEqualTo(String value) {
            addCriterion("remarkcode2 >=", value, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2LessThan(String value) {
            addCriterion("remarkcode2 <", value, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2LessThanOrEqualTo(String value) {
            addCriterion("remarkcode2 <=", value, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2Like(String value) {
            addCriterion("remarkcode2 like", value, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2NotLike(String value) {
            addCriterion("remarkcode2 not like", value, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2In(List<String> values) {
            addCriterion("remarkcode2 in", values, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2NotIn(List<String> values) {
            addCriterion("remarkcode2 not in", values, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2Between(String value1, String value2) {
            addCriterion("remarkcode2 between", value1, value2, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode2NotBetween(String value1, String value2) {
            addCriterion("remarkcode2 not between", value1, value2, "remarkcode2");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3IsNull() {
            addCriterion("remarkcode3 is null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3IsNotNull() {
            addCriterion("remarkcode3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3EqualTo(String value) {
            addCriterion("remarkcode3 =", value, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3NotEqualTo(String value) {
            addCriterion("remarkcode3 <>", value, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3GreaterThan(String value) {
            addCriterion("remarkcode3 >", value, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3GreaterThanOrEqualTo(String value) {
            addCriterion("remarkcode3 >=", value, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3LessThan(String value) {
            addCriterion("remarkcode3 <", value, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3LessThanOrEqualTo(String value) {
            addCriterion("remarkcode3 <=", value, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3Like(String value) {
            addCriterion("remarkcode3 like", value, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3NotLike(String value) {
            addCriterion("remarkcode3 not like", value, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3In(List<String> values) {
            addCriterion("remarkcode3 in", values, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3NotIn(List<String> values) {
            addCriterion("remarkcode3 not in", values, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3Between(String value1, String value2) {
            addCriterion("remarkcode3 between", value1, value2, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode3NotBetween(String value1, String value2) {
            addCriterion("remarkcode3 not between", value1, value2, "remarkcode3");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4IsNull() {
            addCriterion("remarkcode4 is null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4IsNotNull() {
            addCriterion("remarkcode4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4EqualTo(String value) {
            addCriterion("remarkcode4 =", value, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4NotEqualTo(String value) {
            addCriterion("remarkcode4 <>", value, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4GreaterThan(String value) {
            addCriterion("remarkcode4 >", value, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4GreaterThanOrEqualTo(String value) {
            addCriterion("remarkcode4 >=", value, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4LessThan(String value) {
            addCriterion("remarkcode4 <", value, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4LessThanOrEqualTo(String value) {
            addCriterion("remarkcode4 <=", value, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4Like(String value) {
            addCriterion("remarkcode4 like", value, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4NotLike(String value) {
            addCriterion("remarkcode4 not like", value, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4In(List<String> values) {
            addCriterion("remarkcode4 in", values, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4NotIn(List<String> values) {
            addCriterion("remarkcode4 not in", values, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4Between(String value1, String value2) {
            addCriterion("remarkcode4 between", value1, value2, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode4NotBetween(String value1, String value2) {
            addCriterion("remarkcode4 not between", value1, value2, "remarkcode4");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5IsNull() {
            addCriterion("remarkcode5 is null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5IsNotNull() {
            addCriterion("remarkcode5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5EqualTo(String value) {
            addCriterion("remarkcode5 =", value, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5NotEqualTo(String value) {
            addCriterion("remarkcode5 <>", value, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5GreaterThan(String value) {
            addCriterion("remarkcode5 >", value, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5GreaterThanOrEqualTo(String value) {
            addCriterion("remarkcode5 >=", value, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5LessThan(String value) {
            addCriterion("remarkcode5 <", value, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5LessThanOrEqualTo(String value) {
            addCriterion("remarkcode5 <=", value, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5Like(String value) {
            addCriterion("remarkcode5 like", value, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5NotLike(String value) {
            addCriterion("remarkcode5 not like", value, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5In(List<String> values) {
            addCriterion("remarkcode5 in", values, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5NotIn(List<String> values) {
            addCriterion("remarkcode5 not in", values, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5Between(String value1, String value2) {
            addCriterion("remarkcode5 between", value1, value2, "remarkcode5");
            return (Criteria) this;
        }

        public Criteria andRemarkcode5NotBetween(String value1, String value2) {
            addCriterion("remarkcode5 not between", value1, value2, "remarkcode5");
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