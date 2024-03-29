package com.ssm.pojo;

import java.util.List;
import java.util.ArrayList;

public class AwardExample {

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
	
	    public Criteria andAtyIdIsNull() {
	        addCriterion("aty_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdIsNotNull() {
	        addCriterion("aty_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdEqualTo(String value) {
	        addCriterion("aty_id =", value, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdNotEqualTo(String value) {
	        addCriterion("aty_id <>", value, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdGreaterThan(String value) {
	        addCriterion("aty_id >", value, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdGreaterThanOrEqualTo(String value) {
	        addCriterion("aty_id >=", value, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdLessThan(String value) {
	        addCriterion("aty_id <", value, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdLessThanOrEqualTo(String value) {
	        addCriterion("aty_id <=", value, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdLike(String value) {
	        addCriterion("aty_id like", value, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdNotLike(String value) {
	        addCriterion("aty_id not like", value, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdIn(List<String> values) {
	        addCriterion("aty_id in", values, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdNotIn(List<String> values) {
	        addCriterion("aty_id not in", values, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdBetween(String value1, String value2) {
	        addCriterion("aty_id between", value1, value2, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAtyIdNotBetween(String value1, String value2) {
	        addCriterion("aty_id not between", value1, value2, "atyId");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameIsNull() {
	        addCriterion("nickname is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameIsNotNull() {
	        addCriterion("nickname is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameEqualTo(String value) {
	        addCriterion("nickname =", value, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameNotEqualTo(String value) {
	        addCriterion("nickname <>", value, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameGreaterThan(String value) {
	        addCriterion("nickname >", value, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameGreaterThanOrEqualTo(String value) {
	        addCriterion("nickname >=", value, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameLessThan(String value) {
	        addCriterion("nickname <", value, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameLessThanOrEqualTo(String value) {
	        addCriterion("nickname <=", value, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameLike(String value) {
	        addCriterion("nickname like", value, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameNotLike(String value) {
	        addCriterion("nickname not like", value, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameIn(List<String> values) {
	        addCriterion("nickname in", values, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameNotIn(List<String> values) {
	        addCriterion("nickname not in", values, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameBetween(String value1, String value2) {
	        addCriterion("nickname between", value1, value2, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andNicknameNotBetween(String value1, String value2) {
	        addCriterion("nickname not between", value1, value2, "nickname");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedIsNull() {
	        addCriterion("is_awarded is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedIsNotNull() {
	        addCriterion("is_awarded is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedEqualTo(Boolean value) {
	        addCriterion("is_awarded =", value, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedNotEqualTo(Boolean value) {
	        addCriterion("is_awarded <>", value, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedGreaterThan(Boolean value) {
	        addCriterion("is_awarded >", value, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedGreaterThanOrEqualTo(Boolean value) {
	        addCriterion("is_awarded >=", value, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedLessThan(Boolean value) {
	        addCriterion("is_awarded <", value, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedLessThanOrEqualTo(Boolean value) {
	        addCriterion("is_awarded <=", value, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedIn(List<Boolean> values) {
	        addCriterion("is_awarded in", values, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedNotIn(List<Boolean> values) {
	        addCriterion("is_awarded not in", values, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedBetween(Boolean value1, Boolean value2) {
	        addCriterion("is_awarded between", value1, value2, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsAwardedNotBetween(Boolean value1, Boolean value2) {
	        addCriterion("is_awarded not between", value1, value2, "isAwarded");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeIsNull() {
	        addCriterion("award_time is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeIsNotNull() {
	        addCriterion("award_time is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeEqualTo(Integer value) {
	        addCriterion("award_time =", value, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeNotEqualTo(Integer value) {
	        addCriterion("award_time <>", value, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeGreaterThan(Integer value) {
	        addCriterion("award_time >", value, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeGreaterThanOrEqualTo(Integer value) {
	        addCriterion("award_time >=", value, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeLessThan(Integer value) {
	        addCriterion("award_time <", value, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeLessThanOrEqualTo(Integer value) {
	        addCriterion("award_time <=", value, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeIn(List<Integer> values) {
	        addCriterion("award_time in", values, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeNotIn(List<Integer> values) {
	        addCriterion("award_time not in", values, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeBetween(Integer value1, Integer value2) {
	        addCriterion("award_time between", value1, value2, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAwardTimeNotBetween(Integer value1, Integer value2) {
	        addCriterion("award_time not between", value1, value2, "awardTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountIsNull() {
	        addCriterion("account is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountIsNotNull() {
	        addCriterion("account is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountEqualTo(String value) {
	        addCriterion("account =", value, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountNotEqualTo(String value) {
	        addCriterion("account <>", value, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountGreaterThan(String value) {
	        addCriterion("account >", value, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountGreaterThanOrEqualTo(String value) {
	        addCriterion("account >=", value, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountLessThan(String value) {
	        addCriterion("account <", value, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountLessThanOrEqualTo(String value) {
	        addCriterion("account <=", value, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountLike(String value) {
	        addCriterion("account like", value, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountNotLike(String value) {
	        addCriterion("account not like", value, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountIn(List<String> values) {
	        addCriterion("account in", values, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountNotIn(List<String> values) {
	        addCriterion("account not in", values, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountBetween(String value1, String value2) {
	        addCriterion("account between", value1, value2, "account");
	        return (Criteria) this;
	    }
	
	    public Criteria andAccountNotBetween(String value1, String value2) {
	        addCriterion("account not between", value1, value2, "account");
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
	
	    public Criteria andMessageIsNull() {
	        addCriterion("message is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageIsNotNull() {
	        addCriterion("message is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageEqualTo(String value) {
	        addCriterion("message =", value, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageNotEqualTo(String value) {
	        addCriterion("message <>", value, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageGreaterThan(String value) {
	        addCriterion("message >", value, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageGreaterThanOrEqualTo(String value) {
	        addCriterion("message >=", value, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageLessThan(String value) {
	        addCriterion("message <", value, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageLessThanOrEqualTo(String value) {
	        addCriterion("message <=", value, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageLike(String value) {
	        addCriterion("message like", value, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageNotLike(String value) {
	        addCriterion("message not like", value, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageIn(List<String> values) {
	        addCriterion("message in", values, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageNotIn(List<String> values) {
	        addCriterion("message not in", values, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageBetween(String value1, String value2) {
	        addCriterion("message between", value1, value2, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andMessageNotBetween(String value1, String value2) {
	        addCriterion("message not between", value1, value2, "message");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeIsNull() {
	        addCriterion("created_time is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeIsNotNull() {
	        addCriterion("created_time is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeEqualTo(Integer value) {
	        addCriterion("created_time =", value, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeNotEqualTo(Integer value) {
	        addCriterion("created_time <>", value, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeGreaterThan(Integer value) {
	        addCriterion("created_time >", value, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeGreaterThanOrEqualTo(Integer value) {
	        addCriterion("created_time >=", value, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeLessThan(Integer value) {
	        addCriterion("created_time <", value, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeLessThanOrEqualTo(Integer value) {
	        addCriterion("created_time <=", value, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeIn(List<Integer> values) {
	        addCriterion("created_time in", values, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeNotIn(List<Integer> values) {
	        addCriterion("created_time not in", values, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeBetween(Integer value1, Integer value2) {
	        addCriterion("created_time between", value1, value2, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreatedTimeNotBetween(Integer value1, Integer value2) {
	        addCriterion("created_time not between", value1, value2, "createdTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeIsNull() {
	        addCriterion("updated_time is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeIsNotNull() {
	        addCriterion("updated_time is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeEqualTo(Integer value) {
	        addCriterion("updated_time =", value, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeNotEqualTo(Integer value) {
	        addCriterion("updated_time <>", value, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeGreaterThan(Integer value) {
	        addCriterion("updated_time >", value, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeGreaterThanOrEqualTo(Integer value) {
	        addCriterion("updated_time >=", value, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeLessThan(Integer value) {
	        addCriterion("updated_time <", value, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeLessThanOrEqualTo(Integer value) {
	        addCriterion("updated_time <=", value, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeIn(List<Integer> values) {
	        addCriterion("updated_time in", values, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeNotIn(List<Integer> values) {
	        addCriterion("updated_time not in", values, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeBetween(Integer value1, Integer value2) {
	        addCriterion("updated_time between", value1, value2, "updatedTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andUpdatedTimeNotBetween(Integer value1, Integer value2) {
	        addCriterion("updated_time not between", value1, value2, "updatedTime");
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