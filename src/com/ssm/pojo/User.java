package com.ssm.pojo;

import java.util.Date;

public class User {

	private Date kTime;

	private String emailA;

	private String administratorA;

	private Integer id;

	private Byte kState;

	private String name;

	private String phone;

	private String password;

	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name == null ? null : name.trim();
	}

	public String getPassword() {
	    return password;
	}

	public void setPassword(String password) {
	    this.password = password == null ? null : password.trim();
	}

	public String getPhone() {
	    return phone;
	}

	public void setPhone(String phone) {
	    this.phone = phone == null ? null : phone.trim();
	}

	public String getEmailA() {
	    return emailA;
	}

	public void setEmailA(String emailA) {
	    this.emailA = emailA == null ? null : emailA.trim();
	}

	public Date getkTime() {
	    return kTime;
	}

	public void setkTime(Date kTime) {
	    this.kTime = kTime;
	}

	public String getAdministratorA() {
	    return administratorA;
	}

	public void setAdministratorA(String administratorA) {
	    this.administratorA = administratorA == null ? null : administratorA.trim();
	}

	public Byte getkState() {
	    return kState;
	}

	public void setkState(Byte kState) {
	    this.kState = kState;
	}


}