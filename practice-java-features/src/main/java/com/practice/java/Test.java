package com.practice.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	

	public static void main(String[] args) {
		
		mapIteration();
		
//		String[] arr = {"geeksforgeeks", "geeks", "geek","geezer"};
//		
//		String firststr = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			while (arr[i].indexOf(firststr) != 0) {
//				firststr = firststr.substring(0, firststr.length() - 1);
//			}
//		}
//		if (firststr.length() == 0)
//			System.out.println("-1");
//		System.out.println(firststr);	
	}
	
	public static void mapIteration() {
		Map<Character,Integer> map = new LinkedHashMap<>();
		String str = "geeksforgeeks";
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer> e  :map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
