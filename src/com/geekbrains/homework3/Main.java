package com.geekbrains.homework3;
/* 1. Создать массив с набором слов (10-20  слов, должны встречаться повторяющиеся). Найти и вывести список
      уникальных слов из которых состоит массив(дубликаты не считаем). Посчитать сколько раз встречается каждое слово. */



import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] util = {"Яблоко","Яблоко","Яблоко","Сыр","Сыр","Сыр","Сыр",
                "Говядина","Свинья","Свинья"};


        filterWordsByCounts(util);
    }

    private static void filterWordsByCounts(String[] util) {
        Map<String,Integer> mapUtil = new HashMap<>();//создадим мапу
        int one = 1;//переменная на которое будет увеличиваться value
        for(int i = 0; i < util.length; i++) {//перебираем массив слов
            if(mapUtil.containsKey(util[i])){//есть ли такой ключ в мапе еквалс этому слову
                //Map.Entry<String,Integer> entry = ("Яблоко, ? )
                Integer valueByKey = mapUtil.get(util[i]);//так как есть ключ, достаем его значение по ключу
                mapUtil.put(util[i],valueByKey + one);//кладем перетирая тот же ключ, и его старое значение + 1
            } else {
                mapUtil.put(util[i],one);//если нет такого ключа просто кладем пару ключ,значение(слово, 1)
            }
        }
        System.out.println(mapUtil);
    }
}
