package com.practice.java.revision;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RevisionStreams {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("Geek_First", "Geek_2", "Geek_2" ,"Geek_3", "Geek_4", "Geek_Last");
		System.out.println(li.stream().findFirst().get());
		
		System.out.println(li.stream().reduce((first,second)->first).orElse(null));
		
		System.out.println(li.stream().reduce((first,second)->second).orElse(null));
		
		System.out.println(li.stream().skip(li.size()-1).findFirst().orElse(null));
		
		Set<String> set = new HashSet<>();
		
		System.out.println(li.stream().filter(i->!set.add(i)).collect(Collectors.toSet()));
		
		System.out.println( li.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(item -> item.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList()));
		
		System.out.println(li.stream().filter(i->Collections.frequency(li, i)>1).collect(Collectors.toSet()));
		
		char ch = 'e';
		
		String str = "geeksforgeeks";
		
		System.out.println(str.chars().filter(i->i==ch).count());
		
		Stream.of(1,2,3,5,6,7);
		
		int[] arr = {1,2};
		
		Arrays.stream(arr);
		
		Stream<Integer> stream = Stream.iterate(1, (Integer n)->(n*n)).limit(10);
		
		Stream.generate(Math::random).limit(10);
		
		Stream.of(1,2,3,5,6,7).collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return list.stream();
		})).forEach(System.out::print);
		
		Set<String> set1 = new HashSet<>();
		
		System.out.println(li.stream().filter(i->!set1.add(i)).collect(Collectors.toSet()));
		
		System.out.println(li.stream().filter(i->Collections.frequency(li,i)>1).collect(Collectors.toSet()));
		
		List<Integer> li1 = Arrays.asList(1,2,3,4,5);
		
		li1.stream().collect(Collectors.collectingAndThen(Collectors.toList(), i -> {
			Collections.reverse(li1);
			return li1.stream();
		})).forEach(System.out::print);
		
//		DoubleStream.iterate(1, (i->i+1)).forEach(System.out::println);
		
//		DoubleStream.generate(Math::random).forEach(System.out::println);
		
//		IntStream.iterate(0, (i->i+1)).forEach(System.out::println);
		
//		IntStream.generate(()->{Random r = new Random(); return r.nextInt();}).forEach(System.out::println);
		
		IntStream.range(0,li.size()).mapToObj(ind->String.format("%d -> %b", ind,li.get(ind))).forEach(System.out::println);
		
		AtomicInteger at = new AtomicInteger();
		
		li.stream().map(st->at.getAndIncrement()+"->"+st).forEach(System.out::println);
		
	}
}
