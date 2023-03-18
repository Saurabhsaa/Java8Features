package com.practice.java.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerPractice {
	public static void main(String[] args) {
		Consumer<String> cons = (s)->System.out.println(s.toUpperCase());
		cons.accept("Suman");
	}
}
