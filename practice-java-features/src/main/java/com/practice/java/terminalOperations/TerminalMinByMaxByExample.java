package com.practice.java.terminalOperations;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class TerminalMinByMaxByExample {

	public static Optional<Student> minByGpa() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxByGpa() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static void main(String[] args) {
		
		System.out.println(minByGpa().get());
		
		System.out.println(maxByGpa().get());
		
	}
}
