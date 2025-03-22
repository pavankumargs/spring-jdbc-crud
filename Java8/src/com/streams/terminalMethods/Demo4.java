package com.streams.terminalMethods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		
		//converting list to an array
		List<String> list = Arrays.asList("A","B","C","1","2","3");
		Object[] array = list.toArray();
		System.out.println(array.length);
		
		for(Object temp : array) {
			System.out.println(temp);
		}
		
	}
}
