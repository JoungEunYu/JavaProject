package com.kh.phone.model.vo;

import java.io.Serializable;

public class PhoneBook implements Serializable {
	
	private String name;
	private String phone;
	private String dept;
	private String email;
	private String memo;
	
	public PhoneBook() {
		
	}
	
	public PhoneBook(String name, String phone, String dept, String email, String memo) {
		super();
		this.name = name;
		this.phone = phone;
		this.dept = dept;
		this.email = email;
		this.memo = memo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", phone=" + phone + ", dept=" + dept + ", email=" + email + ", memo=" + memo
				+ "]";
	}
}
