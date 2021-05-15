package com.geekbrains.homework3;

import java.util.Arrays;

public class MainPhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Jack","89047770101");
        phoneBook.add("Jack","89885550101");
        phoneBook.add("Sveta","89004441111");
        phoneBook.add("Vika","89116565654");
        phoneBook.add("Luda","89883339988");
         System.out.println(phoneBook);
         System.out.println();
         phoneBook.showAllPhoneBook();
         System.out.println("names: "  + phoneBook.getNames());
         System.out.println("numbers: "  + phoneBook.getNumbersPhone());



    }


}
