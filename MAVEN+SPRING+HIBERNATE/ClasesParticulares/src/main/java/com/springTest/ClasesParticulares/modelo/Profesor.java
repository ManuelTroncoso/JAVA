package com.springTest.ClasesParticulares.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Table(name = "PROFESOR")
public class Profesor {

	@Id
	@Column(name = "ID_ALUMNO")
	private Long Id;

	@Column(name = "NOMBRE")
	private String Nombre;

	@Column(name = "APELLIDO")
	private String Apellido;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ALUMNO")
	private List<Alumnos> Alumnos;

	public Profesor() {
	}

	public Profesor(Long id, String nombre, String apellido) {
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

	public List<Alumnos> getAlumnos() {
		return Alumnos;
	}

	public void setAlumnos(List<Alumnos> alumnos) {
		Alumnos = alumnos;
	}

}
