package com.practice.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class StreamSortExample {

	public static List<Student> getAllStudentByName(){
		return StudentRepo.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	}
	
	public static List<Student> getAllStudentByGPA(){
		return StudentRepo.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(Collectors.toList());
	}
	
	public static List<Student> getAllStudentByGPADesc(){
		return StudentRepo.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println("Student details sorted by NAME");
		getAllStudentByName().forEach(System.out::println);
		
		System.out.println("Student details sorted by GPA");
		getAllStudentByGPA().forEach(System.out::println);
		
		System.out.println("Student details sorted by GPA desc");
		getAllStudentByGPADesc().forEach(System.out::println);
	}
}
