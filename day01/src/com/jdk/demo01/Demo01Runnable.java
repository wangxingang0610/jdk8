package com.jdk.demo01;

public class Demo01Runnable {
    public static void main(String[] args) {

        //匿名内部类对象
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程执行！！！");
            }
        };

        new Thread(runnable).start();






    }
}
