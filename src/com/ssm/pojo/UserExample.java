package com.ssm.pojo;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class UserExample {

	protected String orderByClause;

	protected List<Criteria> oredCriteria;

	protected boolean distinct;

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
	
	    public Criteria andNameIsNull() {
	        addCriterion("name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameIsNotNull() {
	        addCriterion("name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameEqualTo(String value) {
	        addCriterion("name =", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotEqualTo(String value) {
	        addCriterion("name <>", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameGreaterThan(String value) {
	        addCriterion("name >", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameGreaterThanOrEqualTo(String value) {
	        addCriterion("name >=", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLessThan(String value) {
	        addCriterion("name <", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLessThanOrEqualTo(String value) {
	        addCriterion("name <=", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameLike(String value) {
	        addCriterion("name like", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotLike(String value) {
	        addCriterion("name not like", value, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameIn(List<String> values) {
	        addCriterion("name in", values, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotIn(List<String> values) {
	        addCriterion("name not in", values, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameBetween(String value1, String value2) {
	        addCriterion("name between", value1, value2, "name");
	        return (Criteria) this;
	    }
	
	    public Criteria andNameNotBetween(String value1, String value2) {
	        addCriterion("name not between", value1, value2, "name");
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
	
	    public Criteria andPhoneIsNull() {
	        addCriterion("phone is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneIsNotNull() {
	        addCriterion("phone is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneEqualTo(String value) {
	        addCriterion("phone =", value, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNotEqualTo(String value) {
	        addCriterion("phone <>", value, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneGreaterThan(String value) {
	        addCriterion("phone >", value, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneGreaterThanOrEqualTo(String value) {
	        addCriterion("phone >=", value, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneLessThan(String value) {
	        addCriterion("phone <", value, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneLessThanOrEqualTo(String value) {
	        addCriterion("phone <=", value, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneLike(String value) {
	        addCriterion("phone like", value, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNotLike(String value) {
	        addCriterion("phone not like", value, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneIn(List<String> values) {
	        addCriterion("phone in", values, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNotIn(List<String> values) {
	        addCriterion("phone not in", values, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneBetween(String value1, String value2) {
	        addCriterion("phone between", value1, value2, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andPhoneNotBetween(String value1, String value2) {
	        addCriterion("phone not between", value1, value2, "phone");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailAIsNull() {
	        addCriterion("Email_a is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailAIsNotNull() {
	        addCriterion("Email_a is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailAEqualTo(String value) {
	        addCriterion("Email_a =", value, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailANotEqualTo(String value) {
	        addCriterion("Email_a <>", value, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailAGreaterThan(String value) {
	        addCriterion("Email_a >", value, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailAGreaterThanOrEqualTo(String value) {
	        addCriterion("Email_a >=", value, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailALessThan(String value) {
	        addCriterion("Email_a <", value, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailALessThanOrEqualTo(String value) {
	        addCriterion("Email_a <=", value, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailALike(String value) {
	        addCriterion("Email_a like", value, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailANotLike(String value) {
	        addCriterion("Email_a not like", value, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailAIn(List<String> values) {
	        addCriterion("Email_a in", values, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailANotIn(List<String> values) {
	        addCriterion("Email_a not in", values, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailABetween(String value1, String value2) {
	        addCriterion("Email_a between", value1, value2, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andEmailANotBetween(String value1, String value2) {
	        addCriterion("Email_a not between", value1, value2, "emailA");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeIsNull() {
	        addCriterion("k_time is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeIsNotNull() {
	        addCriterion("k_time is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeEqualTo(Date value) {
	        addCriterion("k_time =", value, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeNotEqualTo(Date value) {
	        addCriterion("k_time <>", value, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeGreaterThan(Date value) {
	        addCriterion("k_time >", value, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeGreaterThanOrEqualTo(Date value) {
	        addCriterion("k_time >=", value, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeLessThan(Date value) {
	        addCriterion("k_time <", value, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeLessThanOrEqualTo(Date value) {
	        addCriterion("k_time <=", value, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeIn(List<Date> values) {
	        addCriterion("k_time in", values, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeNotIn(List<Date> values) {
	        addCriterion("k_time not in", values, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeBetween(Date value1, Date value2) {
	        addCriterion("k_time between", value1, value2, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andKTimeNotBetween(Date value1, Date value2) {
	        addCriterion("k_time not between", value1, value2, "kTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorAIsNull() {
	        addCriterion("Administrator_a is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorAIsNotNull() {
	        addCriterion("Administrator_a is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorAEqualTo(String value) {
	        addCriterion("Administrator_a =", value, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorANotEqualTo(String value) {
	        addCriterion("Administrator_a <>", value, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorAGreaterThan(String value) {
	        addCriterion("Administrator_a >", value, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorAGreaterThanOrEqualTo(String value) {
	        addCriterion("Administrator_a >=", value, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorALessThan(String value) {
	        addCriterion("Administrator_a <", value, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorALessThanOrEqualTo(String value) {
	        addCriterion("Administrator_a <=", value, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorALike(String value) {
	        addCriterion("Administrator_a like", value, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorANotLike(String value) {
	        addCriterion("Administrator_a not like", value, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorAIn(List<String> values) {
	        addCriterion("Administrator_a in", values, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorANotIn(List<String> values) {
	        addCriterion("Administrator_a not in", values, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorABetween(String value1, String value2) {
	        addCriterion("Administrator_a between", value1, value2, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andAdministratorANotBetween(String value1, String value2) {
	        addCriterion("Administrator_a not between", value1, value2, "administratorA");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateIsNull() {
	        addCriterion("k_state is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateIsNotNull() {
	        addCriterion("k_state is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateEqualTo(Byte value) {
	        addCriterion("k_state =", value, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateNotEqualTo(Byte value) {
	        addCriterion("k_state <>", value, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateGreaterThan(Byte value) {
	        addCriterion("k_state >", value, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateGreaterThanOrEqualTo(Byte value) {
	        addCriterion("k_state >=", value, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateLessThan(Byte value) {
	        addCriterion("k_state <", value, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateLessThanOrEqualTo(Byte value) {
	        addCriterion("k_state <=", value, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateIn(List<Byte> values) {
	        addCriterion("k_state in", values, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateNotIn(List<Byte> values) {
	        addCriterion("k_state not in", values, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateBetween(Byte value1, Byte value2) {
	        addCriterion("k_state between", value1, value2, "kState");
	        return (Criteria) this;
	    }
	
	    public Criteria andKStateNotBetween(Byte value1, Byte value2) {
	        addCriterion("k_state not between", value1, value2, "kState");
	        return (Criteria) this;
	    }
	}	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	public static class Criterion {
	
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