package com.practice.java.dao;

import java.util.Arrays;
import java.util.List;

public class StudentRepo {

	public static List<Student> getAllStudents(){
		
		Student s1 = new Student("Adam",2,3.6,"male",Arrays.asList("Swimming","basketball"));
		Student s2 = new Student("Jenny",2,3.8,"female",Arrays.asList("football","basketball"));
		
		Student s3 = new Student("Emily",3,4.0,"female",Arrays.asList("aerobics","basketball"));
		Student s4 = new Student("Dave",3,3.9,"male",Arrays.asList("Swimming","soccer"));
		
		Student s5 = new Student("Sophia",4,3.5,"female",Arrays.asList("dancing","aerobics"));
		Student s6 = new Student("James",4,3.9,"male",Arrays.asList("Swimming","basketball"));
		
		return Arrays.asList(s1,s2,s3,s4,s5,s6);
	}
}
