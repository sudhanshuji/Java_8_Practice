package com.modernjava.functionalprogramming;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {
	public abstract Instructor getInstructor(String name,int yesrOfExp,String title,
			String gender, boolean onlineCours, List<String> courses);
}
