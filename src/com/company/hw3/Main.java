package com.company.hw3;

public class Main {
    public static final Object lock = new Object();

    public static void main(String[] args) {
        // task 1
        new Thread(new PingPongGame("Ping")).start();
        new Thread(new PingPongGame("Pong")).start();

        // task 2
        new Thread(new Counter("counter 1")).start();
        new Thread(new Counter("counter 2")).start();
    }
}
