package com.practice.java.dao;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentRepo {
	
	public static Supplier<Student> supplier = () -> (new Student("Adam",2,3.6,"male",Arrays.asList("Swimming","basketball"),10));

	public static List<Student> getAllStudents(){
		
		Student s1 = new Student("Adam",2,3.6,"male",Arrays.asList("Swimming","basketball"),11);
		Student s2 = new Student("Jenny",2,3.8,"female",Arrays.asList("football","basketball"),12);
		
		Student s3 = new Student("Emily",3,4.0,"female",Arrays.asList("aerobics","basketball"),16);
		Student s4 = new Student("Dave",3,3.9,"male",Arrays.asList("Swimming","soccer"),10);
		
		Student s5 = new Student("Sophia",4,3.5,"female",Arrays.asList("dancing","aerobics"),5);
		Student s6 = new Student("James",4,3.9,"male",Arrays.asList("Swimming","basketball"),7);
		
		return Arrays.asList(s1,s2,s3,s4,s5,s6);
	}
}
