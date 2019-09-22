package com.ssm.pojo;


public class Award {

	private String message;

	private Integer id;

	private String atyId;

	private Boolean isAwarded;

	private Integer awardTime;

	private String account;

	private Integer createdTime;

	private Integer updatedTime;

	private String nickname;

	private String password;

	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}

	public String getAtyId() {
	    return atyId;
	}

	public void setAtyId(String atyId) {
	    this.atyId = atyId == null ? null : atyId.trim();
	}

	public String getNickname() {
	    return nickname;
	}

	public void setNickname(String nickname) {
	    this.nickname = nickname == null ? null : nickname.trim();
	}

	public Boolean getIsAwarded() {
	    return isAwarded;
	}

	public void setIsAwarded(Boolean isAwarded) {
	    this.isAwarded = isAwarded;
	}

	public Integer getAwardTime() {
	    return awardTime;
	}

	public void setAwardTime(Integer awardTime) {
	    this.awardTime = awardTime;
	}

	public String getAccount() {
	    return account;
	}

	public void setAccount(String account) {
	    this.account = account == null ? null : account.trim();
	}

	public String getPassword() {
	    return password;
	}

	public void setPassword(String password) {
	    this.password = password == null ? null : password.trim();
	}

	public String getMessage() {
	    return message;
	}

	public void setMessage(String message) {
	    this.message = message == null ? null : message.trim();
	}

	public Integer getCreatedTime() {
	    return createdTime;
	}

	public void setCreatedTime(Integer createdTime) {
	    this.createdTime = createdTime;
	}

	public Integer getUpdatedTime() {
	    return updatedTime;
	}

	public void setUpdatedTime(Integer updatedTime) {
	    this.updatedTime = updatedTime;
	}


}