package com.practice.java.streams;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class StreamMapAndReduceExample {

	public static int getAllBookCount() {
		return StudentRepo.getAllStudents().stream()
		.map(Student::getBooks)
		.reduce(1,(a,b)->a+b);
	}
	
	public static int getAllBooksByGender() {
		return StudentRepo.getAllStudents().stream()
				.filter(s->s.getGender().equals("female"))
				.map(Student::getBooks)
				.reduce(1, Integer::sum);	
	}
	
	public static void main(String args[]) {
		
		System.out.println("Gel all books ");
		System.out.println(getAllBookCount());
		
		System.out.println("Gel all books for female and using Integer class");
		System.out.println(getAllBooksByGender());
	}
}
