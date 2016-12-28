package com.foundation.domain;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = -7056872631106084054L;
	private int id;
	private String name;
	private String company;
//	private String[] mobile;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	/*public String[] getMobile() {
		return mobile;
	}

	public void setMobile(String[] mobile) {
		this.mobile = mobile;
	}*/
	
}
