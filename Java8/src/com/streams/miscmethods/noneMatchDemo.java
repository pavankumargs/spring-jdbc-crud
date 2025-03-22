package com.streams.miscmethods;

import java.util.HashSet;
import java.util.Set;


public class noneMatchDemo {
	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("One Apple");
		fruits.add("One Mango");
		fruits.add("Two Apples");
		fruits.add("More Grapes");
		fruits.add("Two guvas");
		
		/*
		 * noneMatch() method this method completely opposite of allMatch() Method.class
		 * checks all the elements with specified condition.in our example should not
		 * start with One so checks all the elements with specified condition
		 */
		
		boolean result = fruits.stream().noneMatch(fruit->fruit.startsWith("One"));
		System.out.println(result);
		
		
	}
}
