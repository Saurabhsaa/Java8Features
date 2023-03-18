package com.practice.java.lambdaRestrictions;

import java.util.function.*;

public class LocalVariable1 {
	
	public static void main(String args[]) {
		int i = 0;
		int value = 4;
		
		Consumer<Integer> cons = (i1) -> {// since i is already present in local method so we can have i again
			System.out.println(i1); 
		};
		
		Consumer<Integer> cons1 = (i1) -> {
//			int i = 4;				// we can not even reasign the variable since it is in same method scope
			System.out.println(i1); 
		};
	}
}
