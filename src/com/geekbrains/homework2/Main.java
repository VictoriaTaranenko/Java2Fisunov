package com.geekbrains.homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"},
                {"5", "6", "B", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        String[][] noCorrectArray = {{"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"}};

        try {
            method(arr);

        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }


    }

    public static void method(String[][] arr) {
        try {
            int t = 10;
            int res = t/0;
        } catch(ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println(arr.length + " " + arr[0].length);
        if (arr.length != 4 || arr[0].length != 4) {

            throw new MyArraySizeException();
        } else {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (Character.isLetter(Integer.parseInt(arr[i][j]))) {
                        throw new MyArrayDataException(i, j);
                    } else {
                        count += Integer.parseInt(arr[i][j]);
                    }
                }
                System.out.println(" Сумма " + count);
            }
        }
    }


}

