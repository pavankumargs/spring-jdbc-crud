package com.twg.SpringJdbc.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.twg.SpringJdbc.dao.EmployeeDao;
import com.twg.SpringJdbc.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {

	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void printEmpHikes() {
		List<Employee> employees = employeeDao.findAllEmployees();

		for (Employee emp : employees) {
			if (emp.getExp() >= 15) {
				System.out.println("Employee With Id " + emp.getId() + " and his name " + emp.getName()
						+ "Having an experience of " + emp.getExp() + " Eligible to get 30% Hike.");
			} else if (emp.getExp() >= 10) {
				System.out.println("Employee With Id " + emp.getId() + " and his name " + emp.getName()
						+ "Having an experience of " + emp.getExp() + " Eligible to get 25% Hike.");
			} else if (emp.getExp() >= 5) {
				System.out.println("Employee With Id " + emp.getId() + " and his name " + emp.getName()
						+ "Having an experience of " + emp.getExp() + " Eligible to get 20% Hike.");
			} else {
				System.out.println("Employee With Id " + emp.getId() + " and his name " + emp.getName()
						+ "Having an experience of " + emp.getExp() + " Elogible to get 15% Hike.");
			}
		}
	}

}
