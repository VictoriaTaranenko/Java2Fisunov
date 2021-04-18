package com.geekbrains.homework2;

public class MyArrayDataException  extends RuntimeException{
    private int index;
    private int value;

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    public MyArrayDataException(int index, int value) {
        super("Был найден не верный элемент: " + value + " на позиции: " + index);
        this.index = index;
        this.value = value;
    }
}
