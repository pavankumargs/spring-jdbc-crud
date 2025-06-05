package com.twg.SpringJdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.twg.SpringJdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> findAllEmployees() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/springjdbc";
		String username = "root";
		String password = "Root@123$";
		
		List<Employee> employees = new ArrayList();

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String qry = "select * from employees";
			ResultSet res = stmt.executeQuery(qry);
			
			while(res.next()) {
				String id = res.getString(1);
				String name = res.getString(2);
				int exp = res.getInt(3);
				
				Employee emp = new Employee(id, username, exp, name);
				employees.add(emp);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return employees;
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
