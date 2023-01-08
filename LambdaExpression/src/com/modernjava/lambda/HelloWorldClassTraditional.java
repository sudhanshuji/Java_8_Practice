package com.modernjava.lambda;

public class HelloWorldClassTraditional implements HelloWorldIntreface {

	
	public static void main(String[] args) {
		HelloWorldIntreface helloObject = new HelloWorldClassTraditional();
		System.out.println(helloObject.sayHelloWorld());
	}
	
	@Override
	public String sayHelloWorld() {
		return "Hello World!!";
	}
	

}
