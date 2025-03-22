package com.streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);
		
		List<Integer> result = finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(result);
		
		//you can perform an operation also after flatMap() method
		finalList.stream().flatMap(x -> x.stream()).map(n -> n + 10).forEach(n -> System.out.println(n));
		
	
	}
}
