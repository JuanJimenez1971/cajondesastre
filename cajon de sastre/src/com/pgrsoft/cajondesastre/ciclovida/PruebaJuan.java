package com.pgrsoft.cajondesastre.ciclovida;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PruebaJuan {

	public static void main(String[] args) {
		
		
		List<String> nombres = Arrays.asList("AHonorio","Pepín","Zna","José Ramón");
		Collections.sort(nombres, (s1, s2) -> s1.length() - s2.length());
		
		
		System.out.println(nombres);
		
		nombres.stream()
        .filter(x -> x.length() == 3)      
        .forEach(System.out::println);

	}

}
