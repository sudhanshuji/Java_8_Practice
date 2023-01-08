package com.modernjava.functionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Predicate<Instructor> p1 = (i)->i.isOnlineCoourses();
		Predicate<Instructor> p2 = Instructor::isOnlineCoourses;
		
		Function<Integer, Double> sqrt1 = n-> Math.sqrt(n);
		Function<Integer, Double> sqrt2 = Math::sqrt;
		
		Function<String, String> lowerCaseFunction1 = (s)->s.toLowerCase();
		Function<String, String> lowerCaseFunction2 = String::toLowerCase;
		
		
	}

}
