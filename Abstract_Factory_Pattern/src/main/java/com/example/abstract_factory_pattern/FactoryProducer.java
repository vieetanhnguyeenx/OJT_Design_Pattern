package com.example.abstract_factory_pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String category) {
        if(category.trim().isEmpty()) {
            return null;
        }
        if (category.trim().equalsIgnoreCase("food")) {
            return new FoodFactory();
        } else if (category.trim().equalsIgnoreCase("drink")) {
            return new DrinkFactory();
        }
        return null;
    }
}
