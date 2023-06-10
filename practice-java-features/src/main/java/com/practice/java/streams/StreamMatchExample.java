package com.practice.java.streams;

import com.practice.java.dao.StudentRepo;

public class StreamMatchExample {

	public static Boolean anyMatch() {
		return StudentRepo.getAllStudents().stream()
				.anyMatch(student -> student.getGpa()>=3.9);
	}
	
	public static Boolean nonMatch() {
		return StudentRepo.getAllStudents().stream()
		.noneMatch(student -> student.getGpa()>=4.9);
	}
	
	public static Boolean allMatch() {
		return StudentRepo.getAllStudents().stream()
				.allMatch(student -> student.getGpa()>=3.9);
	}
	
	public static void main(String[]  args) {
		System.out.println("Any match exe");
		
		//if any student matches with the predicate cond it will return true
		System.out.println(anyMatch());
		
		System.out.println("Non match exe");
		
		//if all student not matches with the predicate cond it will return true
		System.out.println(nonMatch());
		
		System.out.println("All match exe");
		
		//if all student matches with the predicate cond it will return true
		System.out.println(allMatch());
	}
}
