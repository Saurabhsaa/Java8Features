package com.practice.java.terminalOperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class TerminalMappingExample {

	public static List<String> mapToList() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList()));
	}
	
	public static Set<String> mapToSet() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toSet()));
	}
	
	public static void main(String[] args) {
		System.out.println(mapToList());
		
		System.out.println(mapToSet());
	}
}
