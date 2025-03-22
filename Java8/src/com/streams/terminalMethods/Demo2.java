package com.streams.terminalMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//distinct()
//min()
//max()

public class Demo2 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		long count = numbers.stream().filter(number -> number%2 == 0).count();
		System.out.println(count);
		
		/*
		 * min() method this will returns the minimum value from the list. this method
		 * will takes the comparator object
		 */
		
		Optional<Integer> min = numbers.stream().min((val1,val2) -> {
			return val1.compareTo(val2);
		});
		
		System.out.println(min.get());
		
		
		/*
		 * max() method this method also take comparator Object. same as min() method
		 * but it returns the maximum value from the collection
		 */
		
		Optional<Integer> max = numbers.stream().max((val1,val2)->{
			return val1.compareTo(val2);
		});
		
		System.out.println(max.get());
	}
}
