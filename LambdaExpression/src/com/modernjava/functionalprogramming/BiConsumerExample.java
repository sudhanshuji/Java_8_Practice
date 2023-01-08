package com.modernjava.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		// printing two numbers

		BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x = " + x + " Y = " + y);

		biConsumer.accept(2, 4);

		BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("Sum Of x and y is = "+(x+y));

		biConsumer1.accept(2, 4);
		
		//concatenate strings
		BiConsumer<String,String> biConsumer2 = (x, y) -> System.out.println("Concatenated Strings are "+(x+y));
		biConsumer2.accept("Hello ", "Java 8");;
		
	}
}
