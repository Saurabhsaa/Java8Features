package com.practice.java.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class LocalDateExample {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld1 = LocalDate.of(1997, 4, 16);
		System.out.println(ld1);
		
		LocalDate ld2 = LocalDate.ofYearDay(1997, 360);
		System.out.println(ld2);
		
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.get(ChronoField.DAY_OF_MONTH));
		
		//modify local date
		
		System.out.println(ld.plusDays(2));
		System.out.println(ld.plusMonths(2));
		System.out.println(ld.minusDays(3));
		
		System.out.println(ld.withYear(1997));

		System.out.println(ld.with(TemporalAdjusters.firstDayOfMonth()));
		
		System.out.println(ld.minus(1,ChronoUnit.YEARS));
		
		//other methods 
		System.out.println(ld.isLeapYear());
		System.out.println(LocalDate.ofYearDay(2020, 01).isLeapYear());
		System.out.println(ld.equals(ld1));
		System.out.println(ld.isBefore(ld1));
		System.out.println(ld.isAfter(ld1));
		
		//unsupported 
		
//		System.out.println(ld.minus(1,ChronoUnit.MINUTES));
		//how to verify which all units are supported and which are not
		System.out.println("isSupported : "+ld.isSupported(ChronoUnit.MINUTES));
		
		System.out.println("isSupported : "+ld.isSupported(ChronoUnit.YEARS));
		
	}
}
