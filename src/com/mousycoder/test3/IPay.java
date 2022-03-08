package com.mousycoder.test3;

public interface IPay {

    // static修饰符定义静态⽅法
    static void staticMethod() {
        System.out.println("接⼝中的静态⽅法");
    }

    // default修饰符定义默认⽅法 ,默认⽅法不是抽象⽅法，可以不重写也可以重写
    default void defaultMethod() {
        System.out.println("接⼝中的默认⽅法");
    }

}