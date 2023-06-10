package com.practice.java.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStream {

	public static int findSum(List<Integer> intArray) {
		return intArray.stream().reduce(0,(a,b)->a+b);
	}
	
	public static int getNSum() {
		return IntStream.rangeClosed(1, 6).sum();
	}
	
	public static void main(String[] args) {
		
		List<Integer> intArray = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(findSum(intArray));
		
		System.out.println(getNSum());
		
	}
}
