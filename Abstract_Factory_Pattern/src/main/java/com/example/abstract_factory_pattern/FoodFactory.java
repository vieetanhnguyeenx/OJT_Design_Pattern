package com.example.abstract_factory_pattern;

public class FoodFactory extends AbstractFactory{
    @Override
    public Product getProduct(String productName) {
        if (productName.trim().isEmpty()) {
            return null;
        }
        if (productName.trim().equalsIgnoreCase("Bread")) {
            return new Bread();
        } else if (productName.trim().equalsIgnoreCase("Jam")) {
            return new Jam();
        }
        return null;
    }
}
