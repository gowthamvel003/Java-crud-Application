package com.example.coc.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.example.coc.*")
@SpringBootApplication

public class ModelSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelSpringbootApplication.class, args);
	}	
}
