package com.example.prototype_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototypeDesignPatternApplication.class, args);
//		Bread b1 = new Bread(1, "cuoc doi");
//		Bread b2 = b1.clone();
//		b1.setName("Cuoc song");
//		System.out.println(b1.name);
//		System.out.println(b2.name);

		ShapeCache.loadData();
		Shape clonedShape = (Shape) ShapeCache.getClone(1);
		System.out.println("Shape : " + clonedShape.getType());

	}

}
