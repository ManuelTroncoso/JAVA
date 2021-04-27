package com.springTest.ClasesParticulares;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springTest.ClasesParticulares.modelo.Alumnos;
import com.springTest.ClasesParticulares.modelo.Profesor;

@Repository
public class App {

	public static EntityManager manager;
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

	public static void main(String[] args) {
		manager = emf.createEntityManager();
		InsertInicial();
	}

	@SuppressWarnings("unchecked")
	
	@Transactional
	public static void InsertInicial() {
		Profesor p = new Profesor(1L, "Pedro", "Jaen");
		
		List<Alumnos> alumnos = new ArrayList<Alumnos>();
		alumnos.add(new Alumnos(1L, "Jose", "Ruiz"));
		
		p.setAlumnos(alumnos);
		//manager.getTransaction().begin();
		manager.persist(p);
		//manager.getTransaction().commit();

		List<Profesor> emps = (List<Profesor>) manager.createQuery("FROM Profesor").getResultList();
		System.out.println("Hay " + emps.size() );

	}
}
