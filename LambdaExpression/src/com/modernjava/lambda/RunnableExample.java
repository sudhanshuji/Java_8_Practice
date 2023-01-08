package com.modernjava.lambda;

public class RunnableExample {
	public static void main(String[] args) {
		
	
	//Runnable traditional example
	Runnable runnableObj = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int sum = 0;
			for (int i=0;i<10;i++) {
				sum += i;
			}
			System.out.println("Traditional "+sum);
		}
	};
	   new Thread(runnableObj).start();
	   
	   
	   //implement using lambda
	   Runnable runnableObj1 = ()->{
		   int sum=0;
		   for (int i=0;i<10;i++)
			   sum+=i;
		   System.out.println("Runnable Lambda : "+sum);
	   };
	   new Thread(runnableObj1).start();
	   
	   
	   
	   //implemet using thread with lambda
	   new Thread(()->{
		   int sum=0;
		   for (int i=0;i<10;i++)
			   sum+=i;
		   System.out.println("Thread Lambda : "+sum);
	   }).start();
	}
	
	
	
}
