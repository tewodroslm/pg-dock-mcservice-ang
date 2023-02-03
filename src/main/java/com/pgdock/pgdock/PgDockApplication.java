package com.pgdock.pgdock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PgDockApplication {


	public static void main(String[] args) {
		System.setProperty("spring.config.name", "application-local");
		SpringApplication.run(PgDockApplication.class, args);
	}

}
