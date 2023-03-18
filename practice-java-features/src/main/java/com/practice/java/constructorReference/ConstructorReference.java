package com.practice.java.constructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.practice.java.dao.Student;

public class ConstructorReference {
	
	static Supplier<Student> supplier = Student::new;
	
	static Function<String,Student> func = Student::new;

	public static void main(String args[]) {
		System.out.println(supplier.get());
		
		System.out.println(func.apply("Saurabh"));
	}
}
