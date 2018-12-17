package com.jdk.demo05;

import com.jdk.demo04.Calculator;

public class CalculatorLambdaTest {

    public static void main(String[] args) {

        method( (a, b) -> { return a + b ;});
    }

    private static void method(Calculator calc){

        int result = calc.sum(1,2);

        System.out.println(result);
    }
}
