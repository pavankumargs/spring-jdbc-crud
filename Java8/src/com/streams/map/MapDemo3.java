package com.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//collection contains integers 
//multiply each element with 3 store the output in to some other collection
public class MapDemo3 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,3,4,6,7);
		
		List<Integer> output = numbers.stream().map(n->n*3).collect(Collectors.toList());
		
		System.out.println(output);
	}
}
