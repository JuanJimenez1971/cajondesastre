package com.pgrsoft.cajondesastre.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.pgrsoft.cajondesastre.pojos.Perro;

public class TestClass2 {

	public static void main(String[] args) {
		
		List<Perro> perros = new ArrayList<>();
		
		perros.add(new Perro(10,"perroC"));
		perros.add(new Perro(15,"perroB"));
		perros.add(new Perro(12,"perroZ"));
		perros.add(new Perro(11,"perroA"));
		
		System.out.println(perros);
		
		// Quiero ordenar esta lista según el orden natural de la clase Perro
		// Para que esto sea posible, la clase Perro debe tener orden natural. Tiene que ser un Comparable

		Collections.sort(perros);
		
		System.out.println(perros);
		
		Collections.shuffle(perros);
		
		System.out.println(perros);
		
		// Vamos a ordenar en base a un nuevo criterio de ordenación
		
	//	Collections.sort(perros, new ComparadorPerroPorNombreDescendente());
		
		
		
		Collections.sort(perros, new Comparator<Perro>() {

			@Override
			public int compare(Perro o1, Perro o2) {
				
				return o2.getNombre().compareTo(o1.getNombre());
			}
			
		});
		
		System.out.println(perros);
	}

}
