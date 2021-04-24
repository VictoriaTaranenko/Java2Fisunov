package com.geekbrains.lesson3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("C");

        System.out.println(set);

        // сортируем по длине

        TreeSet<String> set1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        set1.add("AAAA");
        set1.add("C");
        set1.add("DD");
        set1.add("ZZZZZZZZZZZZ");
        System.out.println(set1);

    }
}
