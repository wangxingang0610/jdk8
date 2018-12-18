package com.jdk.demo08;

/**
 * 接口的实现类当中必须对接口所有的抽象方法都要覆盖重写，除非实现类是一个抽象类
 * 解扣子升级：本来是2个抽象方法，现在需要编程3个抽象方法
 *
 * 设计模式当中的开闭原则：对扩展开放，对修改关闭
 *
 * 从java8开始，接口当中允许定义default默认方法
 * 常量的修饰符：public static final （都可以省略）
 * 抽象方法的修饰符：public abstract （都可以省略）
 * 默认方法的修饰符：public default void（public可以省略，default不能省略）
 */
public interface MyInterface {

    void method1();

    void method2();

    //现在需要重新丁意思一个方法，子类MyInterfaceImplA、MyInterfaceImplB都需要实现
    //void methodNew();

    public default void methodNew(){
        System.out.println("");
    };

}
