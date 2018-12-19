package com.jdk.demo09;


/**
 * 从java8开始，接口当中允许定义静态方法：
 * 静态方法的修饰符：public static （public可以省略，static不能省略）
 */
public interface Animal {

    public void eat();

    public static Animal getAnimal(){

        return new Cat();
    }
}
