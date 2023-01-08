package com.modernjava.lambda;

public class ConcateStringLambda {

	public static void main(String[] args) {
		ConcateStringInterface concateStringLambdaObj =(a,b)->a+" "+b;
		System.out.println(concateStringLambdaObj.conetenateString("Hello", "World"));
	}

}
