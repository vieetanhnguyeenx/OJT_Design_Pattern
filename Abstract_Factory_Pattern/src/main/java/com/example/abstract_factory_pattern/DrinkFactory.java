package com.example.abstract_factory_pattern;

public class DrinkFactory extends AbstractFactory {
    @Override
    public Product getProduct(String productName) {
        if (productName.trim().isEmpty()) {
            return null;
        }
        if (productName.trim().equalsIgnoreCase("Cola")) {
            return new Cola();
        } else if (productName.trim().equalsIgnoreCase("Pesi"))  {
            return new Pesi();
        }
        return null;
    }
}
