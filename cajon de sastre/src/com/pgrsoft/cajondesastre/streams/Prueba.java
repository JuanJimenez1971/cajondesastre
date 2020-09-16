package com.pgrsoft.cajondesastre.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Prueba {

	public static void main(String[] args) {

		List<String> valores = Arrays.asList("uno", "dos", "tres");

		/**
		 * customers.forEach(customer -> { if (customer.getAge() > 25) {
		 * System.out.println(customer); } });
		 */

		valores.forEach((name) -> {
			if (name.equals("dos")) {
				System.out.println(name);
			}
		});
		
		
		valores.forEach(numero->{
			System.out.println(numero.length());
		});
			
		
		System.out.println(valores.stream().count());
		
		valores.forEach(numero->{
			System.out.println(numero);
		});
	}
}
