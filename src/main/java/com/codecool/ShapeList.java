package com.codecool;

import java.util.ArrayList;

public class ShapeList {

    private ArrayList<Shape> shapes;


    public ShapeList() {
        this.shapes = new ArrayList<>();
    }

    public ShapeList(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public Shape getLargest() {
        int index = 0;
        for (int i = 1; i < shapes.size(); i++) {
            if (shapes.get(index).getArea() < shapes.get(i).getArea()) {
                index = i;
            }
        }
        return 0<shapes.size()?shapes.get(index):null;
    }

    public String compareArea(Shape a, Shape b) {
        if (a.getArea() < b.getArea()) {
            return b.Speak();
        } else if (b.getArea() < a.getArea()) {
            return a.Speak();
        }
        return "Equal areas";
    }
}
