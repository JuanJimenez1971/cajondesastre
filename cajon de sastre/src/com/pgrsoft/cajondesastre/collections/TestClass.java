package com.pgrsoft.cajondesastre.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.pgrsoft.cajondesastre.pojos.Perro;

public class TestClass {
	
	
	///cambio para rama prueba

	private static final Collection<String> NOMBRES = new TreeSet<>();
	private static final Collection<Integer> NUMEROS = new TreeSet<>();
	private static final Collection<Perro> PERROS = new TreeSet<>();
	private static final List<String> COMIDAS = new ArrayList<>();
	private static final Map<Integer,String> EQUIPOS = new LinkedHashMap<>();
	
	static {
		NOMBRES.add("Pepín");
		NOMBRES.add("Cristiano");
		NOMBRES.add("Honorio");
		NOMBRES.add("Anna");
		
		PERROS.add(new Perro(100,"Rufus"));
		PERROS.add(new Perro(50,"Baldrich"));
		
		COMIDAS.add("A");
		COMIDAS.add("Z");
		COMIDAS.add("R");
		
		EQUIPOS.put(100,"F.C. Barcelona");
		EQUIPOS.put(400,"Real Madrid");
		EQUIPOS.put(300,"Sevilla");
	}
	
	public static void main(String[] args) {
		
		// For Each
		
		for (String nombre: NOMBRES) {
			System.out.println(nombre);
		}
		
		
		// Iterador
		
		Iterator<String> iterador = NOMBRES.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		NUMEROS.add(102);
		NUMEROS.add(100);
		
		System.out.println(NUMEROS);
		System.out.println(PERROS);
		
		
		// Iterar un List cuando nos preocupa el índice...
		for(int i = 0; i < COMIDAS.size(); i++) {
			System.out.println("i:" + i + " " + COMIDAS.get(i));
		}
		
		// Vamos a iterar un mapa...
		
		Set<Integer> keys = EQUIPOS.keySet();
		
		for(Integer key: keys) {
			System.out.println(key + " " + EQUIPOS.get(key));
		}
		
		Collection<String> valores = EQUIPOS.values();
		System.out.println(valores);
		
		// Necesito la columna de la derecha del mapa en forma de List
		
		List<String> valores2 = new ArrayList<>(EQUIPOS.values());
		
		
		Collections.shuffle(valores2);
		
		
		System.out.println(valores2);
		
	}

}
