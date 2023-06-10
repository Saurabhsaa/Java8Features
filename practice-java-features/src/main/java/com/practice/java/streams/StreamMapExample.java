package com.practice.java.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class StreamMapExample {

	public static List<String> getAllNamesList(){
		return StudentRepo.getAllStudents().stream()
		.map(Student::getName) // Stream<String> 
		.map(String::toUpperCase) //Stream<String>
 		.collect(Collectors.toList());
	}
	
	public static Set<String> getAllNamesSet(){
		return StudentRepo.getAllStudents().stream()
		.map(Student::getName) //Stream<String>
		.map(String::toUpperCase) //Stream<String>
		.collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		System.out.println(getAllNamesList());
		System.out.println(getAllNamesSet());
	}
}
