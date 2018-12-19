package com.jdk.demo11;

public class Demo01Printer {

    public static void main(String[] args) {

        //method( s -> System.out.println(s));

        method( System.out::println);
    }

    private static void method(Printer printer){
        printer.print("hello str...");
    }
}
