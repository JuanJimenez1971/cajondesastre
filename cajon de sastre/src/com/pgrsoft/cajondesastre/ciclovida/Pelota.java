package com.pgrsoft.cajondesastre.ciclovida;

import java.util.HashMap;
import java.util.Map;

public class Pelota {

	static String nombreLatin;
	static Map<Integer,String> mapa = new HashMap<>();
	
	// Os presento el inicializador estático...
	
	static {
		System.out.println("el primer static");
	}
	
	{
		System.out.println("bloque pululante 1");
	}
	
	static {
		nombreLatin = "Balon";
		System.out.println("el segundo static...");
	}
	
	double peso = 10.0;
	double radio;
	
	{
		System.out.println("bloque pululante 2");
	}
	
	public Pelota() {
		System.out.println("Pelota en fase de construcción");
	}
	
	static {
		System.out.println("el tercer static");
	}
	
}
