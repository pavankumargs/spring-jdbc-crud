package com.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Take a list of numbers 1 t0 30. print all the even numbers using streams concept.
//and store them in to other collection 
public class FilterDemo1 {
	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
		
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		evenNumbers = nos.stream().filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
	}
}
