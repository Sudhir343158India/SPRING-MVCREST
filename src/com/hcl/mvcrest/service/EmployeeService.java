package com.hcl.mvcrest.service;

import com.hcl.mvcrest.dto.EmployeeDTO;
import com.hcl.mvcrest.dto.ResponseDTO;
import com.hcl.mvcrest.exception.SoftechErrorMessageException;

public interface EmployeeService {

//	 public List<Employee> getEmployees();
//	 //public Employee getEmployee(int empId);
//	 public int createEmployee(Employee employee);
	//public CustomerRegistrationResponseDTO CustomerRegistration(CustomerRegistrationDTO customerRegistrationDTO) throws ErrormessageException;
public ResponseDTO employeeRegistration(EmployeeDTO employeeDTO)throws SoftechErrorMessageException;

}
