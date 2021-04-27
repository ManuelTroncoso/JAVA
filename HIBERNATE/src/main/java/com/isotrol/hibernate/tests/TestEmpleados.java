package com.isotrol.hibernate.tests;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import com.isotrol.hibernate.modelo.Direccion;
import com.isotrol.hibernate.modelo.Empleado;

public class TestEmpleados {

	// Solo cuando se usa JavaEE se crearia asi el manager
	// @PersistenceContext(unitName = "Persistencia")
	public static EntityManager manager;

	// Solo cuando se usa JavaEE se crearia asi el manager
	// @PersistenceUnit(unitName = )

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

	public static void main(String[] args) {

		// Cuando no se usa JavaEE se crea de este modo el gestor de persistencia EM
		manager = emf.createEntityManager();
		// End cuando no se usa Java EE

		insertInicial();
		
		imprimirTodo();
		
		Empleado e = manager.find(Empleado.class, 10L);
		e.setNombre("David");
		e.setApellido("López");
		manager.getTransaction().commit();

		imprimirTodo();
		manager.close();
		
	}

	private static void insertInicial() 
	{
		Empleado e = new Empleado(10L, "Pérez", "Pepito", new Date(1979, 6, 6));
		e.setDireccion(new Direccion(15L, "Calle falsa, 123", "Springfield", "Springfield", "EEUU"));
		
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	private static void imprimirTodo() {
		List<Empleado> emps = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.println("Hay " + emps.size() + " empleados en el sistema");

		for (Empleado emp : emps) {
			System.out.println(emp.toString());
		}
	}

}
