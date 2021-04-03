package com.geekbrains.lesson1;

public class Human {
   private String name;
   private Transport currentTransport;
//   private Car currentCar;
//   private Bicycle currentBicycle;
//   private Moto currentMoto;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Human(String name) {
        this.name = name;
    }

    public void ride(Transport transport) { //  человек может начать ехать на машине
        if (!transport.isOnTheWay()) {
            transport.move();
            currentTransport = transport;
            System.out.println(name + " поехал на  " + transport.getModel());
        }
    }

    public void stop(){
        if(currentTransport != null) {
            currentTransport.stop();
            System.out.println(name + " остановил  " + currentTransport.getModel());
            currentTransport = null;
        }

    }

}
