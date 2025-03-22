package com.streams.miscmethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcateDemo {
	public static void main(String[] args) {
		
		List<String> animals = Arrays.asList("Dog","Cat","Elephant","Lion");
		
		List<String> birds = Arrays.asList("Peacock","Dove","Sparrow","Parrot","Crow");
		
		Stream<String> stream1 = animals.stream();
		
		Stream<String> stream2 = birds.stream();
		
		List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		for(String name : finalList) {
			System.out.println(name);
		}
 	}
}
