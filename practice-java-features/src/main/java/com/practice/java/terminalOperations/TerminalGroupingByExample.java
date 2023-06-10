package com.practice.java.terminalOperations;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class TerminalGroupingByExample {
	
	public static Map<String, List<Student>> groupingByGender() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
	}

	public static Map<String, List<Student>> goupingByCustome() {
		return StudentRepo.getAllStudents().stream()
				.collect(Collectors.groupingBy(i -> i.getGpa() >= 3.9 ? "OUTSTANDING" : "AVERAGE"));
	}
	
	public static Map<String, Map<Object, List<Student>>> twoLevelGrouping() {
		 return StudentRepo.getAllStudents().stream().collect(
		 Collectors.groupingBy(Student::getGender, Collectors.groupingBy(i ->
		 i.getGpa()>3.9 ? "OUT" : "AVG")));
//		return StudentRepo.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender, TreeMap::new,
//				Collectors.groupingBy(Student::getGradeLevel, TreeMap::new, Collectors.toList())));
	}

	public static Map<Integer, Integer> twoLevelGrouping_1() {
		return StudentRepo.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(i -> i.getBooks())));
	}
	
	public static TreeMap<String, Integer> threeArgGroupingBy() {
		return StudentRepo.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGender, TreeMap::new, Collectors.summingInt(i -> i.getBooks())));
	}
	
	//student is returned in optional 
	public static Map<Integer, Optional<Student>> groupingAndCollectingAndThen() {
		return StudentRepo.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(i->i.getGpa()))));
	}
	
	//avoid returning student in optional
	
	public static Map<Integer, Student> groupingAndCollectingAndThen_1() {
		return StudentRepo.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(i -> i.getGpa())), Optional::get)));

	}
	
	public static void main(String[] args) {
//		System.out.println(groupingByGender());

//		System.out.println(goupingByCustome());
		
		System.out.println(twoLevelGrouping());
		
		System.out.println(twoLevelGrouping_1());
		
//		System.out.println(threeArgGroupingBy());
		
//		System.out.println(groupingAndCollectingAndThen());
	
//		System.out.println(groupingAndCollectingAndThen_1());
	}
	
}
