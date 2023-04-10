package com.example.prototype_design_pattern;

public class Rectangle extends Shape{
    public Rectangle() {
        super.setType("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
