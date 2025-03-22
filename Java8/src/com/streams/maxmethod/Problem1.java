package com.streams.maxmethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
}

public class Problem1 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
	
		Optional<Integer> max = numbers.stream().max(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		System.out.println(max.get());
		
		MyComparator obj = new MyComparator();
		Optional<Integer> max2 = numbers.stream().max(obj);
		
		System.out.println(max2.get());
	}
}
