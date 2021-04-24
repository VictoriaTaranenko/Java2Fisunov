package com.geekbrains.lesson3;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        System.out.println(ll.getLast());
        System.out.println(ll.getFirst());
        System.out.println(ll);

        List<String> names = getNames();
//        names.add("Jack");
        System.out.println(names);
    }
    public static List<String> getNames() {
        return Collections.unmodifiableList(new ArrayList<>(Arrays.asList("Bob","John")));

    }
}
