package com.modernjava.lambda;

public class HelloWorldLambda {

	public static void main(String[] args) {
		// implementing sayHelloWorld using lambda
		HelloWorldIntreface helloWorldObj = ()-> "Hello World!!";
		System.out.println(helloWorldObj.sayHelloWorld()+"executed by Java");

	}

}
