package com.jdk.demo09;


/**
 * 左边是接口类型，说明我并不关系到底是猫还是狗，只要是动物就行
 */
public class Demo01 {

    public static void main(String[] args) {

//        Animal animal = new Cat();
//        animal.eat();
//
//
//        Animal animal2 = new Dog();
//        animal2.eat();


        Animal animal = Animal.getAnimal();
        animal.eat();
    }
}
