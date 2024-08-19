package com.ExceptionHandling;

	public class ExceptionHandlingExample {
	int x=10;
	
	public void m1() {
		System.out.println("Value pf x is : "+x);
	}

	public static void main(String[] args) {
		
		ExceptionHandlingExample obj = new ExceptionHandlingExample();
		obj.m1();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
