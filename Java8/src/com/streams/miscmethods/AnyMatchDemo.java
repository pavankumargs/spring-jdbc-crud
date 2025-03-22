package com.streams.miscmethods;

import java.util.HashSet;
import java.util.Set;

public class AnyMatchDemo {
	public static void main(String[] args) {
		
		/*
		 * anyMatch() This method always take predicate as a parameter it is verify the
		 * condition and returns boolean value
		 */
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("One Apple");
		fruits.add("One Mango");
		fruits.add("Two Apples");
		fruits.add("More Grapes");
		fruits.add("Two guvas");
		
		/*
		 * anyMatch() method checks all the elements, if any single element matches the
		 * specified condition it will returns true.
		 */
		
		boolean result = fruits.stream().anyMatch(fruit -> fruit.startsWith("One"));
		System.out.println(result);
		
		
		
	}
}
