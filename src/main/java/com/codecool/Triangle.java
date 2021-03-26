package com.codecool;

public class Triangle extends Shape {

    int base;
    int baseHeight;

    public Triangle(int base, int baseHeight) {
        this.base = base;
        this.baseHeight = baseHeight;
        this.area = (base * baseHeight) / 2;
    }

    @Override
    public String Speak() {
        return "I'm a triangle";
    }
}
