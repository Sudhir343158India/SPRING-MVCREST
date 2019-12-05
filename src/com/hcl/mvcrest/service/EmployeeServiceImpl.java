package com.hcl.mvcrest.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hcl.mvcrest.dao.EmployeeDAO;
import com.hcl.mvcrest.dto.EmployeeDTO;
import com.hcl.mvcrest.dto.ResponseDTO;
import com.hcl.mvcrest.entity.Employee;
import com.hcl.mvcrest.exception.SoftechErrorMessageException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired 
private EmployeeDAO employeeDAO;


	// Employee Registration 
	//Optional<List<CustomerRegistration>> userDetailsemail= customerRegistrationRepository.findByEmail(customerRegistrationDTO.getEmail());
	
//	if(userDetailsemail.isPresent())
//		throw new ErrormessageException(ApplicationUtility.EMAIL_STATUS);
//	if(!FeildValidation.isValid(customerRegistrationDTO.getEmail()))
//		throw new ErrormessageException(ApplicationUtility.INVALID_EMAIL_STATUS);
//
//		Optional<List<CustomerRegistration>> userDetailsMobile= customerRegistrationRepository.findByMobile(customerRegistrationDTO.getMobile());
//		
//			if(userDetailsMobile.isPresent())
//		throw new ErrormessageException(ApplicationUtility.EXITED_MOBILE_NUMBER_STATUS);
//			if(!FeildValidation.mobileValid(""+customerRegistrationDTO.getMobile()))
//				throw new ErrormessageException(ApplicationUtility.INVALID_MOBILE_NUMBER_STATUS);
	
	
//	TransactionDetails transactionDetails= new TransactionDetails();
//	
//	BeanUtils.copyProperties(transactionDetailsRequestDTO, transactionDetails);
//	transactionDetails.setTransactionType("Credit");
//	transactionDetails.setDate(LocalDateTime.now());
//    transactionDetailsRepository.save(transactionDetails);
//	TransactionDetailsResponseDTO transactionDetailsResponseDTO  = new TransactionDetailsResponseDTO ();
//	transactionDetailsResponseDTO.setMessage(ApplicationUtility.TRANSACTION_STATUS);
//	transactionDetailsResponseDTO.setStatuscode(HttpStatus.CREATED.value());
//	return transactionDetailsResponseDTO;	
	
	
	 
	
	//return null;

@Override
public ResponseDTO employeeRegistration(EmployeeDTO employeeDTO) throws SoftechErrorMessageException {
	Employee employee = new Employee();
	 //employeeRegistration.setCustAccNum(custAccNum);
		BeanUtils.copyProperties(employeeDTO, employee);
		employeeDAO.save(employee);
		ResponseDTO responseDTO=new ResponseDTO();
			responseDTO.setMessage("Employee has been created");
	     	responseDTO.setStatuscode(HttpStatus.CREATED.value());
			
			
		return  responseDTO;
}

//@Transactional
//	@Override
//	public List<Employee> getEmployees() {
//		// TODO Auto-generated method stub
//		
//		
//		return employeeDAO.getEmployees();
//	}
//	@Transactional
//	@Override
//	public int createEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		return employeeDAO.createEmployee(employee);
//	}

	
}
