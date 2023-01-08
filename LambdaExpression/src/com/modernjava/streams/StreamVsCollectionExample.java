package com.modernjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
	public static void main(String[] args) {
		List<String> names =new ArrayList<String>();
		names.add("Mike");
		names.add("Sayed");
		names.add("Rajeev");
		
		System.out.println("-----");
		
		System.out.println(names);
		
		names.remove("Sayed");
		System.out.println("-----------");
		
		System.out.println(names);
		
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println("-----");
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println("-----");
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println("-----");
		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
		System.out.println("-----");
//		namesStream.forEach(System.out::println); will give error 
//		Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		List<String> list2 = names.stream().filter(s->s.startsWith("M"))
				.collect(Collectors.toList());
		
		System.out.println(list2);
		
		
		
		
	}
}
