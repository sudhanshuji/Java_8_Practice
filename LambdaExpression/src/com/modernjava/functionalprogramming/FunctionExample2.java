package com.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {

	public static void main(String[] args) {
		
		Predicate<Instructor> p1 = (p) -> p.isOnlineCoourses();
		//map of instructors with name and experience
		
		//Function which will take a list of instructors and returns a Map<String,Integer> 
		Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructors -> {
			Map<String, Integer> map = new HashMap<>();
			
			instructors.forEach(instructor -> {
				if (p1.test(instructor))
					map.put(instructor.getName(), instructor.getYearsOfExperience());
			});
	return map;
	});
		
		System.out.println(mapFunction.apply(Instructors.getAll()));
		
		
		

  }
}

