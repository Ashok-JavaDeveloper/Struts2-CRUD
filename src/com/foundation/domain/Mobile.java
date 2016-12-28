package com.foundation.domain;

import java.io.Serializable;

public class Mobile implements Serializable{

	private static final long serialVersionUID = 5343124970672550307L;
	
	private int id;
	private int employeeId;
	private String mobileNo;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
