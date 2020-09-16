package com.pgrsoft.cajondesastre.pojos;

import java.io.Serializable;


public class Perro implements Serializable, Comparable<Perro> {
	private static final long serialVersionUID = -353445343L;
	
	private int codigo;   
	private String nombre;
	
	public Perro() {
		
	}

	public Perro(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public int compareTo(Perro otroPerro) {
		return  otroPerro.codigo - this.codigo;
	}

	@Override
	public String toString() {
		return "Perro [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

	
	
}
