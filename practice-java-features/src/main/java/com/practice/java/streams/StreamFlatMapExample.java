package com.practice.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class StreamFlatMapExample {

	 public static List<String> printStudentActivities(){
		 return StudentRepo.getAllStudents().stream() //Stream<Students>
		 .map(Student::getActivities) //Stream<List<String>>
		 .flatMap(List::stream) //Stream<List<Strin>>
		 .distinct()
		 .collect(Collectors.toList());
	 }
	
	public static void main(String args[]) {
		System.out.println(printStudentActivities());
	}
}
