package com.practice.java.terminalOperations;

import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class TerminalJoiningExample {

	public static String joining_1() {
		return StudentRepo.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	}

	public static String joining_2() {
		return StudentRepo.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
	}

	public static String joining_3() {
		return StudentRepo.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-", "(", ")"));
	}
	
	public static void main(String[] args) {
		System.out.println("joining_1 : "+ joining_1());
		
		System.out.println("joining_2 : "+ joining_2());
		
		System.out.println("joining_3 : "+ joining_3());
	}
}
