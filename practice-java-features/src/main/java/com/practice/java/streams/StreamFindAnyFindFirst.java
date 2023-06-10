package com.practice.java.streams;

import java.util.Optional;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class StreamFindAnyFindFirst {

	public static Optional<Student> findAny(){
		return StudentRepo.getAllStudents().stream()
		.filter(student->student.getGpa()>0.9)
		.findAny();
	}
	
	public static Optional<Student> findFirst(){
		return StudentRepo.getAllStudents().stream()
				.filter(student->student.getGpa()>3.9)
				.findFirst();
	}
	
	public static void main(String[] args) {
		
		//We can find the difference between findfirst and findany in parallel stream
		
		System.out.println("FindAny exe"+findAny().get());
		
		System.out.println("FindFirst exe"+findFirst().get());
	}
}
