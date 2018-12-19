package com.jdk.demo04;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class CalculatorLambdaTest {

    public static void main(String[] args) {

        method( (a, b) -> { return a + b ;});
    }

    private static void method(Calculator calc){

        int result = calc.sum(1,2);

        System.out.println(result);
    }
}
