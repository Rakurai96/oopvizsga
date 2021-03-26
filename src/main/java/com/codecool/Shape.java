package com.codecool;

public abstract class Shape {

    protected int area;


    public Shape() {}

    public Shape(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public abstract String Speak();
}
