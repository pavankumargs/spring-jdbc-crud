package com.streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String sname;
	int sid;
	char sgrade;

	public Student(String sname, int sid, char sgrade) {
		this.sname = sname;
		this.sid = sid;
		this.sgrade = sgrade;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sgrade=" + sgrade + "]";
	}

}

public class FlatMapDemo3 {
	public static void main(String[] args) {

		List<Student> list1 = Arrays.asList(new Student("Nobitha", 101, 'B'), 
										    new Student("Suzuka", 102, 'A'), 
										    new Student("Zion", 103, 'C'));
		
		List<Student> list2 = Arrays.asList(new Student("Sunio",104,'B'),
											new Student("Dakisuki",105,'A'));
		
		List<List<Student>> students = Arrays.asList(list1,list2);
		
		List<Student> finalList = students.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		System.out.println(finalList);
		
		
		
	}
}
