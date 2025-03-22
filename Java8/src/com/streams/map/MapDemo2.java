package com.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//collection string find the length of the each element 
//and stores the length in another collection

public class MapDemo2 {
	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("Bicycle","Car","bus","flight","train");
		
		List<Integer> vehicleLengths = vehicles.stream().map(vehicle -> vehicle.length()).collect(Collectors.toList());
		
		System.out.println(vehicleLengths);
	}
}
