package com.practice.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamWithLimitAndSkip {

	public static Optional<Integer> limitExe(List<Integer> listInteger) {
		return listInteger.stream()
				//1,2,10,9,12,8
				.limit(2)//1,2
				.reduce((a,b)->a+b);
	}
	
	public static Optional<Integer> skipExe(List<Integer> listInteger) {
		return listInteger.stream()
				//1,2,10,9,12,8
				.skip(2)//10,9,12,8
				.reduce((a,b)->a+b);
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,10,9,12,8);
		
		System.out.println("Limit with reduce : ");
		
		Optional<Integer> limitExe = limitExe(list);
		
		System.out.println(limitExe.get());
		
		System.out.println("Skip with reduce : ");
		
		Optional<Integer> skipExe = skipExe(list);
		
		System.out.println(skipExe.get());

	}
}
