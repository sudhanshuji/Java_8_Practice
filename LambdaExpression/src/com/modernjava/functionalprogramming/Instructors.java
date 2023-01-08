package com.modernjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	public static List<Instructor> getAll(){
		Instructor instructor1 = new Instructor("Mike", 10, "Software developer", 
				"M", true, Arrays.asList("Java Programing","C++ Programing","Python Programing"));
		
		Instructor instructor2 = new Instructor("Jenny", 5, "Engineer", 
				"F", false, Arrays.asList("Multi-Threaded Programing","CICD","Unit Testing"));
		Instructor instructor3 = new Instructor("Gene", 6, "Manager", 
				"M", false, Arrays.asList("C Programing","C++ Programing","React Native"));
		Instructor instructor4 = new Instructor("Anthony", 15, "Senior developer", 
				"M", true, Arrays.asList("Java Programing","Angular Programing","Rest Programing"));
		Instructor instructor5 = new Instructor("Sayed", 12, "Priincipal engineer", 
				"M", true, Arrays.asList("HTML Programing","Angular Programing","Python Programing"));
		
		List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
		return list;
	}
}
