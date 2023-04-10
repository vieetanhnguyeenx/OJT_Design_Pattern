package com.example.factory_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryDesignPatternApplication.class, args);

		EngineFactory engineFactory = new EngineFactory();

		VNEngine vn = (VNEngine) engineFactory.getEngine("VNEngine");
		vn.run();

		CNEngine cn = (CNEngine) engineFactory.getEngine("CNEngine");
		cn.run();

		LAEngine la = (LAEngine) engineFactory.getEngine("LAEngine");
		la.run();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         

	}

}
