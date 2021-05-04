package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

	@RequestMapping("/")
	public String Index() {
		return "<a href='/console'>haz click aqui para comenzar a introducir datos por la consola.</a>";
	}

	@RequestMapping("/console")
	public String InsertInicial() throws IOException {

		String respuesta = "s";
		int i = 0;
		boolean respuestaValida = true;
		while (respuesta.equals("s")) {
			System.out.println("Escribe el nombre del usuario");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String nombre = br.readLine();

			System.out.println("Indique el apellido");
			String apellido = br.readLine();

			TPersona p = new TPersona(i, nombre, apellido);

			this.cs.Save(p);
			i++;

			while (respuestaValida) {
				System.out.println("Quiere introducir algun usuario mas? s/n");
				respuesta = br.readLine();

				if (respuesta.equals("s") || respuesta.equals("n")) {
					respuestaValida = false;
				}
			}

			respuestaValida = true;

		}
		
		System.out.println("A continuacion se veran los usuarios por pantallas");

		List<TPersona> lp = (List<TPersona>) this.cs.FindAll();
		String result = "";
		for (TPersona p : lp) {
			result += p.getId() + " " + p.getNombre() + " " + p.getApellido() + "</br>";

		}
		return result;

	}
}
