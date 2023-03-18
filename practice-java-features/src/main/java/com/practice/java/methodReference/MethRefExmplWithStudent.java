package com.practice.java.methodReference;

import java.util.function.Consumer;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class MethRefExmplWithStudent {

	static Consumer<Student> cons1 = (st) -> System.out.println(st);
	
	static Consumer<Student> cons2 = System.out::println;
	
	static Consumer<Student> cons3 = Student::printActivities;
	
	public static void main(String args[]) {
//		StudentRepo.getAllStudents().forEach(cons1);
		
		StudentRepo.getAllStudents().forEach(cons2);
		
		StudentRepo.getAllStudents().forEach(cons3);
	}
}
