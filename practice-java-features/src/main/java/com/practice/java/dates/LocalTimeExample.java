package com.practice.java.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime lt1 = LocalTime.of(23,23);
		System.out.println(lt1);
		
		LocalTime lt2 = LocalTime.of(23, 33,33);
		System.out.println(lt2);
		
		LocalTime lt3 = LocalTime.of(1, 1, 45, 193839);
		System.out.println(lt3);
		
		//getting values from local time instance
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.get(ChronoField.CLOCK_HOUR_OF_DAY));
		//current time in seconds
		System.out.println(lt.toSecondOfDay());
		
		//modify localtime
		System.out.println(lt.minusHours(2));
		System.out.println(lt.minus(2,ChronoUnit.HOURS));
		System.out.println(lt.with(LocalTime.MIDNIGHT));
		System.out.println(lt.with(ChronoField.HOUR_OF_DAY , 16)); 
		System.out.println(lt.plusMinutes(2)); 
		
		System.out.println(lt.withHour(5));
		
	}
}
