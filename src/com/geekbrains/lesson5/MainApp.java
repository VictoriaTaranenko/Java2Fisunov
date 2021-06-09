package com.geekbrains.lesson5;

public class MainApp {
    public static void main(String[] args) {
//        MyThread mt1 = new MyThread();
//        mt1.start();
//
//        for(int i = 0; i < 10; i++) {
//            try{
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
//        }
//        Thread t = new Thread (new MyRunnable());
//        t.start();

// Использование аннонимного внутреннего клааса
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 10; i++){
//                    System.out.println(i);
//                }
//            }
//        });
//        t.start();


// Как узнать в каком потоке я нахожусь
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                for(int i = 0; i < 10; i++) {
//                    System.out.println(i);
//                }
//            }
//        });
//        t.start();
//    System.out.println(Thread.currentThread().getName());

// Могут ли два потока параллельно медленно печатать и параллельно работать
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + " - " + i) ;
//                    try{
//                        Thread.sleep(200);
//                    }catch(InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + " - " + i) ;
//                    try{
//                        Thread.sleep(200);
//                    }catch(InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        t1.start();
//        t2.start();

// При запуске выводится хаотично
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(2);
//            }
//        });
//        t1.start();
//        t2.start();

// Запускаем потом а в конце метод main
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END");
    }

}
