package com.practice.java.consumers;

import java.util.List;
import java.util.function.Consumer;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class ConsumerExample {

	
	public static Consumer<Student> cons1 = (st) -> System.out.println(st);
	
	public static Consumer<Student> cons2 = (st) -> System.out.print(st.getName());
	
	public static Consumer<Student> cons3 = (st) -> System.out.println(st.getActivities());
	
	public static void printName() {
		List<Student> data = StudentRepo.getAllStudents();
		data.forEach(cons1);
	}
	
	public static void printNameAndActivities() {
		StudentRepo.getAllStudents().forEach(cons2.andThen(cons3));
	}
	
	public static void printNameAndActivityWithCond() {
		StudentRepo.getAllStudents().forEach(st->
		{
			if(st.getGradeLevel()>3) {
				cons2.andThen(cons3).accept(st);
			}
		});
	}
	
	
	public static void main(String[] args) {
//		printName();
//		printNameAndActivities();
		printNameAndActivityWithCond();
	}
}
