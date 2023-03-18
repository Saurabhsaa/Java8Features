package com.practice.java.methodReference;

import java.util.function.Function;

public class MethodReferenceExample {

	static Function<String,String> func = (s) -> s.toUpperCase();
	
	static Function<String,String> funcMethodRef = String::toUpperCase;
	
	public static void main(String args[]) {
		
		System.out.println(func.apply("Saurabh"));
		
		System.out.println(funcMethodRef.apply("Saurabh"));
	}
}
