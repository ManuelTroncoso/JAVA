package com.springTest.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {

	//Solamente para cuando sea el paquete de AppConfig ya que es al unico que no le hemos añadido un valor por defecto
	@Value("Hola mundo!")
	private String saludo;
	
	public String getSaludo() {
		return saludo;
	}
	
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
