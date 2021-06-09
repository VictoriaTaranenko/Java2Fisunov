package com.geekbrains.lesson5;

public class Counter {
    private int x;
    public int value() {
        return x;
    }
//    public void inc() {
//        x++;
//    }
//    public void dec() {
//        x--;
        public synchronized void inc() {
            x++;
        }
        public synchronized void dec() {
            x--;
    }
}

