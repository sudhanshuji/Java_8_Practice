package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		// All instructor who teaches online

		Predicate<Instructor> p1 = (i) -> i.isOnlineCoourses() == true;

		// instructor with experience more than 10 years
		Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

		List<Instructor> instructors = Instructors.getAll();
		
		instructors.forEach((instructor) -> {
			if (p1.test(instructor)) {
				System.out.println(instructor);
			}
		});

		
		System.out.println("----------------------");
		instructors.forEach((instructor) -> {
			if (p1.and(p2).test(instructor)) {
				System.out.println(instructor);
			}
		});

	}

}
