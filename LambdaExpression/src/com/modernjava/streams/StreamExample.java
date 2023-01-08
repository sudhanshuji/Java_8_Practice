package com.modernjava.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.InstructorFactory;
import com.modernjava.functionalprogramming.Instructors;

public class StreamExample {

	public static void main(String[] args) {
		//creating a map of names and courses of instructor who teaches
//		 online and have exp >10
		Predicate<Instructor> p1 =(i)->i.getYearsOfExperience()>10;
		Predicate<Instructor> p2 =(i)->i.isOnlineCoourses();
		
		List<Instructor> list = Instructors.getAll();
		
		Map<String, List<String>> map = list.stream()
				.filter(p2)
				.filter(p1)
				.peek(s->System.out.println(s))
				.collect(Collectors.toMap(Instructor::getName,Instructor::getCourses));
		System.out.println(map);
	}
}
