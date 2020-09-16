package com.pgrsoft.cajondesastre.exceptions;

public class Foo {

	void m1() throws Exception {
		System.out.println("m1 antes de invocar a m2");
		m2();
		System.out.println("m1 despues de invocar a m2");
	}
	
	void m2() throws Exception{
		System.out.println("m2 antes de invocar a m3");
		m3();
		System.out.println("m2 despues de invocar a m3");
	}
	
	// método que accede al sistema de archivos y que algo va a ir mal
	void m3() throws Exception {
		
		//throw new ArithmeticException("división por cero..."); // IS-A RuntimeException
		
		if (true) {
			throw new Exception("algo ha ido mal..."); // is una checked exception
		} else {
			System.out.println("m3");
		}	
	}
	
}
