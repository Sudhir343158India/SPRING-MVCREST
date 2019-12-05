package com.hcl.mvcrest.dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.mvcrest.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	   private SessionFactory sessionFactory;
	
	//@SuppressWarnings("unchecked")
//	@Override
//	public List<Employee> getEmployees() {
//  
//		Session session = this.sessionFactory.getCurrentSession();
//		List<Employee> employeeList = session.createCriteria(Employee.class).list();
//		return employeeList;
//	}

//	@Override
//	public Employee getEmployee(int empId) {
//		
//		return sessionFactory.getCurrentSession().get(Employee.class,empId);
//	}

//	@Override
//	public int createEmployee(Employee employee) {
//	sessionFactory.getCurrentSession().save(employee);
//		return employee.getEmpId();
//	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findByMobile(long mobile) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Criteria employeeList= session.createCriteria(Employee.class);
		return  (List<Employee>) employeeList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findByEmail(String emailId) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria employeeList= session.createCriteria(Employee.class);
		return (List<Employee>) employeeList;
	}

	@Override
	public void save(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		
	}

}
