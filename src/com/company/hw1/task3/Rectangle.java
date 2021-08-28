package com.company.hw1.task3;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int getSquare() {
        return width * height;
    }
}
