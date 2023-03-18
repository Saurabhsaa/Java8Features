package com.practice.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateMethodsAndExamples {

	static Predicate<Integer> pred1 = (i) -> {return i%5==0;};
	static Predicate<Integer> pred2 = (i) -> i%2==0;
	
	public static void main(String[] args) {
		System.out.println(pred1.test(5));
		
		System.out.println(pred1.and(pred2).test(10));
		
		System.out.println(pred1.and(pred2).test(8));
		
		System.out.println(pred1.or(pred2).test(8));
		
		System.out.println(pred1.and(pred2).negate().test(10));
	}
	
}
