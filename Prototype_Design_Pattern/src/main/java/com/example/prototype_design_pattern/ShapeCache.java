package com.example.prototype_design_pattern;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ShapeCache {
    private  static Hashtable<Integer, Shape> cacheShape = new Hashtable<>();

    public static Shape getClone(int id) {
        Shape shape = cacheShape.get(id);
        return (Shape) shape.clone();
    }

    public static void loadData() {
        Rectangle r = new Rectangle();
        r.setId(1);
        cacheShape.put(r.getId(), r);

        Square s = new Square();
        s.setId(2);
        cacheShape.put(s.getId(), s);
    }
}
