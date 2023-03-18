package com.practice.java.functionalInterfaces;

import java.util.List;
import java.util.function.Supplier;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class SupplierExample {

	static Supplier<Integer> supplier = () -> (10);
	
	static Supplier<List<Student>> supplier1 = () -> (StudentRepo.getAllStudents());
	
	public static void main(String[] args) {
		System.out.println(supplier.get());
		
		System.out.println(supplier1.get());
		
	}
}
