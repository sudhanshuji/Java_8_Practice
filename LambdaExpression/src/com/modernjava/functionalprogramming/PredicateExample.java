package com.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// if number is greater than 10 then return true else false
		Predicate<Integer> p1 = (i) -> i > 10;
		System.out.println(p1.test(100));

		// t > 10 and number is even number
		Predicate<Integer> p2 = (i) -> i % 2 == 0;
		System.out.println(p1.and(p2).test(20));

		// i> 10 || number is even number
		System.out.println(p1.or(p2).test(3));

		// t > 0 and number is odd number
		System.out.println(p1.and(p2.negate()).test(33));

	}

}
