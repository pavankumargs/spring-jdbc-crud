package com.streams.map;

import java.util.Arrays;
import java.util.List;

//we have a strings collection change them in to upper case
public class MapDemo1 {
	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus","train","flight","car","bicycle");
		
		vehicles.stream().map(vehicle -> vehicle.toUpperCase()).forEach(vehicle->System.out.println(vehicle));
	}
}
