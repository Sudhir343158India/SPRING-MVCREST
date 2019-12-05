package com.hcl.mvcrest.dto;

import java.time.LocalDateTime;

public class EmployeeDTO {
	private String empName;
	private String emailId;
	private String desigantion;
	private LocalDateTime doj;
	private long mobile;
	private double salary;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDesigantion() {
		return desigantion;
	}
	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}
	public LocalDateTime getDoj() {
		return doj;
	}
	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
