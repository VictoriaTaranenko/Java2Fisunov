package com.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int [5];
        System.out.println(Arrays.toString(arr));
        arr[0] = 10;
        arr[4] = 20;
        System.out.println(Arrays.toString(arr));

        int [] temp = new int[arr.length * 2];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr = temp;
        System.out.println(Arrays.toString(arr));

//        ArrayList

        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            al.add("A");
        }
        System.out.println(al);
        System.out.println(al.size());

        ArrayList<String> bl = new ArrayList<>();
        bl.add("A");
        bl.add("B");
        bl.add("C");
        System.out.println(bl);
        bl.add(0,"Z");
        bl.add("T");
        System.out.println(bl);
        bl.remove(3);
        System.out.println(bl);
        System.out.println(bl.size());
        System.out.println(bl.get(1));

        ArrayList<String> cl = new ArrayList<>();
        cl.add("A");
        cl.add("B");
        cl.add(0,"C");
        cl.add(1, "D");
        cl.add("E");
        cl.add("Q");
        cl.add("E");
        System.out.println(cl);
        cl.remove("E"); /* удалит прижнюю к началу */
        System.out.println(cl);

        ArrayList<Integer> vl = new ArrayList<>();
        vl.add(7);
        vl.add(6);
        vl.add(5);
        vl.add(4);
        vl.add(3);
        vl.add(2);
        System.out.println(vl);
        vl.remove(2);
        System.out.println(vl);
        vl.remove((Integer)2);
        System.out.println(vl);


        ArrayList<String> xl = new ArrayList<>();
        xl.add("A");
        xl.add("A");
        xl.add("A");
        xl.add("A");
        xl.add("B");
        xl.add("C");
        System.out.println(xl);
        xl.remove("A");
        System.out.println(xl);
        while (xl.remove("A"));
        System.out.println(xl);

        ArrayList <String> zl = new ArrayList<>();
        zl.add("A");
        zl.add("A");
        zl.add("A");
        zl.add("B");
        zl.add("C");

        ArrayList <String> blist = new ArrayList<>();
        blist.add("Z");
        blist.add("X");
        blist.add("Q");
        zl.addAll(blist);
        System.out.println(zl);
        zl.set(1, "K");
        System.out.println(zl);




    }
}
