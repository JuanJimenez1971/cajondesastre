package com.pgrsoft.cajondesastre.operadorternario;

public class TestClass {

	public static void main(String[] args) {
		
		double nota = 7.2;
		String resultado = null;
	/*	
		if (nota >= 5) {
			resultado = "APTO";
		} else {
			resultado = "NO APTO";
		}
	*/
		resultado = true ? "APTO" : "NO APTO";
		
		System.out.println(resultado);
	}

}
