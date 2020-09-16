package com.pgrsoft.cajondesastre.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("Ana","Honorio","Pepín","Carlota");
		
		List<Integer> numeros = nombres.stream()
				.filter(x -> x.length() > 3)
				.map(x -> x.length())
				.collect(Collectors.toList());
		
		System.out.println(numeros);
		
		List<Integer> numeros2 = new ArrayList<>();
		
		for(String nombre: nombres) {
			if (nombre.length() > 3) {
				numeros2.add(nombre.length());
			}
		}
		
		System.out.println(numeros2);
		
		nombres.stream()
			.filter(x -> x.length() > 3)
			.map(x -> x.length())
			.forEach(x -> System.out.println(x));
		
		
		Optional<String> optional1 = Optional.of("xxxx");
		
		String valor = optional1.get();  // OJO! Lanza Exception si no hay elemento
		
		String valor2 = optional1.isPresent() ? optional1.get() : "xxxxx";
		
		if(!optional1.isPresent()) {
			//TODO
		}

	}
	
	

	
	
	

	

}
