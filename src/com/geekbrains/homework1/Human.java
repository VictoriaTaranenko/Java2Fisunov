package com.geekbrains.homework1;


public class Human implements Person {
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean onDistance;
    public Human(String name) {
        this.name = name;
        this.maxRun = 5000;
        this.maxJump = 1000;
        this.onDistance = true;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public void run(int dist){
        if(dist <= maxRun){
            System.out.println( name + " пробежал ");
        } else {
            System.out.println( name + "  не пробежал ");
            onDistance = false;
        }




    }
    @Override
    public void jump(int height){
        if(height <= maxJump){
            System.out.println(name + " поднялся");
        } else {
            System.out.println(name + " не поднялся");
            onDistance = false;
        }


    }
    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
