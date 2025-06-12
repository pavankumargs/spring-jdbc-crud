package com.twg.SpringJdbc.business;

import com.twg.SpringJdbc.dto.Employee;

public interface EmployeeBusiness {

	public void printEmpHikes();
	
	public void insertEmployee(Employee employee);
	
	public Employee getEmployeeById(String id);
}
