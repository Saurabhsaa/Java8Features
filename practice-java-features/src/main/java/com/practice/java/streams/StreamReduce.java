package com.practice.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.practice.java.dao.Student;
import com.practice.java.dao.StudentRepo;

public class StreamReduce {

	public static int performMultiPlication(List<Integer> integerList) {
		return integerList.stream()
		//2,3,1,5		
		//a=1,b=2 -> 2
		//a=2,b=3 -> 6
		//a=6,b=1 -> 6
		//a=6,b=5 -> 30
		.reduce(1,(a,b)->a*b);
	}
	
	public static Optional<Integer> performMultiPlicationWithOutIdenfication(List<Integer> integerList){
		return integerList.stream()
		.reduce((a,b)->a*b);
	}
	
	public static Optional<Student> getHigestGPAStudent(List<Student> listStudent){
		
//		return listStudent.stream()
//				.reduce((s1,s2) -> {
//					if(s1.getGpa()>s2.getGpa()) {
//						return s1;
//					}
//					else {
//						return s2;
//					}
//				});
		
		//optimized code
		return listStudent.stream()
				.reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);

	}
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(2,3,1,5);
		
		System.out.println(performMultiPlication(integerList));
		
		Optional<Integer> optional =  performMultiPlicationWithOutIdenfication(integerList);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		Optional<Student> optionalStudent = getHigestGPAStudent(StudentRepo.getAllStudents());
		if(optionalStudent.isPresent()) {
			System.out.println(optionalStudent.get());
		}
		
	}
}
