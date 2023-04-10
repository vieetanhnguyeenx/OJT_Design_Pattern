package com.example.prototype_design_pattern;

public class Bread  implements Cloneable{
    public int id;
    public  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bread() {
    }

    public Bread(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Bread clone(){
        Bread b1 = null;
        try {
            return b1 = (Bread)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b1;
    }
}
