package com.geekbrains.lesson5;

public class Main2 {
    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();

        Thread incThread = new Thread(()-> {
            for(int i = 0; i < 10000; i++) {
                counter.inc();
            }
        });
        Thread decThread = new Thread(()-> {
            for(int i = 0; i < 10000; i++) {
                counter.dec();
            }
        });
        incThread.start();
        decThread.start();

        incThread.join();
        decThread.join();

        System.out.println(counter.value());
    }
}
