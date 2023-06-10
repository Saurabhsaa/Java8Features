package com.practice.java.factoryMethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Suman","Saurabh","Stalin","Ajey");
		stream.forEach(System.out::println);
		
		Stream.iterate(1, i->i*2).limit(20).forEach(System.out::println);
		
		Supplier<Integer> supplier = new Random()::nextInt;
		
		Stream.generate(supplier).limit(10).forEach(System.out::println);
		
	}
}
