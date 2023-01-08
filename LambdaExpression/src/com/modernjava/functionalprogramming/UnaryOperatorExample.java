package com.modernjava.functionalprogramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> unary = i -> i*10;
		System.out.println(unary.apply(100));
		
		Function<Integer, Integer> function = i-> i*10;
		System.out.println(function.apply(100));
		
		
//		note -: Unary operator is used only when the value
//		which is getting returned is of the same type as the 
//		argument then use unary operator instead of function
		
		IntUnaryOperator intUnaryOperator = i->i*10;
		System.out.println(intUnaryOperator.applyAsInt(100));
		
		
		LongUnaryOperator longUnaryOperator = i-> i*10;
		System.out.println(longUnaryOperator.applyAsLong(100000000000L));
		
		DoubleUnaryOperator doubleUnaryOperator = i-> i*10;
		System.out.println(doubleUnaryOperator.applyAsDouble(2000.000));
	}

}
