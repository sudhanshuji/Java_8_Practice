
package com.modernjava.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = (x)->System.out.println(x.length()+"the value of x is : "+x);
		c.accept("Up in the air");
		
		
		//consumer with blocj=k statement
		
		Consumer<Integer> d = (x)->{
			System.out.println("x*x = "+x*x);
			System.out.println("x/x = "+x/x);
			
		};
		d.accept(10);
	}

}
