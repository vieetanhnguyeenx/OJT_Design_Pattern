package com.example.prototype_design_pattern;

public abstract class Shape implements Cloneable {

    private int id;
    private String type;

    public abstract void draw();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            return object = super.clone();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
