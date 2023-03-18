package com.practice.java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryFunctionExample {

	static UnaryOperator<String> unaryOp = (s) -> s.concat(" is successfull");
	
	static BinaryOperator<String> binaryOp = (s1,s2) -> s1.concat(s2);
	
	static Comparator<Integer> comp = (a,b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		
		System.out.println(unaryOp.apply("Suman"));
		
		System.out.println(binaryOp.apply("Suman ", "is successfull"));
		
		BinaryOperator<Integer> bo = BinaryOperator.maxBy(comp);
		
		System.out.println(bo.apply(54, 2));
		
	}
}
