package com.hcl.mvcrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mvcrest.dto.EmployeeDTO;
import com.hcl.mvcrest.dto.ResponseDTO;
import com.hcl.mvcrest.exception.SoftechErrorMessageException;
import com.hcl.mvcrest.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
//	/*---Add new book---*/
//	   @PostMapping("/book")
//	   public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
//	      long id = employeeService.save(employee);
//	      return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
//	      
//
//	  	@PostMapping("/Users")
//
//	  	public ResponseEntity<CustomerRegistrationResponseDTO> CustomerRegistration(@RequestBody CustomerRegistrationDTO customerRegistrationDTO )throws ErrormessageException
//	  	{
//	  	CustomerRegistrationResponseDTO response=customerRegistrationService.CustomerRegistration(customerRegistrationDTO);
//	  		log.info("BankController:: Customer Registration.....");;
//	  			//log.info("CustomerRegistrationController::Customer Registration..");
//	  		return new ResponseEntity<>(response, HttpStatus.CREATED);
//	  	
//	  	}@RequestMapping(value = "/employeeRegistration", method = RequestMethod.POST, headers = "Accept=application/json")
//	     ("/users")
	@RequestMapping(value = "/employeeRegistration", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<ResponseDTO> employeeRegistration(@RequestBody EmployeeDTO employeeDTO)throws SoftechErrorMessageException
	{
		ResponseDTO response=employeeService.employeeRegistration(employeeDTO);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}
	
}
