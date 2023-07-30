package com.practice.java.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapToExamples {

	public static List<Integer> mapToObjet(){
		return IntStream.rangeClosed(1, 6).mapToObj((i)->{
			return new Integer(i);
		}).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(mapToObjet());
	}
}
