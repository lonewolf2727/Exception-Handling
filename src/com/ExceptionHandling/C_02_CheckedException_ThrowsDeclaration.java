package com.ExceptionHandling;

public class C_02_CheckedException_ThrowsDeclaration {
		      int x = 12;
		      public void m1() {
		  		System.out.println("Value of a is: " +x);
		  	}
			public static void main(String[] args) throws InterruptedException {
				C_02_CheckedException_ThrowsDeclaration obj = new C_02_CheckedException_ThrowsDeclaration();
				obj.m1();
				Thread.sleep(0);		

	}

}
