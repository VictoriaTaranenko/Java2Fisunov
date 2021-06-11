package com.geekbrains.homework5;

import java.util.Arrays;

public class MyThread {

    static final int SIZE = 100;
    static final int HALF = SIZE / 2;



    public static void main(String[] args) {
//        oneArray();
        toArray();

    }

    public static void oneArray() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
            System.out.println(arr[i]);

        }
        long a = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i /5) * Math.cos(0.4f + i /2));
        }
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void toArray()  {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[SIZE - HALF];

        for(int i = 0; i < SIZE; i++) {
            arr[i] = 1;
            System.out.println(arr[i]);
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr,0,arr1,0,HALF);
        System.arraycopy(arr,HALF,arr2,0,SIZE - HALF);

        Thread t1 = new Thread(()-> {
            for(int i = 0; i < arr1.length; i++) {
                arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i /5) * Math.cos(0.4f + i /2));
                System.out.println(arr1[i]);
            }
        });
        Thread t2 = new Thread(()-> {
            for(int i = 0; i < arr2.length; i++) {
                arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i /5) * Math.cos(0.4f + i /2));
                System.out.println(arr2[i]);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1,0,arr,0,arr1.length);
        System.arraycopy(arr2,0,arr,HALF,arr2.length);

        System.out.println(System.currentTimeMillis() -a);


    }
}

