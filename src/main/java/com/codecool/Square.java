package com.codecool;

public class Square extends Shape{

    private int side;

    public Square(int side) {
        this.side = side;
        this.area = side * side;
    }

    @Override
    public String Speak() {
        return "I'm a square";
    }
}
