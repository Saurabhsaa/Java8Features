package com.practice.java.terminalOperations;

import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class TerminalSumminAndAveraging {

	public static int sum() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.summingInt(Student::getBooks));
	}
	
	public static double average() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.averagingInt(Student::getBooks));
	}
	
	public static void main(String[] args) {
		System.out.println(sum());
		
		System.out.println(average());
	}
}
