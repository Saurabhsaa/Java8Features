package com.practice.java.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
	
	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		LocalTime lt1 = LocalTime.of(5, 30);
		
		long diff = lt1.until(lt, ChronoUnit.MINUTES);
		System.out.println(diff);
		
		System.out.println(Duration.between(lt1, lt).toMinutes());
		
		Duration hrs = Duration.ofHours(3);
		System.out.println(hrs.toMinutes());
		
		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.of(2023, 1, 1);
//		System.out.println(Duration.between(ld, ld1).toDays());
		
		
	}
}
