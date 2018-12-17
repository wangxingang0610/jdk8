package com.jdk.demo05;

import com.jdk.demo04.Calculator;

/**
 * Lambda表达式的省略规则：
 * 1.参数的类型可以省略，但是只能同时省略所有参数的类型，或者干脆都不省略，不能致谢个别参数的类型
 * 2.如果参数有且仅有一个，那么小括号可以省略
 * 3.如果大括号之内的语句有且仅有一个，那么无论有没有返回值，return、大括号和分好，都可以省略
 */
public class CalculatorLambdaFormat {

    public static void main(String[] args) {

        //1.method( ( int a,  int b) -> { return a + b ;});

        //2.method( ( a,  b) -> { return a + b ;});

        //3.method( (a , b) -> a + b);
        method( (a , b) -> a + b);
    }

    private static void method(Calculator calc){

        int result = calc.sum(1,2);

        System.out.println(result);
    }
}
