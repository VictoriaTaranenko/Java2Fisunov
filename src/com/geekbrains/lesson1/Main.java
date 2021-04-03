package com.geekbrains.lesson1;

public class Main {
    public static void main(String[] args) {
       Human human = new Human("Ira");
       Car car = new Car("Lada",80);
       Moto moto = new Moto("Zuzuki",70);
       Bicycle bicycle = new Bicycle("Djek",25);

       human.ride(car);
       human.stop();

        human.ride(moto);
        human.stop();

        human.ride(bicycle);
        human.stop();

    }
}
