package com.twg.SpringJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.twg.SpringJdbc.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getString(1));
		emp.setName(rs.getString(2));
		emp.setExp(rs.getInt(3));
		emp.setDepartment(rs.getString(4));
		return emp;
	}

}
