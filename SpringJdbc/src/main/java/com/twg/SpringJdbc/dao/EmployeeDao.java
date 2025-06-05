package com.twg.SpringJdbc.dao;

import java.util.List;

import com.twg.SpringJdbc.dto.Employee;

public interface EmployeeDao {

	public void insertEmployee(Employee employee);

	public List<Employee> findAllEmployees();

	public Employee getEmployeeById(String id);
}
