package com.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//takes list of strings. collect the names which are >6 and <8
//store all them in separate collection. 
//take same above one and with out store print all the names
public class FilterDemo2 {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("pavan","sandeep john","Mahesh Babu","Ganesh Reddy","Sai Tarun","Subramanyam","SunSets");
		
		List<String> longNames = new ArrayList<String>();
		
		longNames = names.stream().filter(name -> name.length()>6 && name.length()<8).collect(Collectors.toList());
		
		System.out.println(longNames);
		
		names.stream().filter(name->name.length()>6 && name.length()<8).forEach(name->System.out.println(name));
	}
}
