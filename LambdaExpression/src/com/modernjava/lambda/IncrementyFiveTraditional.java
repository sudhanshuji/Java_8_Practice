package com.modernjava.lambda;

public class IncrementyFiveTraditional implements IncrementByFive {

	@Override
	public int IncrementByFive(int a) {
		// TODO Auto-generated method stub
		return a+5;
	}
	
	public static void main(String[] args) {
		IncrementByFive incrementByFiveObj= new IncrementyFiveTraditional();
		System.out.println(incrementByFiveObj.IncrementByFive(4));
	}

}
