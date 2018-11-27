package com.projcarro.locacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LocacaoApplication {
	
	public static void main(String[] args) {
			SpringApplication.run(LocacaoApplication.class, args);
	}
}
