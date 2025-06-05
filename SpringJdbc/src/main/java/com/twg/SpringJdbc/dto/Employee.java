package com.twg.SpringJdbc.dto;

public class Employee {

	private String id;
	private String name;
	private int exp;
	private String department;

	public Employee(String id, String name, int exp, String department) {
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", exp=" + exp + ", department=" + department + "]";
	}

}
