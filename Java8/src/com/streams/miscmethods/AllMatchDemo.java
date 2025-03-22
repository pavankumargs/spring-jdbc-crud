package com.streams.miscmethods;

import java.util.HashSet;
import java.util.Set;

public class AllMatchDemo {
	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("One Apple");
		fruits.add("One Mango");
		fruits.add("Two Apples");
		fruits.add("More Grapes");
		fruits.add("Two guvas");
		
		/*
		 * allMatch() method it returns true only all the elements are matched with
		 * specified condition.
		 */
		
		
		boolean result = fruits.stream().allMatch(fruit->fruit.startsWith("One"));
		System.out.println(result);
		
		
	}
}
