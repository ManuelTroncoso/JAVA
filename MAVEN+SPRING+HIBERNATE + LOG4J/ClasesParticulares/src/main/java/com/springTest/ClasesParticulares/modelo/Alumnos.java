package com.springTest.ClasesParticulares.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALUMNOS")
public class Alumnos {

	@Id
	@Column(name = "ID_ALUMNO")
	private Long Id;

	@Column(name = "NOMBRE")
	private String Nombre;

	@Column(name = "APELLIDO")
	private String Apellido;

	public Alumnos() {
	}

	public Alumnos(Long id, String nombre, String apellido) {
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

}
