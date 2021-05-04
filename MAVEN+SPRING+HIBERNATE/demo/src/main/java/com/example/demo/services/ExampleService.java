package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonaDAO;
import com.example.demo.entity.TPersona;

@Service
public class ExampleService {

	@Autowired
	private PersonaDAO pdao;
	
	public List<TPersona> FindAll() {
		//return this.pdao.getPersona();
		
		return this.pdao.findAll();
	}
	
	public void Save( TPersona Persona) {
//		this.pdao.addPersona(Id, Nombre, Apellido);
		
		this.pdao.save(Persona);
	}

}
