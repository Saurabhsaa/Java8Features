package com.practice.java.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class PredicateStudentExample {

	static Predicate<Student> pred1 = (s) -> s.getGradeLevel()>3;
	
	static Predicate<Student> pred2 = (s) -> s.getGpa()>=3.9;
	
	public static void filterStudentBasedOnGrade() {
		System.out.println("Inside method filterStudentBasedOnGrade");
		
		List<Student> students =  StudentRepo.getAllStudents();
		
		students.forEach(s -> {
			if(pred1.test(s)) {
				System.out.println(s);
			}	
		});
	}
	
	public static void filterStudentByGpa() {
		System.out.println("Inside method  filterStudentByGpa");
		
		List<Student> students = StudentRepo.getAllStudents();
		students.forEach(s->{
			if(pred2.test(s)) {
				System.out.println(s);
			}
		});
	}
	
	public static void filterStudent() {
		System.out.println("Inside method filterStudent ");
		
		List<Student> students = StudentRepo.getAllStudents();
		
		students.forEach(s -> {
			if(pred1.or(pred2).test(s)) {
				System.out.println(s);
			}
		});
	}
	
	public static void main(String args[]) {
		filterStudentBasedOnGrade();
		filterStudentByGpa();
		filterStudent();
	}
}
