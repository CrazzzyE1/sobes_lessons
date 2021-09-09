package com.company.hw1.task2;

public class Lorry extends Car implements Moveable, Stoppable {

    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    public void open() {
        System.out.println("Lorry is open");
    }
}
