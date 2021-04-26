package com.springTest.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*Se puede usar este archivo el sino el archivo de beans.xml con su configuración*/
@Configuration
public class AppConfig {

	@Bean
	public Mundo mundo() {
		return new Mundo();
	}

}
