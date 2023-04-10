package com.example.abstract_factory_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryPatternApplication.class, args);
        AbstractFactory foodFactory = FactoryProducer.getFactory("food");
        Product bread = foodFactory.getProduct("bread");
        bread.showInfo();
        Product jam = foodFactory.getProduct("Jam");
        jam.showInfo();

        foodFactory = FactoryProducer.getFactory("Drink");
        Product cola = foodFactory.getProduct("Cola");
        cola.showInfo();

        Product pesi = foodFactory.getProduct("Pesi");
        pesi.showInfo();
    }

}
