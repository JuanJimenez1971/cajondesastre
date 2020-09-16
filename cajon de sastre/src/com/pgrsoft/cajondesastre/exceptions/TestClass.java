package com.pgrsoft.cajondesastre.exceptions;

public class TestClass {

	public static void main(String[] args)  {
		
		System.out.println("en main antes");
		
		try {
			new Foo().m1();
			
		} catch (Exception e) {
			
			System.out.println("Algo ha ido mal...");
		}
		
		System.out.println("en main despues");

	}

}
