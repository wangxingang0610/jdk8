package com.jdk.demo06;

public class Demo01_Lambda {

    public static void main(String[] args) {

        method( () -> System.out.println("makeFood...."));
    }

    private static void method(Cook cook){
        cook.makeFood();
    }
}
