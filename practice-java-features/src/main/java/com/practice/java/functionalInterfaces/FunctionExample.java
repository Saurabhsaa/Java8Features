package com.practice.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

	static Function<String,String> function = (name) -> name.toUpperCase();
	
	static Function<String,String> function1 = (name) -> name.concat(" saurabh");
	
	public static void main(String args[]) {
		System.out.println(function.apply("Suman"));
		
		System.out.println(function.andThen(function1).apply("Suman"));
		
		System.out.print(function.compose(function1).apply("Suman"));
	}
}
