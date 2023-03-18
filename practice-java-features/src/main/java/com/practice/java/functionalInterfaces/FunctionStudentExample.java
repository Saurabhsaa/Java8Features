package com.practice.java.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class FunctionStudentExample {

	static Function<List<Student>, Map<String,Double>> studFun = (students -> {
		Map<String,Double> studGradMap = new HashMap<>();
		students.forEach(student -> {
//			if(PredicateStudentExample.pred1.test(student))
				studGradMap.put(student.getName() , student.getGpa());
		});
		return studGradMap;
	});
	
	public static void main(String[] args) {
		System.out.println(studFun.apply(StudentRepo.getAllStudents()));
	}
	
}
