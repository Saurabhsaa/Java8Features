package com.practice.java.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	static BiConsumer<String,String> biCons = (a,b) -> System.out.println(a+b);

	public static void main(String[] args) {
		biCons.accept("Suman ", "Saurabh");
	}
}
