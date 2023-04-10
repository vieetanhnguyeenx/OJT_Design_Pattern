package com.example.builder_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderDesignPatternApplication.class, args);
		Worker w = new Worker.Builder()
				.id(1)
				.name("NVA")
				.email("cuocdoi1@gmail.com")
				.address("Ha Noi").Build();
		System.out.println(w);
	}

}
