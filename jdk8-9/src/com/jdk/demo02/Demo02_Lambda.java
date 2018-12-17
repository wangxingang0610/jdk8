package com.jdk.demo02;

public class Demo02_Lambda {

    public static void main(String[] args) {
       method(() -> System.out.println("makeFood... Lambda实现方式。。。"));
    }

    private static void method(Cook cook){
        cook.makeFood();
    }
}
