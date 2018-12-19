package com.jdk.demo02;

public class Demo01_UseImpl {
    public static void main(String[] args) {

        method(new CookImpl());
    }

    private static void method(Cook cook){
        cook.makeFood();
    }
}
