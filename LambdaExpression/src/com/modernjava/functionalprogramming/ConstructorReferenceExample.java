package com.modernjava.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		InstructorFactory instructorFactory = Instructor::new;
		List<String> courses = new ArrayList<String>();
		courses.add("Java Programming");
		courses.add("C++ Programming");
		courses.add("Python Programming");
		Instructor instructor = instructorFactory.getInstructor("Mike", 10, "Software Developer", "M", true, courses);
		
		System.out.println(instructor);
	}

}
