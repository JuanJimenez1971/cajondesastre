package com.pgrsoft.cajondesastre.fecha;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass {

	public static void main(String[] args) throws Exception {
		
		Date fecha1 = new Date();
		
		System.out.println(fecha1);
		
		// 9/4/1986
		
		// milisegundos transcurridos desde 1/1/1970
		
		Date fecha2 = new Date(248883452900L);
		
		System.out.println(fecha2);
		
		// Normalmente partimos de un String
		
		String strFecha = "55/13/1999 26:21:65";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date fecha3 = sdf.parse(strFecha);
		
		System.out.println(fecha3);
		
		System.out.println(sdf.format(new Date()));
		
		
		
		
	}
}
