package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.TPersona;
import com.example.demo.services.ExampleService;

@RestController
public class InicioControlador {

	@Autowired
	public ExampleService cs;
	public int i = 0;
//	private static final Logger LOGGER = LogManager.getLogger(InicioControlador.class.getName());

	@RequestMapping("/addUser")
	public ModelAndView Index(@RequestParam String name, @RequestParam String surname) {

//		LOGGER.debug("Debug Message Logged !!!");
//      LOGGER.info("Info Message Logged !!!");
//      LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));

		if (!name.equals("") && !surname.equals("")) {
			try {
				InsertInicial(name, surname);
				return  new ModelAndView( "redirect:/");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return new ModelAndView( "redirect:/");
	}
	
	public void InsertInicial(String nombre, String apellido) throws IOException {

		TPersona p = new TPersona(i, nombre, apellido);

		this.cs.Save(p);
		i++;
	}
	
	
	@RequestMapping("/showUser")
	public String ShowUser() 
	{
		List<TPersona> lp = (List<TPersona>) this.cs.FindAll();
		String result = "";
		for (TPersona p1 : lp) {
			result += p1.getId() + " " + p1.getNombre() + " " + p1.getApellido() + "</br>";

		}
		return result;
	}

}
