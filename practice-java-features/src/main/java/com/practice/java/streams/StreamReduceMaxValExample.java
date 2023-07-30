package com.practice.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceMaxValExample {

	public static int findMaxByReduce(List<Integer> listInteger){
		return listInteger.stream()
				.reduce(0, (a,b)->a>b?a:b);
	}
	
	public static Optional<Integer> findMaxByReduceWithoutDefault(List<Integer> listIntegers) {
		return listIntegers.stream()
				.reduce((a, b)->a<b?a:b);
	}
	
	public static void main(String[] args) {
		
		//to find max value it is always recommended to use optional
		
		List<Integer> intList = Arrays.asList(1,2,6,1,9,10,1,7);
		
		System.out.println("Max by reduce ");
		
		System.out.println(findMaxByReduce(intList));
		
		System.out.println("Max by reduce without default");
		
		Optional<Integer> op = findMaxByReduceWithoutDefault(intList);
		
		if(op.isPresent()) {
			System.out.println(op.get());
		}
	}
}
