package com.jdk.demo06;

public class Demo02_Lambda {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("执行。。。");
        new Thread(runnable).start();
    }
}
