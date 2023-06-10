package com.practice.java.terminalOperations;

import java.util.stream.Collectors;

import com.practice.java.dao.StudentRepo;

public class TerminalCounting {

	public static Long counting() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.counting());
	}
	
	public static Long counting_1() {
		return StudentRepo.getAllStudents().stream().filter(student -> student.getGpa()>=3.9).collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		System.out.println("Counting "+counting());
		
		System.out.println("counting "+counting_1());
	}
}
