package com.geekbrains.homework3;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> dataBase;


    public PhoneBook() {
        init();

    }

    public void init() {
        this.dataBase = new HashMap<>();
    }

    public void add(String name, String namberPhone) {
        if(!dataBase.containsKey(name)) {
            dataBase.put(name,new ArrayList<>(Arrays.asList(namberPhone)));
        } else {
            addNumberByKey(name,namberPhone);
        }

    }

    public void addNumberByKey(String name,String namberPhone){
        if(dataBase.containsKey(name)) {
            List<String> values = dataBase.get(name);
            values.add(namberPhone);
            dataBase.put(name,values);
        } else {
            throw new RuntimeException("no key with that name");
        }

    }

    public List<String> get(String name){
        if(!dataBase.containsKey(name)) {
            throw new RuntimeException("no key with that name");
        }
        return dataBase.get(name);
    }

    public void showAllPhoneBook(){
        Set<Map.Entry<String,List<String>>> setPhoneBook = dataBase.entrySet();
        for(Map.Entry<String,List<String>> entry: setPhoneBook) {
            System.out.println("name: " + entry.getKey() + " " + "numberPhone: " + entry.getValue());
        }
    }

    public Set<String> getNames(){
        Set<String> names = dataBase.keySet();
        return names;
    }
     public Collection<List<String>> getNumbersPhone() {
         return dataBase.values();
     }

}
