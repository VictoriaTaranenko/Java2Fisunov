package com.geekbrains.lesson1;

public class Bicycle implements Transport{
    private String model;
    private int speed;
    private boolean busy;
    @Override
    public String getModel() {
        return model;
    }
    @Override
    public boolean isOnTheWay() {
        return busy;
    }

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    @Override
    public void move() {
        busy = true;
    }
    @Override
    public void stop(){
        busy = false;
    }
}
