package com.isotrol.hibernate.modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_EMPLEADO")
	private Long codigo;

	@Column(name = "APELLIDO")
	private String apellido;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "FECHA_NACIMIENTO")
	private java.util.Date fechaNacimiento;
	
	@OneToOne (cascade = {CascadeType.ALL})
	@JoinColumn(name ="ID_DIRECCION" )
	private Direccion direccion;

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Empleado() {
	}

	public Empleado(Long codigo, String apellido, String nombre, java.util.Date fechaNacimiento) {
		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public java.util.Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + "]";
	}

}
