package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
	public static void main(String[] args) {

		List<Instructor> instructors = Instructors.getAll();

		// print out the name and gender of instructors

		BiConsumer<String, String> biConsumer = (name, gender) -> System.out
				.println("Name is " + name + " and Gender is " + gender);
		instructors.forEach((instructor) -> biConsumer.accept(instructor.getName(), instructor.getGender()));
		
		System.out.println("----------------------------------");
		
		
		// Print out names and list of courses
		BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out
				.println("Name is " + name + " courses : "+courses);
		instructors.forEach((instructor)->{
			biConsumer1.accept(instructor.getName(), instructor.getCourses());
		});
		
		System.out.println("---------------------------");
		
		//print out name and gender of all instructor who teaches online
		BiConsumer<String, String> biConsumer2 = (name, gender) -> System.out
				.println("Name is " + name + " and Gender is " + gender);
		instructors.forEach((instructor) -> {
			if (instructor.isOnlineCoourses()) {
				biConsumer2.accept(instructor.getName(), instructor.getGender());
			}
		});
		
		
		
	}
}
