package com.example.abstract_factory_pattern;

public class Bread implements Product{
    @Override
    public void showInfo() {
        System.out.println("Bread ready to eat");
    }
}
