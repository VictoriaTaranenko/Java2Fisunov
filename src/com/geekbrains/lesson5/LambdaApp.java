package com.geekbrains.lesson5;

public class LambdaApp {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
//        лямбда выражения из этого примера
        Thread t2 = new Thread(()-> System.out.println(2));

        Thread t3 = new Thread(()->{
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        t.start();
        t2.start();
        t3.start();
    }
}
