package com.practice.java.streams;

import java.util.List;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class StreamDistinctCountExample {

	public static Long printStudentActivities(){
		return StudentRepo.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.count();
	}
	
	public static void main(String[] args) {
		System.out.println(printStudentActivities());
	}
}
