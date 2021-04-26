package com.springTest.beans;

import java.util.List;

public class Pais {

	private String nombre;
	private List<Ciudad> ciudades;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
}
