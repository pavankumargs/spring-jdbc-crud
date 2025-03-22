package com.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class MapDemo4 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(101, "John", 25000),
				new Employee(101, "Mary", 32000),
				new Employee(103, "David", 45000),
				new Employee(104, "Johncena",89990));
		
		List<Integer> emps = employees.stream().filter(e->e.salary>35000).map(e->e.salary).collect(Collectors.toList());
		
		System.out.println(emps);
		
	}
}
