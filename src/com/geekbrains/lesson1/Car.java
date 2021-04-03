package com.geekbrains.lesson1;

public class Car implements  Transport {
    private String model;
    private int speed;
    private boolean onTheWay;

    @Override
    public String getModel() {
        return model;
    }

//    public void setModel(String model) {
//        this.model = model;
//    }

//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
    @Override
    public boolean isOnTheWay() {
        return onTheWay;
    }

//    public void setOnTheWay(boolean onTheWay) {
//        this.onTheWay = onTheWay;
//    }

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    @Override
    public void move() {
        onTheWay = true;
    }
    @Override
    public void stop(){
        onTheWay = false;
    }
}
