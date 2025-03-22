package com.streams.terminalMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Demo1 {
	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("Bus", "Bicycle", "Car", "Bicycle", "Car", "Car", "bike");

		/*
		 * distinct()method this method will removes all the duplicates from the
		 * collection
		 */
		
		List<String> distinctVehiclesList = vehicles.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctVehiclesList);
		
		
		/* count method this method will count the elements returns an int value */
		
		long count = vehicles.stream().distinct().count();
		System.out.println(count);
		
		
		/*
		 * limit method this method will return the specified number elements
		 * only.limit() accept the integer Value.class if you give 3 it returns only 3
		 * elements
		 */
		
		List<String> limit = vehicles.stream().distinct().limit(3).collect(Collectors.toList());
		System.out.println(limit);
		
		
		
		

	}
}
