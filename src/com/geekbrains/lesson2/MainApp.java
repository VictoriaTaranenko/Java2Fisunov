package com.geekbrains.lesson2;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("1.txt");
            out.write(65);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(out != null) {
                    out.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

//        или можно использовать такой код
//        try(FileOutputStream out = new FileOutputStream("2.txt")) {
//            out.write(65);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
