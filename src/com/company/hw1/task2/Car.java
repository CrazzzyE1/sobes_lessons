package com.company.hw1.task2;

public abstract class Car {
    private Engine engine;
    private String color;
    private String name;

    public void start() {
        System.out.println("Car starting");
    }

    public abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
