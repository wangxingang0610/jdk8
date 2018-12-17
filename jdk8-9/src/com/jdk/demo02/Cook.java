package com.jdk.demo02;

/**
 * lambda表达式的必要前提
 *  1. 必须有一个接口
 *  2.接口当中必须保证有且有个抽象方法
 */
public interface Cook {

    /*
     * 唯一的抽象方法
     */
    void makeFood();

}
