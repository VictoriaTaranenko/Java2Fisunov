package com.geekbrains.homework2;

public class MyArraySizeException extends RuntimeException {
   public MyArraySizeException(){
       super("Размер элемента должен быть [4*4] \n");
   }

}
