package com.streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Pavan","Suniyo");
		List<String> list2 = Arrays.asList("Suzuka","Nobitha");
		List<String> list3 = Arrays.asList("Zion","Doremon");
		
		List<List<String>> tempList = Arrays.asList(list1,list2,list3);
		
		List<String> result = tempList.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		System.out.println(result);
		
		//after flatMap() method we can apply map() method and do some operations
		tempList.stream().flatMap(s->s.stream()).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
	}
}
