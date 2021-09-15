package com.company.hw3;

public class PingPongGame implements Runnable {
    private String value;

    public PingPongGame(String value) {
        this.value = value;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Main.lock) {
                System.out.println(value);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Main.lock.notify();

                try {
                    Main.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}