package com.company.hw3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {
    private static int count = 0;
    private static Lock lock = new ReentrantLock();
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                count++;
                System.out.println(name + ": " + count);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
