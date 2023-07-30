package com.practice.java.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class TerminalPartitionByExample {
	
	static Predicate<Student> pred = i -> i.getGpa()>=3.9;

	public static Map<Boolean, List<Student>> partitionByGpa() {
		return StudentRepo.getAllStudents().stream()
		.collect(Collectors.partitioningBy(pred));
	}
	
	public static Map<Boolean, Set<Student>> partitionByGpa_1() {
		return StudentRepo.getAllStudents().stream()
		.collect(Collectors.partitioningBy(pred,Collectors.toSet()));
	}
	
	public static void main(String[] args) {
		System.out.println(partitionByGpa());
		
		System.out.println(partitionByGpa_1());
	}
}
