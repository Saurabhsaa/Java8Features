package com.practice.java.methodReference;

import java.util.function.Predicate;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class MethRefExplPredicate {

	static Predicate<Student> pred = (s) -> (s.getGradeLevel()>=3);
	
	static Predicate<Student> predMethodRef = MethRefExplPredicate::predLogicImpl;
	
	public static Boolean predLogicImpl(Student s) {
		return s.getGradeLevel()>=3;
	}
	
	public static void main(String[] args) {
		System.out.println(pred.test(StudentRepo.supplier.get()));
		
		
	}
}
