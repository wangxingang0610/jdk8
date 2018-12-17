package com.jdk.demo02;

public class Demo02_InnerClass {

    public static void main(String[] args) {
        method(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("makeFood...内部类实现。。。");
            }
        });
    }

    private static void method(Cook cook){
        cook.makeFood();
    }
}
