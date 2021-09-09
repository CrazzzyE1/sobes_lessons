package com.company.hw1.task3;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getSquare() {
        double halfPerimeter = getPerimeter() / 2;
        return (int) Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }
}
