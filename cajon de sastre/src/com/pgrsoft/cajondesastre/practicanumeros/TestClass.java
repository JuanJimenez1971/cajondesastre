package com.pgrsoft.cajondesastre.practicanumeros;

public class TestClass {

	public static void main(String[] args) {
		
		NumberFormatter numberFormatter = new NumberFormatterImpl();

		for(int i = 0; i < 1000; i++) {
			System.out.println(i + ": " + numberFormatter.format(i));
		}

	
	}
	
}