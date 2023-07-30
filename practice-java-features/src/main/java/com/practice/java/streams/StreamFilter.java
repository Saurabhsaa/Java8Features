package com.practice.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class StreamFilter {

	public static List<Student> filterStudent(){
		return StudentRepo.getAllStudents().stream()
		.filter(t -> t.getGender().equals("female"))
		.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		filterStudent().forEach(System.out::println);
	}
}
