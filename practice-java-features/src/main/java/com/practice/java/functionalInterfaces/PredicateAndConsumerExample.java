package com.practice.java.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class PredicateAndConsumerExample {

	Predicate<Student> pred1 = (s) -> s.getGradeLevel() >= 3;
	
	Predicate<Student> pred2 = (s) -> s.getGpa() >= 3.9;
	
	BiPredicate<Integer,Double> biPred1 = (grade,gpa) -> grade>=3 && gpa>=3.9;
	
	BiConsumer<String,List<String>> biConsum = (s,ac) -> System.out.println(s+" "+ac);
	
	Consumer<Student> cons = s -> {
		if(pred1.and(pred2).test(s)) {
			biConsum.accept(s.getName(), s.getActivities());
		}
		if(biPred1.test(s.getGradeLevel(),s.getGpa())) {
			biConsum.accept(s.getName(), s.getActivities());
		}
	};
	
	public void filterStudent() {
		List<Student> students = StudentRepo.getAllStudents();
		students.forEach(cons);	
//		students.forEach(s -> cons.accept(s));
	}
	
	public static void main(String[] args) {
		new PredicateAndConsumerExample().filterStudent();
	}
}
