package com.streams.miscmethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethodDemo {
	public static void main(String[] args) {
		
		/*
		 * This method returns optional.
		 * findAny() method will checks the collection if any one element is available
		 * inside the collection it will returns the element from collection. if
		 * collection is empty throws null pointer exception.
		 */
		
		
		List<String> list = Arrays.asList("One","Two","Three","Four","Five");
		Optional<String> result = list.stream().findAny();
		System.out.println(result);
		
		//Empty Collection
		List<Object> list1 = Arrays.asList();
		Optional<Object> res = list1.stream().findAny();
		System.out.println(res);
		
		
//--------------------------------------------------------------------------------------------------
		
		//findFirst()
		
		/*
		 * returns the first element from the Collection.class if the collection is
		 * empty throws noSuchBeanException
		 */
		
		Optional<String> findFirst = list.stream().findFirst();
		System.out.println(findFirst);
	}
}
