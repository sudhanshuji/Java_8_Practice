package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiconsumerExample {

	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		
		// all instructor who teaches online
		Predicate<Instructor> p1 = (i)->i.isOnlineCoourses() == true;
		
		//instructor experience is greater than  10
		Predicate<Instructor> p2 = (i)->i.getYearsOfExperience()>10;
		
		
		//Biconsumer print name and courses
		BiConsumer<String, List<String>> b1 = (name,courses)->{
			System.out.println("name is :"+name+" courses : "+courses);
		};
		
		instructors.forEach((instructor)->{
			if(p1.and(p2).test(instructor)) {
				b1.accept(instructor.getName(), instructor.getCourses());
			}
		});
		

	}

}
