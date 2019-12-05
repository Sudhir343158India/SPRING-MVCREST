package com.hcl.mvcrest.dao;

import java.util.List;

import com.hcl.mvcrest.entity.Employee;

public interface EmployeeDAO {

//	 public List<Employee> getEmployees();
////	 //public Employee getEmployee(int empId);
//	 public int createEmployee(Employee employee);
	 
	 List<Employee>findByMobile(long mobile);
	 List<Employee>findByEmail(String emailId);
	void save(Employee employee);
}
