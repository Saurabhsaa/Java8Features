package com.practice.java.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		Instant inst = Instant.now();
		System.out.println(inst);
		
		//1970-01-01 will be starting point
		System.out.println(inst.getEpochSecond());
		
		Instant inst1 = Instant.ofEpochSecond(0);
		System.out.println(inst1); 
		
		Instant inst2 = Instant.now();
		
		System.out.println(Duration.between(inst, inst2).getNano());
		
	}
}
