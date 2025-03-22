package com.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//remove the null values from collection using streams concept.

public class FilterDemo3 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("pavan",null,"bus","java",null,null);
		
		List<String> al = new ArrayList<String>();
		
		words.stream().filter(name->name != null).forEach(name->System.out.println(name));
		
		al = words.stream().filter(name-> name != null).collect(Collectors.toList());
		
		System.out.println(al);
	}
}
