package com.pgrsoft.cajondesastre.interfacesfuncionales;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestClass {
	
	

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("Honorio","Pep�n","Ana","Jos� Ram�n");
		
		// 1.- Vamos a crear una implementaci�n "con nombre" del interface Comparator<String>
		
		// Collections.sort(nombres, new CompardorString());
		
		// 2.- Vamos a definir una varible de tipo Comparator<String> y la vamos a implentar "donde estamos"
		
		Comparator<String> miComparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		
		//Collections.sort(nombres, miComparator);
		
		// 3.- Vamos "directamente" a implementar un Comparator<String> de forma an�nima (usar y tirar)
		
		Collections.sort(nombres, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		
		// 4.- Vamos a implementar el Comparator<String> utilizando una lambda
		
		Collections.sort(nombres, (s1, s2) -> s1.length() - s2.length());
			
	
		System.out.println(nombres);
		
		
		
	
		Collections.sort(nombres, (s1,s2) -> s1.length() - s2.length());
		
		Comparator<String> miComparador = (s1,s2) -> s1.length() - s2.length();
		
		
		
	}

}
