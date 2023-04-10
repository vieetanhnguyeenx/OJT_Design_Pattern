package com.example.singletron_design_pattern;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void sayHI() {
        System.out.println();
    }
}
