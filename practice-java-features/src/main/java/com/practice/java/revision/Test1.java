package com.practice.java.revision;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		
		map.put(1, 2);
		map.put(2, 1);
		
		List<Map.Entry<Integer,Integer>> li =  (LinkedList<Map.Entry<Integer,Integer>>) map.entrySet();
		
		Collections.sort(li,(li1,li2)->(li1.getKey().compareTo(li2.getValue())));
		
		
	}
}
