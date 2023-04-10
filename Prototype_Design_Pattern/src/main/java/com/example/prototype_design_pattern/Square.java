package com.example.prototype_design_pattern;

public class Square extends Shape {

    public Square() {
        super.setType("Square");
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
