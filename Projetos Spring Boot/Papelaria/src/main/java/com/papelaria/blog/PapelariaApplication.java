package com.papelaria.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PapelariaApplication {
	
	//Inicializa a aplicação
	public static void main(String[] args) {
		SpringApplication.run(PapelariaApplication.class, args);
	}
}
