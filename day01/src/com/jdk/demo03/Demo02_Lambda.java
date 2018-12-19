package com.jdk.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02_Lambda {

    public static void main(String[] args) {

        Person[] arrays = {
                new Person("刘备", 30),
                new Person("张飞", 25),
                new Person("张苞", 3),
                new Person("关羽", 27),
        };

        System.out.println(Arrays.toString(arrays));

        Arrays.sort(arrays,(Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        System.out.println("-------------------------------------排序后---------------------------------");

        System.out.println(Arrays.toString(arrays));
    }
}
