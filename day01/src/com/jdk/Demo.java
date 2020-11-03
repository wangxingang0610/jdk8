package com.jdk;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
//        int num = 0;
//        Runnable r = () ->{
//            System.out.println(num);
//        };
//
//        new Thread(r).start();

//1
//2


        DoubleToIntFunction doubleToIntFunction = new DoubleToIntFunction() {
            @Override
            public int applyAsInt(double value) {
                return 0;
            }
        };


    }
}
