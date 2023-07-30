package com.practice.java.lambdaRestrictions;

import java.util.function.*;

public class LocalVariable2 {

//	static int value = 5;
	
	public static void main(String[]  args) {
		
		int value = 4;
		
		Consumer<Integer> cons = (i) -> {
			System.out.println(value+i);
		};
		
		Consumer<Integer> cons1 = (i) -> {
			//value++; // not allowed to modify any local variable 
			System.out.println(value+i);
		};
		
		//value = 7; //  even this is not allowed since the variable is used in side lambda exp and it is present in same method scope 
	
		//if value is instance varibale we are allowe to modifiy valiable
	}
	
}
