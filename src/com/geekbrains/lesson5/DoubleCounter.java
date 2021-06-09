package com.geekbrains.lesson5;

public class DoubleCounter {
    private int x;
    private int y;

    private Object monitorX;
    private Object monitorY;

    public DoubleCounter() {
        this.monitorX = new Object();
        this.monitorY = new Object();
    }

    public void incX() {
        synchronized (monitorX) {
            x++;
        }

    }

    public void incY() {
        synchronized (monitorY) {
            y++;
        }

    }
}
