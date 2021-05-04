package com.example.demo.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONA")
public class TPersona implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "ID")
	private int id;
	@Column (name = "NOMBRE")
	private String nombre;
	@Column (name = "APELLIDO")
	private String apellido;

	
	public TPersona() {}
	
	public TPersona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "TPersona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}