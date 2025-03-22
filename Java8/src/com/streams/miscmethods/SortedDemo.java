package com.streams.miscmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted() Method Demo

public class SortedDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 1, 3, 7, 9, 8);

		// sort the numbers using streams concept
		// sorted()
		// sorted() method by default it will sort the elements ascending order only

		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);

		// sorting the elements in descending order
		// sorted() method it will take the comparator arguments.
		// so by using comparator we can sort the elements in descending order

		List<Integer> sortedByDesc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedByDesc);

//-----------------------------------------------------------------------------------------------------------------------------

		// Sorted() method on string data type
		List<String> names = Arrays.asList("Light", "Cooler", "Fan", "Bed", "Switch", "CupBoard", "Mirror", "Window");

		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);

		// Descending Order
		List<String> sortedNamesByDesc = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedNamesByDesc);

	}
}
