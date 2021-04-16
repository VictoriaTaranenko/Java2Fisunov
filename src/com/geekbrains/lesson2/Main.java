package com.geekbrains.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,-2,4,5,6,7,8};
        for(int i = 0; i <arr.length; i++) {
            if(arr[i] < 0) {
                try {
                    throw new NegativeElementException(i, arr[i]);
                } catch (NegativeElementException e) {
                    arr[e.getIndex()] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

