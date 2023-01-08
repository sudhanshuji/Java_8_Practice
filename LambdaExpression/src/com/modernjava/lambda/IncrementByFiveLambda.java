package com.modernjava.lambda;

public class IncrementByFiveLambda {
	public static void main(String[] args) {
		IncrementByFive incrementByFiveInterfaceObj = (x)->x+5;
		
		System.out.println(incrementByFiveInterfaceObj.IncrementByFive(2));
	}
}
