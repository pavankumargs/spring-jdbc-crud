package com.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//we have the collection of employee objects
//if the price is > 25000 add them in to some other collection 
class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

public class FilterDemo4 {
	public static void main(String[] args) {

	List<Product> products = Arrays.asList(new Product(1, "Hp Laptop", 25000), 
									   	   new Product(2, "Apple", 50000), 
										   new Product(3, "Acer", 20000),
									       new Product(4, "Dell", 28000));
	
	List<Product> highPrice = new ArrayList<Product>();
	
	highPrice = products.stream().filter(p -> p.price > 25000).collect(Collectors.toList());
		
	System.out.println(highPrice);	
	
	}
}
