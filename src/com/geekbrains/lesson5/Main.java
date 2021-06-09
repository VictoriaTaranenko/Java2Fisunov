package com.geekbrains.lesson5;

public class Main {
    private static int value = 0;
    public static void main(String[] args)  throws Exception {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                value++;
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                value--;
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(value);

    }
}
