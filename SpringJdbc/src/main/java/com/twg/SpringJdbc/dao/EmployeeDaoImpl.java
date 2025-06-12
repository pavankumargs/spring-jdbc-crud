package com.twg.SpringJdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.twg.SpringJdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertEmployee(Employee employee) {
		String id = employee.getId();
		String name = employee.getName();
		int exp = employee.getExp();
		String department = employee.getDepartment();

		String sql = "insert into employees values(?,?,?,?)";

		jdbcTemplate.update(sql, id, name, exp, department);
	}

	@Override
	public List<Employee> findAllEmployees() {
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> employees = jdbcTemplate.query("select * from employees", rowMapper);
		return employees;
	}

	@Override
	public Employee getEmployeeById(String id) {
		String qry = "select * from employees where id = ?";
		Employee employee = jdbcTemplate.queryForObject(qry, new EmployeeRowMapper(), id);
		return employee;
	}

}
