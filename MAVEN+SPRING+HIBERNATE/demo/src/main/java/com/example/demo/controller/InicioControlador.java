package com.example.demo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TPersona;
import com.example.demo.services.ExampleService;

@RestController
public class InicioControlador {

	@Autowired
	public ExampleService cs;

	@RequestMapping("/example")
	public String InsertInicial() {
		TPersona p = new TPersona(0, "Pedro", "Jurado");
		
		this.cs.Save(p);

		List<TPersona> lp = (List<TPersona>) this.cs.FindAll();
		
		return  lp.get(0).toString();
	}
}
