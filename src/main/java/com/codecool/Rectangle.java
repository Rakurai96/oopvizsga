package com.codecool;

public class Rectangle extends Shape{

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = sideA * sideB;
    }

    @Override
    public String Speak() {
        return "I'm a rectangle";
    }
}
