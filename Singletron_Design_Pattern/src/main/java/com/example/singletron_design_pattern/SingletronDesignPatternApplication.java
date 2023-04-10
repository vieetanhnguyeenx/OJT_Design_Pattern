package com.example.singletron_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletronDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletronDesignPatternApplication.class, args);
		SingleObject s = SingleObject.getInstance();
		s.sayHI();
	}

}
