package com.geekbrains.lesson3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("Russia","Moscow");
        map.put("Germany","Berlin");
        map.put("France","Paris");
        map.put("Great Britain","London");
        System.out.println(map.get("Germany"));
        System.out.println(map.getOrDefault("France2","Unknown"));
        System.out.println(map); // какое последнее внесли, первым выводит

        Map<String,String> map1 = new LinkedHashMap<>();
        map1.put("Russia","Moscow");
        map1.put("Germany","Berlin");
        map1.put("France","Paris");
        map1.put("Great Britain","London");
        System.out.println(map1); // вносит сверху вниз

        Map<String,String> map2 = new TreeMap<>();
        map2.put("Russia","Moscow");
        map2.put("Germany","Berlin");
        map2.put("France","Paris");
        map2.put("Great Britain","London");
        System.out.println(map2); // сортирует по алфавиту
    }
}
