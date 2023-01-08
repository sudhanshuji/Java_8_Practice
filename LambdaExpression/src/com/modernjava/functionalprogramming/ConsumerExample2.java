package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
 public static void main(String[] args) {
	List<Instructor> instructors = Instructors.getAll();
	
	//looping out through all the constructor and printing out the value of constructor
	Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
	instructors.forEach(c1);
	
	System.out.println("---------------------");
	//looping out through all the constructor and printing out only their name
	Consumer<Instructor> c2 = (s1) -> System.out.print(s1.getName());
	instructors.forEach(c2);
	
	System.out.println("----------------------");
	//looping out through all the constructor and printing out their names and courses
	Consumer<Instructor> c3 = (s1) -> System.out.println(s1.getCourses());
	instructors.forEach(c2.andThen(c3));
	System.out.println("------------------------");
	//looping out through all the constructor and printing out their names if their experience is greater than 10
	Consumer<Instructor> c4 = (s1) -> {
		if (s1.getYearsOfExperience()>10)
			System.out.println(s1.getName());
	};
	instructors.forEach(c4);
	
	
	instructors.forEach((s1) -> {
		if (s1.getYearsOfExperience()>5 && s1.isOnlineCoourses())
			System.out.println(s1.getName());
	});
}
 
 
}
