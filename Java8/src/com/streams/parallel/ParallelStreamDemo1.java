package com.streams.parallel;

import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	

}

public class ParallelStreamDemo1 {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student("David", 82), 
												 (new Student("Bob", 90)),
												 (new Student("John", 65)), 
												 (new Student("Canedy", 55)),
												 (new Student("Eric", 85)),
												 (new Student("Smith", 88)), 
												 (new Student("Scott", 50)));
		
		//filter the data which student is >= 80
		
		//Normal Stream
		studentList.stream()
				   .filter(student -> student.getScore() >= 80)
				   .limit(3)
				   .forEach(student -> System.out.println(student.getName() + " 	 " + student.getScore()));
	
		//Parallel Stream
		studentList.parallelStream()
				   .filter(student -> student.getScore()>=80)
				   .limit(3)
				   .forEach(student ->  System.out.println(student.getName() + " 	 " + student.getScore()));
		
		//Converting normal stream to parallel stream
		//just we need to add parallel() method before filter() method
		studentList.stream()
				   .parallel()
		           .filter(student -> student.getScore() >= 80)
		           .limit(3)
		           .forEach(student -> System.out.println(student.getName() + " 	 " + student.getScore()));

	
		/*
		 * The Main advantage of using parallel streams is to improve the code
		 * performance
		 * 
		 * Parallel stream internally implements multiple streams to process the data
		 * quickly
		 */
	}
}
