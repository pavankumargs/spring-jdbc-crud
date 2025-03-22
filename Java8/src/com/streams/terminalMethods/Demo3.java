package com.streams.terminalMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
	public static void main(String[] args) {
		
		/* reduce() method basically means combine the objects into one single object */
		
		List<String> list = Arrays.asList("A","B","C","1","2","3");
		Optional<String> result = list.stream().reduce((value,combinedValue)->{
			return combinedValue+value;
		});
		
		System.out.println(result.get());
	}
}
