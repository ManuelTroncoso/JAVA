package com.springTest.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springTest.beans.AppConfig;
import com.springTest.beans.Ciudad;
import com.springTest.beans.Mundo;
import com.springTest.beans.Persona;

public class App {

	public static void main(String[] args) {

		// beans.xml

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springTest/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");
		// Otra forma de llamarlo
		// Mundo m = appContext.getBean(Mundo.class);

		// System.out.println(m.getSaludo());

		// end beans.xml

		// AppConfig.java
		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class);

		Mundo m2 = (Mundo) appContext2.getBean("mundo");
		// Mundo m2 = appContext.getBean(Mundo.class);

		// System.out.println(m2.getSaludo());
		// End AppConfig.java

		// PERSONAS

		Persona per = (Persona) appContext.getBean("persona");
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo());
		
		Persona per2 = (Persona) appContext.getBean("persona2");
		System.out.println(per2.getId() + " " + per2.getNombre() + " " + per2.getApodo());

		Persona per3 = (Persona) appContext.getBean("persona3");
		System.out.println(per3.getId() + " " + per3.getNombre() + " " + per3.getApodo());

		Persona per4 = (Persona) appContext.getBean("persona4");
		System.out.println(per4.getId() + " " + per4.getNombre() + " " + per4.getApodo());

		String nombreCiudades = "";

		Persona per5 = (Persona) appContext.getBean("persona5");

		for (Ciudad ciu : per5.getPais().getCiudades()) {
			nombreCiudades += ciu.getNombre() + "-";
		}

		System.out.println(per5.getId() + " " + per5.getNombre() + " " + per5.getApodo() + " "
				+ " " + per5.getPais().getNombre() + nombreCiudades);
		// END PERSONAS
		
		((ConfigurableApplicationContext)appContext).close();

	}

}
